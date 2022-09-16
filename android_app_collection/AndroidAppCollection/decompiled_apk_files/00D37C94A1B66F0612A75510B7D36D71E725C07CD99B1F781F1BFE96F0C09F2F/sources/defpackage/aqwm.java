package defpackage;
/* compiled from: PG */
/* renamed from: aqwm  reason: default package */
/* loaded from: classes2.dex */
public final class aqwm extends aopi implements aoqv {
    public static final aqwm a;
    private static volatile aorb d;
    public int b;
    public boolean c;

    static {
        aqwm aqwmVar = new aqwm();
        a = aqwmVar;
        aopi.registerDefaultInstance(aqwm.class, aqwmVar);
    }

    private aqwm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqwm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqwm.class) {
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
