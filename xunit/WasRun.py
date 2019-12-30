from TestCase import TestCase

class WasRun(TestCase):
    def __init__(self, name):
        print("WasRun.__init__::")
        self.wasRun=None
        TestCase.__init__(self, name)

    def testMethod(self):
        print("WasRun.testMethod::")
        self.wasRun=1

    def setUp(self):
        self.wasRun=None
        self.wasSetUp=1
