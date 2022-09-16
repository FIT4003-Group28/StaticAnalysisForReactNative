package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer extends aopi implements aoqv {
    public static final AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer a;
    public static final aopg basicThumbnailCustomStyleRenderer;
    private static volatile aorb i;
    public int b;
    public Object d;
    public avhn e;
    public int f;
    public boolean g;
    public int h;
    public int c = 0;
    private byte j = 2;

    static {
        AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer = new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
        a = androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
        aopi.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer);
        basicThumbnailCustomStyleRenderer = aopi.newSingularGeneratedExtension(aunb.a, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer, androidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer, null, 179869979, aosj.MESSAGE, AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class);
    }

    private AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ှ\u0000\u0004ဌ\u0006\u0005ဇ\u0005\u0006်\u0000\u0007်\u0000", new Object[]{"d", "c", "b", "e", "f", atos.a(), "h", atdq.s, "g"});
            case 3:
                return new AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
