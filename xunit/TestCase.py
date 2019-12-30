class TestCase:
    def __init__(self, name):
        print("TestCase.__init__::")
        self.name=name

    def setUp(self):
        pass

    def run(self):
        print("TestCase.run::")
        self.setUp();
        method=getattr(self, self.name)
        method()
