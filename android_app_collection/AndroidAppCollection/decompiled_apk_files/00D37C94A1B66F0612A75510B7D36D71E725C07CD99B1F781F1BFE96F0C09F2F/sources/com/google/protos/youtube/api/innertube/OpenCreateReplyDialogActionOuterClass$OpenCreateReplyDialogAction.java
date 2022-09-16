package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction extends aopi implements aoqv {
    public static final OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction a;
    private static volatile aorb e;
    public static final aopg openCreateReplyDialogAction;
    public aqiu b;
    public apzm c;
    public apzm d;
    private int f;
    private byte g = 2;

    static {
        OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction = new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
        a = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction;
        aopi.registerDefaultInstance(OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction);
        openCreateReplyDialogAction = aopi.newSingularGeneratedExtension(apzg.a, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction, null, 145308295, aosj.MESSAGE, OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class);
    }

    private OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class) {
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
