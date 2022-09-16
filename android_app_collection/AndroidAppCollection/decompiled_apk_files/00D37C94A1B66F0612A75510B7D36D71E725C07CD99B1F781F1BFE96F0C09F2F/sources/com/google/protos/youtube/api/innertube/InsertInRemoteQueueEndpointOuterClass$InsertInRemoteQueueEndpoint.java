package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint extends aopi implements aoqv {
    public static final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint a;
    private static volatile aorb d;
    public static final aopg insertInRemoteQueueEndpoint;
    private int e;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
        a = insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint;
        aopi.registerDefaultInstance(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class, insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint);
        insertInRemoteQueueEndpoint = aopi.newSingularGeneratedExtension(apzg.a, insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint, insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint, null, 122330696, aosj.MESSAGE, InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class);
    }

    private InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class) {
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
