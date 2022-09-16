package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoSelectedActionOuterClass$VideoSelectedAction extends aopi implements aoqv {
    public static final VideoSelectedActionOuterClass$VideoSelectedAction a;
    private static volatile aorb f;
    public static final aopg videoSelectedAction;
    public boolean c;
    public aqfs d;
    public aunb e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction = new VideoSelectedActionOuterClass$VideoSelectedAction();
        a = videoSelectedActionOuterClass$VideoSelectedAction;
        aopi.registerDefaultInstance(VideoSelectedActionOuterClass$VideoSelectedAction.class, videoSelectedActionOuterClass$VideoSelectedAction);
        videoSelectedAction = aopi.newSingularGeneratedExtension(apzg.a, videoSelectedActionOuterClass$VideoSelectedAction, videoSelectedActionOuterClass$VideoSelectedAction, null, 154342739, aosj.MESSAGE, VideoSelectedActionOuterClass$VideoSelectedAction.class);
    }

    private VideoSelectedActionOuterClass$VideoSelectedAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0003\u0003ဇ\u0001\u0004ᐉ\u0002", new Object[]{"g", "b", "e", "c", "d"});
            case 3:
                return new VideoSelectedActionOuterClass$VideoSelectedAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (VideoSelectedActionOuterClass$VideoSelectedAction.class) {
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
