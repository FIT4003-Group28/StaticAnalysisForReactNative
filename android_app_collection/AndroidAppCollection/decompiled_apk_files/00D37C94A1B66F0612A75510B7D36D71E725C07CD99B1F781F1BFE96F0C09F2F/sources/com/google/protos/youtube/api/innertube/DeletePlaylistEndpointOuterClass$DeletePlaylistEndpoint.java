package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint extends aopi implements aoqv {
    public static final DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint a;
    private static volatile aorb c;
    public static final aopg deletePlaylistEndpoint;
    public String b = "";
    private int d;

    static {
        DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint = new DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint();
        a = deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint;
        aopi.registerDefaultInstance(DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.class, deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint);
        deletePlaylistEndpoint = aopi.newSingularGeneratedExtension(apzg.a, deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint, deletePlaylistEndpointOuterClass$DeletePlaylistEndpoint, null, 64091098, aosj.MESSAGE, DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.class);
    }

    private DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.class) {
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
