from TestCase import TestCase
from WasRun import WasRun

class TestCaseTest(TestCase):
    def testRunning(self):
        print("TestCaseTest.testRunning::")
        test=WasRun("testMethod")
        print(test.wasRun)
        assert(not test.wasRun)
        test.run()
        print(test.wasRun)
        assert(test.wasRun)
