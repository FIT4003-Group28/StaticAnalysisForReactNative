package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer extends aopi implements aoqv {
    public static final UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer a;
    private static volatile aorb f;
    public static final aopg uploadProgressArrowRenderer;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = new UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer();
        a = uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
        aopi.registerDefaultInstance(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.class, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer);
        uploadProgressArrowRenderer = aopi.newSingularGeneratedExtension(aunb.a, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, null, 325110794, aosj.MESSAGE, UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.class);
    }

    private UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0002\u0000\u0002\b\u0007\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0001\u0005ြ\u0001\u0006ြ\u0000\u0007ြ\u0001\bြ\u0001", new Object[]{"c", "b", "e", "d", avuu.class, avut.class, avuu.class, avuv.class, avux.class, avux.class, avuw.class});
            case 3:
                return new UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.class) {
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
