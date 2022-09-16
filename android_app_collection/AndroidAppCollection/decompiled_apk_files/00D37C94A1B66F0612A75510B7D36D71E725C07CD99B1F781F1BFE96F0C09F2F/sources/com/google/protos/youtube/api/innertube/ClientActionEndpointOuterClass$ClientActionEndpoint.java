package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClientActionEndpointOuterClass$ClientActionEndpoint extends aopi implements aoqv {
    public static final ClientActionEndpointOuterClass$ClientActionEndpoint a;
    public static final aopg clientActionEndpoint;
    private static volatile aorb d;
    public int b;
    public apvr c;

    static {
        ClientActionEndpointOuterClass$ClientActionEndpoint clientActionEndpointOuterClass$ClientActionEndpoint = new ClientActionEndpointOuterClass$ClientActionEndpoint();
        a = clientActionEndpointOuterClass$ClientActionEndpoint;
        aopi.registerDefaultInstance(ClientActionEndpointOuterClass$ClientActionEndpoint.class, clientActionEndpointOuterClass$ClientActionEndpoint);
        clientActionEndpoint = aopi.newSingularGeneratedExtension(apzg.a, clientActionEndpointOuterClass$ClientActionEndpoint, clientActionEndpointOuterClass$ClientActionEndpoint, null, 114390071, aosj.MESSAGE, ClientActionEndpointOuterClass$ClientActionEndpoint.class);
    }

    private ClientActionEndpointOuterClass$ClientActionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ClientActionEndpointOuterClass$ClientActionEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ClientActionEndpointOuterClass$ClientActionEndpoint.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
