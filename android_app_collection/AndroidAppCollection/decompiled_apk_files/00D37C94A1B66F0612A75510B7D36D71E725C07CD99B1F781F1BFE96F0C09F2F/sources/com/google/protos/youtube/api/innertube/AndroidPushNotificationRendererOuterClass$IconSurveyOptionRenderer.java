package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer extends aopi implements aoqv {
    public static final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer a;
    private static volatile aorb f;
    public static final aopg iconSurveyOptionRenderer;
    public int b;
    public arhs c;
    public apzg d;
    public apzg e;
    private byte g = 2;

    static {
        AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
        a = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
        aopi.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer);
        iconSurveyOptionRenderer = aopi.newSingularGeneratedExtension(aunb.a, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer, androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer, null, 202680135, aosj.MESSAGE, AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class);
    }

    private AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.class) {
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
