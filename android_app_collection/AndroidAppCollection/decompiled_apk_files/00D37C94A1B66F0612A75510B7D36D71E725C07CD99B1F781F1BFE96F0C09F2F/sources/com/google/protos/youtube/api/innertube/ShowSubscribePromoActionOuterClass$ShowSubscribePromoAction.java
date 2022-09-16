package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction extends aopi implements aoqv {
    public static final ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction a;
    private static volatile aorb c;
    public static final aopg showSubscribePromoAction;
    public String b = "";
    private int d;

    static {
        ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction showSubscribePromoActionOuterClass$ShowSubscribePromoAction = new ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction();
        a = showSubscribePromoActionOuterClass$ShowSubscribePromoAction;
        aopi.registerDefaultInstance(ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class, showSubscribePromoActionOuterClass$ShowSubscribePromoAction);
        showSubscribePromoAction = aopi.newSingularGeneratedExtension(apzg.a, showSubscribePromoActionOuterClass$ShowSubscribePromoAction, showSubscribePromoActionOuterClass$ShowSubscribePromoAction, null, 147359084, aosj.MESSAGE, ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class);
    }

    private ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.class) {
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
