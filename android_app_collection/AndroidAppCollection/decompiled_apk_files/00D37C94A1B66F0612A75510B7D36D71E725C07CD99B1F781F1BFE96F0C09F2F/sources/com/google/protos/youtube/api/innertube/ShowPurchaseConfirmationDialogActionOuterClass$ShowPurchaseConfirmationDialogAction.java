package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction extends aopi implements aoqv {
    public static final ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction a;
    private static volatile aorb b;
    public static final aopg showPurchaseConfirmationDialogAction;
    private int c;
    private auvn d;
    private byte e = 2;

    static {
        ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction = new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
        a = showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction;
        aopi.registerDefaultInstance(ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction);
        showPurchaseConfirmationDialogAction = aopi.newSingularGeneratedExtension(apzg.a, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction, null, 116405387, aosj.MESSAGE, ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class);
    }

    private ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class) {
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
