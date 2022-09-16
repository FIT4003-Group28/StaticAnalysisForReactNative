package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction extends aopi implements aoqv {
    public static final ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction a;
    private static volatile aorb c;
    public static final aopg showChannelNotificationPreferenceDialogAction;
    public auuz b;
    private int d;
    private byte e = 2;

    static {
        ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction = new ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction();
        a = showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction;
        aopi.registerDefaultInstance(ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class, showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction);
        showChannelNotificationPreferenceDialogAction = aopi.newSingularGeneratedExtension(apzg.a, showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction, showChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction, null, 90188060, aosj.MESSAGE, ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class);
    }

    private ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.class) {
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
