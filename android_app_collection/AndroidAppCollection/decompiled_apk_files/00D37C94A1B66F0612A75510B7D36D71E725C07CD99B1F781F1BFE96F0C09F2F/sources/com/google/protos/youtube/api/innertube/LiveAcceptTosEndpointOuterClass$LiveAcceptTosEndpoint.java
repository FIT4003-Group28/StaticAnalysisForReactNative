package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint extends aopi implements aoqv {
    public static final LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint a;
    private static volatile aorb b;
    public static final aopg liveAcceptTosEndpoint;

    static {
        LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint = new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
        a = liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint;
        aopi.registerDefaultInstance(LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class, liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint);
        liveAcceptTosEndpoint = aopi.newSingularGeneratedExtension(apzg.a, liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint, liveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint, null, 129686418, aosj.MESSAGE, LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class);
    }

    private LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
