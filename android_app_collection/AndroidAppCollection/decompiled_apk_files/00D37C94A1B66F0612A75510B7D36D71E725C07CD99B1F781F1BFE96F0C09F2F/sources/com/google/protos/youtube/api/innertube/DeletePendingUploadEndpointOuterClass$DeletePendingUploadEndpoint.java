package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint extends aopi implements aoqv {
    public static final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint a;
    public static final aopg deletePendingUploadEndpoint;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = new DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint();
        a = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
        aopi.registerDefaultInstance(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint);
        deletePendingUploadEndpoint = aopi.newSingularGeneratedExtension(apzg.a, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, null, 66028866, aosj.MESSAGE, DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class);
    }

    private DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
