package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSystemToastActionOuterClass$ShowSystemToastAction extends aopi implements aoqv {
    public static final ShowSystemToastActionOuterClass$ShowSystemToastAction a;
    private static volatile aorb d;
    public static final aopg showSystemToastAction;
    public int b;
    public arag c;
    private byte e = 2;

    static {
        ShowSystemToastActionOuterClass$ShowSystemToastAction showSystemToastActionOuterClass$ShowSystemToastAction = new ShowSystemToastActionOuterClass$ShowSystemToastAction();
        a = showSystemToastActionOuterClass$ShowSystemToastAction;
        aopi.registerDefaultInstance(ShowSystemToastActionOuterClass$ShowSystemToastAction.class, showSystemToastActionOuterClass$ShowSystemToastAction);
        showSystemToastAction = aopi.newSingularGeneratedExtension(apzg.a, showSystemToastActionOuterClass$ShowSystemToastAction, showSystemToastActionOuterClass$ShowSystemToastAction, null, 173351111, aosj.MESSAGE, ShowSystemToastActionOuterClass$ShowSystemToastAction.class);
    }

    private ShowSystemToastActionOuterClass$ShowSystemToastAction() {
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
                return new ShowSystemToastActionOuterClass$ShowSystemToastAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShowSystemToastActionOuterClass$ShowSystemToastAction.class) {
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
