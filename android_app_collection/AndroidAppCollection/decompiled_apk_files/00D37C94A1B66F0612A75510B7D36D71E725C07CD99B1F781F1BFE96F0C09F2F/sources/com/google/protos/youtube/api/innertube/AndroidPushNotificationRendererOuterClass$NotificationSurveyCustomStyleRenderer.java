package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer extends aopi implements aoqv {
    public static final AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer a;
    private static volatile aorb c;
    public static final aopg notificationSurveyCustomStyleRenderer;
    private byte d = 2;
    public aopu b = emptyProtobufList();

    static {
        AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer = new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
        a = androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
        aopi.registerDefaultInstance(AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class, androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer);
        notificationSurveyCustomStyleRenderer = aopi.newSingularGeneratedExtension(aunb.a, androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer, androidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer, null, 195330824, aosj.MESSAGE, AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class);
    }

    private AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"b", aunb.class});
            case 3:
                return new AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
