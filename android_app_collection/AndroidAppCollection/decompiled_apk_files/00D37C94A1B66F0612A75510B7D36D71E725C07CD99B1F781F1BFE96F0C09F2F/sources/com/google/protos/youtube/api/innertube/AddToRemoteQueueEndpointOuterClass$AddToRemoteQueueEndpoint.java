package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint extends aopi implements aoqv {
    public static final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint a;
    public static final aopg addToRemoteQueueEndpoint;
    private static volatile aorb d;
    private int e;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
        a = addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint;
        aopi.registerDefaultInstance(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class, addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint);
        addToRemoteQueueEndpoint = aopi.newSingularGeneratedExtension(apzg.a, addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint, addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint, null, 76177954, aosj.MESSAGE, AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class);
    }

    private AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint() {
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
                return new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class) {
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
