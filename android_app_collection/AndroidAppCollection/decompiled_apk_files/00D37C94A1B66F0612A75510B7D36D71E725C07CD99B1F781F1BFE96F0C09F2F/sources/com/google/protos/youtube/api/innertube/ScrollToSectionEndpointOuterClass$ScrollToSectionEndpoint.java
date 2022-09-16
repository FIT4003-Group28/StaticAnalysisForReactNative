package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint extends aopi implements aoqv {
    public static final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint a;
    private static volatile aorb f;
    public static final aopg scrollToSectionEndpoint;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint = new ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint();
        a = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
        aopi.registerDefaultInstance(ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint);
        scrollToSectionEndpoint = aopi.newSingularGeneratedExtension(apzg.a, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint, null, 135727656, aosj.MESSAGE, ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class);
    }

    private ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
