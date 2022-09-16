package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeleteVideoEndpointOuterClass$DeleteVideoEndpoint extends aopi implements aoqv {
    public static final DeleteVideoEndpointOuterClass$DeleteVideoEndpoint a;
    private static volatile aorb d;
    public static final aopg deleteVideoEndpoint;
    public int b;
    public String c = "";

    static {
        DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = new DeleteVideoEndpointOuterClass$DeleteVideoEndpoint();
        a = deleteVideoEndpointOuterClass$DeleteVideoEndpoint;
        aopi.registerDefaultInstance(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class, deleteVideoEndpointOuterClass$DeleteVideoEndpoint);
        deleteVideoEndpoint = aopi.newSingularGeneratedExtension(apzg.a, deleteVideoEndpointOuterClass$DeleteVideoEndpoint, deleteVideoEndpointOuterClass$DeleteVideoEndpoint, null, 64157372, aosj.MESSAGE, DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class);
    }

    private DeleteVideoEndpointOuterClass$DeleteVideoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case 3:
                return new DeleteVideoEndpointOuterClass$DeleteVideoEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class) {
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
