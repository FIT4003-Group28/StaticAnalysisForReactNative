package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction extends aopi implements aoqv {
    public static final RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction a;
    private static volatile aorb d;
    public static final aopg removeNotificationTrayItemAction;
    public String b = "";
    public int c;
    private int e;

    static {
        RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction = new RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction();
        a = removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction;
        aopi.registerDefaultInstance(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction);
        removeNotificationTrayItemAction = aopi.newSingularGeneratedExtension(apzg.a, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction, null, 99968691, aosj.MESSAGE, RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class);
    }

    private RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.class) {
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
