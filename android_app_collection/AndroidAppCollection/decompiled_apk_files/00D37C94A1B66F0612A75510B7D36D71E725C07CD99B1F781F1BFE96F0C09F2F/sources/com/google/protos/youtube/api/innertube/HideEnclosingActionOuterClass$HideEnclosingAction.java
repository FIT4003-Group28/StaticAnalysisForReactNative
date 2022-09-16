package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class HideEnclosingActionOuterClass$HideEnclosingAction extends aopi implements aoqv {
    public static final HideEnclosingActionOuterClass$HideEnclosingAction a;
    private static volatile aorb b;
    public static final aopg hideEnclosingAction;

    static {
        HideEnclosingActionOuterClass$HideEnclosingAction hideEnclosingActionOuterClass$HideEnclosingAction = new HideEnclosingActionOuterClass$HideEnclosingAction();
        a = hideEnclosingActionOuterClass$HideEnclosingAction;
        aopi.registerDefaultInstance(HideEnclosingActionOuterClass$HideEnclosingAction.class, hideEnclosingActionOuterClass$HideEnclosingAction);
        hideEnclosingAction = aopi.newSingularGeneratedExtension(apzg.a, hideEnclosingActionOuterClass$HideEnclosingAction, hideEnclosingActionOuterClass$HideEnclosingAction, null, 77297742, aosj.MESSAGE, HideEnclosingActionOuterClass$HideEnclosingAction.class);
    }

    private HideEnclosingActionOuterClass$HideEnclosingAction() {
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
                return new HideEnclosingActionOuterClass$HideEnclosingAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (HideEnclosingActionOuterClass$HideEnclosingAction.class) {
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
