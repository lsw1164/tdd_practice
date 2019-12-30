from TestCase import TestCase
from WasRun import WasRun

class TestCaseTest(TestCase):
    def setUp(self):
        self.test=WasRun("testMethod")

    def testRunning(self):
        print("TestCaseTest.testRunning::")
        test=WasRun("testMethod")
        print(test.wasRun)
        test.run()
        print(test.wasRun)
        assert(test.wasRun)

    def testSetUp(self):
        test=WasRun("testMethod")
        test.run()
        assert(test.wasSetUp)
