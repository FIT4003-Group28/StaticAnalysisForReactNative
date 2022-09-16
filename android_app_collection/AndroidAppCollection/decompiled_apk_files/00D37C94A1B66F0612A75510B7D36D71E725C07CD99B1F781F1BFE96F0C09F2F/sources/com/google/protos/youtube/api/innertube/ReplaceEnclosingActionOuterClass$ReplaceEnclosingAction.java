package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction extends aopi implements aoqv {
    public static final ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction a;
    private static volatile aorb d;
    public static final aopg replaceEnclosingAction;
    public int b;
    public aunk c;
    private byte e = 2;

    static {
        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
        a = replaceEnclosingActionOuterClass$ReplaceEnclosingAction;
        aopi.registerDefaultInstance(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class, replaceEnclosingActionOuterClass$ReplaceEnclosingAction);
        replaceEnclosingAction = aopi.newSingularGeneratedExtension(apzg.a, replaceEnclosingActionOuterClass$ReplaceEnclosingAction, replaceEnclosingActionOuterClass$ReplaceEnclosingAction, null, 77297283, aosj.MESSAGE, ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class);
    }

    private ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class) {
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
