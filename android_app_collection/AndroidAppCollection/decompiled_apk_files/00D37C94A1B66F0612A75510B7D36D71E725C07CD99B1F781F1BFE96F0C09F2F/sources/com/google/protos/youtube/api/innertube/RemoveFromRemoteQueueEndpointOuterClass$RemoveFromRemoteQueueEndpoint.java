package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint extends aopi implements aoqv {
    public static final RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint a;
    private static volatile aorb c;
    public static final aopg removeFromRemoteQueueEndpoint;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint = new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
        a = removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint;
        aopi.registerDefaultInstance(RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class, removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint);
        removeFromRemoteQueueEndpoint = aopi.newSingularGeneratedExtension(apzg.a, removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint, removeFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint, null, 64982798, aosj.MESSAGE, RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class);
    }

    private RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
