package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction extends aopi implements aoqv {
    public static final RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction a;
    private static volatile aorb b;
    public static final aopg removeUnblockedContactAction;

    static {
        RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction = new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
        a = removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction;
        aopi.registerDefaultInstance(RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class, removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction);
        removeUnblockedContactAction = aopi.newSingularGeneratedExtension(apzg.a, removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction, removeUnblockedContactActionOuterClass$RemoveUnblockedContactAction, null, 125707981, aosj.MESSAGE, RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class);
    }

    private RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction() {
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
                return new RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.class) {
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
