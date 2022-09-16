package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction extends aopi implements aoqv {
    public static final UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction a;
    private static volatile aorb e;
    public static final aopg updateHorizontalCardListAction;
    public Object c;
    public avsx d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction = new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
        a = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
        aopi.registerDefaultInstance(UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction);
        updateHorizontalCardListAction = aopi.newSingularGeneratedExtension(apzg.a, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction, null, 139828682, aosj.MESSAGE, UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class);
    }

    private UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ျ\u0000\u0002ᐉ\u0002\u0003ျ\u0000", new Object[]{"c", "b", "f", "d"});
            case 3:
                return new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
