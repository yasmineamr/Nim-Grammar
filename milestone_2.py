import argparse
from antlr4 import *
from new_milestoneLexer import new_milestoneLexer
from new_milestoneListener import new_milestoneListener
from new_milestoneParser import new_milestoneParser
from antlr4.tree.Trees import Trees

# import antlrGeneratedLexer

def get_token_names():
    token_names = {}
    for name, value in new_milestoneLexer.__dict__.items():
        if isinstance(value, int) and name == name.upper():
            token_names[value] = name

    return token_names

def main():
    with open(args.file, "r") as file:
        lines = file.read()
    input_stream = InputStream(lines)
    # input_stream = FileStream(args.file)    
    lexer = new_milestoneLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = new_milestoneParser(token_stream)
    tree = parser.module() #start from the parser rule, however should be changed to your entry rule for your specific grammar.
    print(Trees.toStringTree(tree, None, parser))
    # for child in tree.getChildren():
        # print(child.getText())
    # printer = new_milestoneListener(tree,input_stream)
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)

    # token_names = get_token_names()
    # output = ""

    # token = lexer.nextToken()
    # # print(token.type)
    # while not token.type == Token.EOF:
    #     # print(token)
    #     output += token_names[token.type] + '  ' + token.text + '\n'
    #     token = lexer.nextToken()
    #     # print(token.type)


    # result = open("new_milestone_result.txt", "w")
    # result.write(output)
    # result.close()

if __name__ == '__main__':
    parser = argparse.ArgumentParser(add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store", help="path of file to take as input", nargs="?", metavar="file")

    args = parser.parse_args()

    print(args.file)

    main()
