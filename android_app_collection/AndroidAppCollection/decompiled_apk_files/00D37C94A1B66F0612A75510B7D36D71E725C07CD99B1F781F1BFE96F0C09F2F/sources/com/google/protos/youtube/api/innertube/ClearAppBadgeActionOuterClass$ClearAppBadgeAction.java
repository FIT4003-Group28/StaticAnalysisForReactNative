package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearAppBadgeActionOuterClass$ClearAppBadgeAction extends aopi implements aoqv {
    public static final ClearAppBadgeActionOuterClass$ClearAppBadgeAction a;
    private static volatile aorb b;
    public static final aopg clearAppBadgeAction;

    static {
        ClearAppBadgeActionOuterClass$ClearAppBadgeAction clearAppBadgeActionOuterClass$ClearAppBadgeAction = new ClearAppBadgeActionOuterClass$ClearAppBadgeAction();
        a = clearAppBadgeActionOuterClass$ClearAppBadgeAction;
        aopi.registerDefaultInstance(ClearAppBadgeActionOuterClass$ClearAppBadgeAction.class, clearAppBadgeActionOuterClass$ClearAppBadgeAction);
        clearAppBadgeAction = aopi.newSingularGeneratedExtension(apzg.a, clearAppBadgeActionOuterClass$ClearAppBadgeAction, clearAppBadgeActionOuterClass$ClearAppBadgeAction, null, 106358471, aosj.MESSAGE, ClearAppBadgeActionOuterClass$ClearAppBadgeAction.class);
    }

    private ClearAppBadgeActionOuterClass$ClearAppBadgeAction() {
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
                return new ClearAppBadgeActionOuterClass$ClearAppBadgeAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ClearAppBadgeActionOuterClass$ClearAppBadgeAction.class) {
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
