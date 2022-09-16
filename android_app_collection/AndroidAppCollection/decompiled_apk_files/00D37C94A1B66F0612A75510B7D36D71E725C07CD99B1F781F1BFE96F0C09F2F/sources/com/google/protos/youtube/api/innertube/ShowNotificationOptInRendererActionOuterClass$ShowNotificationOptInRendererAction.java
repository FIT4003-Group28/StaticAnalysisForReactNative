package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction extends aopi implements aoqv {
    public static final ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction a;
    private static volatile aorb b;
    public static final aopg showNotificationOptInRendererAction;

    static {
        ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction = new ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction();
        a = showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction;
        aopi.registerDefaultInstance(ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class, showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction);
        showNotificationOptInRendererAction = aopi.newSingularGeneratedExtension(apzg.a, showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction, showNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction, null, 135114359, aosj.MESSAGE, ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class);
    }

    private ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
