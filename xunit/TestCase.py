class TestCase:
    def __init__(self, name):
        print("TestCase.__init__::")
        self.name=name

    def run(self):
        print("TestCase.run::")
        method=getattr(self, self.name)
        method()
