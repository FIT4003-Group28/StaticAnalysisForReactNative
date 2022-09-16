package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction extends aopi implements aoqv {
    public static final UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction a;
    private static volatile aorb f;
    public static final aopg updateToggleButtonTextAction;
    public int b;
    public arag c;
    public arag d;
    public int e;
    private byte g = 2;

    static {
        UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction = new UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction();
        a = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction;
        aopi.registerDefaultInstance(UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class, updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction);
        updateToggleButtonTextAction = aopi.newSingularGeneratedExtension(apzg.a, updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction, updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction, null, 136527603, aosj.MESSAGE, UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class);
    }

    private UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e", avge.h});
            case 3:
                return new UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class) {
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
