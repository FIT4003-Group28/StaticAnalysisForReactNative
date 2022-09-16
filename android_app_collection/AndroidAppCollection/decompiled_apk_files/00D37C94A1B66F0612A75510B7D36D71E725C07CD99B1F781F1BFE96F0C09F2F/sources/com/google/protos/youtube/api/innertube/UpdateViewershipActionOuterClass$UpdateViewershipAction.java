package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateViewershipActionOuterClass$UpdateViewershipAction extends aopi implements aoqv {
    public static final UpdateViewershipActionOuterClass$UpdateViewershipAction a;
    private static volatile aorb d;
    public static final aopg updateViewershipAction;
    public avzm b;
    public boolean c;
    private int e;
    private awag f;
    private byte g = 2;

    static {
        UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction = new UpdateViewershipActionOuterClass$UpdateViewershipAction();
        a = updateViewershipActionOuterClass$UpdateViewershipAction;
        aopi.registerDefaultInstance(UpdateViewershipActionOuterClass$UpdateViewershipAction.class, updateViewershipActionOuterClass$UpdateViewershipAction);
        updateViewershipAction = aopi.newSingularGeneratedExtension(apzg.a, updateViewershipActionOuterClass$UpdateViewershipAction, updateViewershipActionOuterClass$UpdateViewershipAction, null, 104886333, aosj.MESSAGE, UpdateViewershipActionOuterClass$UpdateViewershipAction.class);
    }

    private UpdateViewershipActionOuterClass$UpdateViewershipAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0002\u0003ᐉ\u0001", new Object[]{"e", "b", "c", "f"});
            case 3:
                return new UpdateViewershipActionOuterClass$UpdateViewershipAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (UpdateViewershipActionOuterClass$UpdateViewershipAction.class) {
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
