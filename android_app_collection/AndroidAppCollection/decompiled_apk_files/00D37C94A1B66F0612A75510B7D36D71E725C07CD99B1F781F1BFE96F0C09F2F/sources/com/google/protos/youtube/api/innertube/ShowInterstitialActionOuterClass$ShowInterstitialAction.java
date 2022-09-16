package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowInterstitialActionOuterClass$ShowInterstitialAction extends aopi implements aoqv {
    public static final ShowInterstitialActionOuterClass$ShowInterstitialAction a;
    private static volatile aorb d;
    public static final aopg showInterstitialAction;
    public auvi b;
    public boolean c;
    private int e;
    private byte f = 2;

    static {
        ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction = new ShowInterstitialActionOuterClass$ShowInterstitialAction();
        a = showInterstitialActionOuterClass$ShowInterstitialAction;
        aopi.registerDefaultInstance(ShowInterstitialActionOuterClass$ShowInterstitialAction.class, showInterstitialActionOuterClass$ShowInterstitialAction);
        showInterstitialAction = aopi.newSingularGeneratedExtension(apzg.a, showInterstitialActionOuterClass$ShowInterstitialAction, showInterstitialActionOuterClass$ShowInterstitialAction, null, 152165632, aosj.MESSAGE, ShowInterstitialActionOuterClass$ShowInterstitialAction.class);
    }

    private ShowInterstitialActionOuterClass$ShowInterstitialAction() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဇ\u0002", new Object[]{"e", "b", "c"});
            case 3:
                return new ShowInterstitialActionOuterClass$ShowInterstitialAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ShowInterstitialActionOuterClass$ShowInterstitialAction.class) {
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
