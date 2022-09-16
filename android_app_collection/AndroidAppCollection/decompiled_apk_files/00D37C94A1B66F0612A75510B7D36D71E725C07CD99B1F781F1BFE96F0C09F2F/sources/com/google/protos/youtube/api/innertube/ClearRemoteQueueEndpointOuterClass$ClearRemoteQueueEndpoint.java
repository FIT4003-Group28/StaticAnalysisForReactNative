package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint extends aopi implements aoqv {
    public static final ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint a;
    private static volatile aorb b;
    public static final aopg clearRemoteQueueEndpoint;
    private byte c = 2;

    static {
        ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint = new ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint();
        a = clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint;
        aopi.registerDefaultInstance(ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint.class, clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint);
        clearRemoteQueueEndpoint = aopi.newSingularGeneratedExtension(apzg.a, clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint, clearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint, null, 85732730, aosj.MESSAGE, ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint.class);
    }

    private ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint.class) {
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
