package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint extends aopi implements aoqv {
    public static final RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint a;
    private static volatile aorb b;
    public static final aopg requestVerificationCodeEndpoint;

    static {
        RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint = new RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint();
        a = requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint;
        aopi.registerDefaultInstance(RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class, requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint);
        requestVerificationCodeEndpoint = aopi.newSingularGeneratedExtension(apzg.a, requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint, requestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint, null, 130003709, aosj.MESSAGE, RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class);
    }

    private RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint() {
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
                return new RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class) {
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
