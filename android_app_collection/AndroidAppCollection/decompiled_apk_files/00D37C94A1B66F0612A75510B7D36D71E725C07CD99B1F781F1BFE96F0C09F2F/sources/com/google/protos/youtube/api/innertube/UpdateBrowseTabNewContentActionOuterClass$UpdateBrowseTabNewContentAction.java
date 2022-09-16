package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction extends aopi implements aoqv {
    public static final UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction a;
    private static volatile aorb h;
    public static final aopg updateBrowseTabNewContentAction;
    public int b;
    public avfp d;
    public atxj e;
    public long f;
    public int g;
    private byte i = 2;
    public String c = "";

    static {
        UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction = new UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction();
        a = updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction;
        aopi.registerDefaultInstance(UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class, updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction);
        updateBrowseTabNewContentAction = aopi.newSingularGeneratedExtension(apzg.a, updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction, updateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction, null, 102200546, aosj.MESSAGE, UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class);
    }

    private UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
