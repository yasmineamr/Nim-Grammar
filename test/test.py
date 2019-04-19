import argparse
from antlr4 import *
from testLexer import testLexer
from testListener import testListener
from testParser import testParser
from antlr4.tree.Trees import Trees

# import antlrGeneratedLexer

def get_token_names():
    token_names = {}
    for name, value in testLexer.__dict__.items():
        if isinstance(value, int) and name == name.upper():
            token_names[value] = name

    return token_names

def main():
    with open(args.file, "r") as file:
        lines = file.read()
    input_stream = InputStream(lines)
    # input_stream = FileStream(args.file)    
    lexer = testLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = testParser(token_stream)
    tree = parser.module() 
    print(Trees.toStringTree(tree, None, parser))
    # for child in tree.getChildren():
        # print(child.getText())
    # printer = testListener(tree,input_stream)
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)


if __name__ == '__main__':
    parser = argparse.ArgumentParser(add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store", help="path of file to take as input", nargs="?", metavar="file")

    args = parser.parse_args()

    main()
