from TestCase import TestCase
from WasRun import WasRun

class TestCaseTest(TestCase):
    def setUp(self):
        self.test=WasRun("testMethod")

    def testTemplateMethod(self):
        test=WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)

    def testFailedResult(self):
        test=WasRun("testBrokenMethod")
        result=test.run()
        assert("1 run, 1 failed" == result.summary())
