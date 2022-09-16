package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint extends aopi implements aoqv {
    public static final CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint a;
    private static volatile aorb b;
    public static final aopg createBroadcastEndpoint;

    static {
        CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint createBroadcastEndpointOuterClass$CreateBroadcastEndpoint = new CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint();
        a = createBroadcastEndpointOuterClass$CreateBroadcastEndpoint;
        aopi.registerDefaultInstance(CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.class, createBroadcastEndpointOuterClass$CreateBroadcastEndpoint);
        createBroadcastEndpoint = aopi.newSingularGeneratedExtension(apzg.a, createBroadcastEndpointOuterClass$CreateBroadcastEndpoint, createBroadcastEndpointOuterClass$CreateBroadcastEndpoint, null, 145708817, aosj.MESSAGE, CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.class);
    }

    private CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint() {
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
                return new CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.class) {
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
