package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction extends aopi implements aoqv {
    public static final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction a;
    private static volatile aorb f;
    public static final aopg updateBackstagePollAction;
    public int b;
    public int c;
    public arag d;
    public int e;
    private byte g = 2;

    static {
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction = new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
        a = updateBackstagePollActionOuterClass$UpdateBackstagePollAction;
        aopi.registerDefaultInstance(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class, updateBackstagePollActionOuterClass$UpdateBackstagePollAction);
        updateBackstagePollAction = aopi.newSingularGeneratedExtension(apzg.a, updateBackstagePollActionOuterClass$UpdateBackstagePollAction, updateBackstagePollActionOuterClass$UpdateBackstagePollAction, null, 139609360, aosj.MESSAGE, UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class);
    }

    private UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0001\u0002ᐉ\u0002\u0003င\u0003", new Object[]{"b", "c", aqal.a(), "d", "e"});
            case 3:
                return new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
