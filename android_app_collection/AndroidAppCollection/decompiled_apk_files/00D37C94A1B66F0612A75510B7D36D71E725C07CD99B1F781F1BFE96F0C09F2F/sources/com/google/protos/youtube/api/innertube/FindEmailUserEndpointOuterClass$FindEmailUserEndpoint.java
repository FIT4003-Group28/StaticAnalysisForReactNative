package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FindEmailUserEndpointOuterClass$FindEmailUserEndpoint extends aopi implements aoqv {
    public static final FindEmailUserEndpointOuterClass$FindEmailUserEndpoint a;
    private static volatile aorb b;
    public static final aopg findEmailUserEndpoint;

    static {
        FindEmailUserEndpointOuterClass$FindEmailUserEndpoint findEmailUserEndpointOuterClass$FindEmailUserEndpoint = new FindEmailUserEndpointOuterClass$FindEmailUserEndpoint();
        a = findEmailUserEndpointOuterClass$FindEmailUserEndpoint;
        aopi.registerDefaultInstance(FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.class, findEmailUserEndpointOuterClass$FindEmailUserEndpoint);
        findEmailUserEndpoint = aopi.newSingularGeneratedExtension(apzg.a, findEmailUserEndpointOuterClass$FindEmailUserEndpoint, findEmailUserEndpointOuterClass$FindEmailUserEndpoint, null, 163917887, aosj.MESSAGE, FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.class);
    }

    private FindEmailUserEndpointOuterClass$FindEmailUserEndpoint() {
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
                return new FindEmailUserEndpointOuterClass$FindEmailUserEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.class) {
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
