package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowContentPillActionOuterClass$ShowContentPillAction extends aopi implements aoqv {
    public static final ShowContentPillActionOuterClass$ShowContentPillAction a;
    private static volatile aorb c;
    public static final aopg showContentPillAction;
    public auva b;
    private int d;
    private byte e = 2;

    static {
        ShowContentPillActionOuterClass$ShowContentPillAction showContentPillActionOuterClass$ShowContentPillAction = new ShowContentPillActionOuterClass$ShowContentPillAction();
        a = showContentPillActionOuterClass$ShowContentPillAction;
        aopi.registerDefaultInstance(ShowContentPillActionOuterClass$ShowContentPillAction.class, showContentPillActionOuterClass$ShowContentPillAction);
        showContentPillAction = aopi.newSingularGeneratedExtension(apzg.a, showContentPillActionOuterClass$ShowContentPillAction, showContentPillActionOuterClass$ShowContentPillAction, null, 135486026, aosj.MESSAGE, ShowContentPillActionOuterClass$ShowContentPillAction.class);
    }

    private ShowContentPillActionOuterClass$ShowContentPillAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ShowContentPillActionOuterClass$ShowContentPillAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ShowContentPillActionOuterClass$ShowContentPillAction.class) {
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
