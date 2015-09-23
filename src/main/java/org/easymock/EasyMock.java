package org.easymock;

import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

public class EasyMock {

    public static <T> T mock(Class<T> target) {
        return Mockito.mock(target);
    }

    public static <T> T mockNice(Class<T> clazz) {
        return mock(clazz);
    }

    public static void replay() {
    }

    public static void replay(Object classToTest) {
    }

    public static void verify() {
    }

    public static void verify(Object vreify) {
    }

    public static void expectLastCall(){}

    public static<T>  T anyObject(Class<T> clazz){
        return Mockito.any(clazz);
    }

    public static <T> MockitoConverter expect(T value) {
        return new MockitoConverter(Mockito.when(value));
    }

    public static <T> T createMock(Class<T> clazz) {
        return Mockito.mock(clazz);
    }

    public static <T> T createNiceMock(Class<T> clazz) {
        return Mockito.mock(clazz);
    }

    public static <T> T isA(Class<T> thing){
        return Mockito.isA(thing);
    }

    public static void replay(Object... things){}
    public static void verify(Object... things){}

    public static void reset(Object[] mockObjects) {

    }

    public static class MockitoConverter<T> {
        private final OngoingStubbing<T> when;

        public MockitoConverter(OngoingStubbing<T> when) {
            this.when = when;
        }

        public MockitoStubber<T> andReturn(T toreturn){
            return new MockitoStubber(when.thenReturn(toreturn));
        }

    }

    public static class MockitoStubber<T>  {
        private final OngoingStubbing<T> tOngoingStubbing;

        public MockitoStubber(OngoingStubbing<T> tOngoingStubbing) {
            this.tOngoingStubbing = tOngoingStubbing;
        }

        public void anyTimes() {

        }

        public void times(int i) {

        }
    }


}
