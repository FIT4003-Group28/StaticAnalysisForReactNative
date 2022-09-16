package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction extends aopi implements aoqv {
    public static final ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction a;
    public static final aopg clearPersistentCacheAction;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction clearPersistentCacheActionOuterClass$ClearPersistentCacheAction = new ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction();
        a = clearPersistentCacheActionOuterClass$ClearPersistentCacheAction;
        aopi.registerDefaultInstance(ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction);
        clearPersistentCacheAction = aopi.newSingularGeneratedExtension(apzg.a, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction, null, 166864056, aosj.MESSAGE, ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class);
    }

    private ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002်\u0000", new Object[]{"c", "b"});
            case 3:
                return new ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class) {
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
