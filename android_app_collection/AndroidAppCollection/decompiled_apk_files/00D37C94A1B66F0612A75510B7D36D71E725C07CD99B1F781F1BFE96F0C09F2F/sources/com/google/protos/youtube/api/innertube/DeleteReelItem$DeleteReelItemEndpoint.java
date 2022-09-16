package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeleteReelItem$DeleteReelItemEndpoint extends aopi implements aoqv {
    public static final DeleteReelItem$DeleteReelItemEndpoint a;
    private static volatile aorb d;
    public static final aopg deleteReelItemEndpoint;
    public String b = "";
    public String c = "";
    private int e;

    static {
        DeleteReelItem$DeleteReelItemEndpoint deleteReelItem$DeleteReelItemEndpoint = new DeleteReelItem$DeleteReelItemEndpoint();
        a = deleteReelItem$DeleteReelItemEndpoint;
        aopi.registerDefaultInstance(DeleteReelItem$DeleteReelItemEndpoint.class, deleteReelItem$DeleteReelItemEndpoint);
        deleteReelItemEndpoint = aopi.newSingularGeneratedExtension(apzg.a, deleteReelItem$DeleteReelItemEndpoint, deleteReelItem$DeleteReelItemEndpoint, null, 152328454, aosj.MESSAGE, DeleteReelItem$DeleteReelItemEndpoint.class);
    }

    private DeleteReelItem$DeleteReelItemEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new DeleteReelItem$DeleteReelItemEndpoint();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (DeleteReelItem$DeleteReelItemEndpoint.class) {
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
