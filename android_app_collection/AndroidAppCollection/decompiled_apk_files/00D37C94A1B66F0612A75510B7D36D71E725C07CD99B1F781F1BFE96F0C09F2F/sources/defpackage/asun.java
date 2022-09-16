package defpackage;
/* compiled from: PG */
/* renamed from: asun  reason: default package */
/* loaded from: classes2.dex */
public final class asun extends aopi implements aoqv {
    public static final asun a;
    private static volatile aorb f;
    public double b;
    public boolean c;
    public boolean d;
    public double e;
    private int g;

    static {
        asun asunVar = new asun();
        a = asunVar;
        aopi.registerDefaultInstance(asun.class, asunVar);
    }

    private asun() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001က\u0000\u0002ဇ\u0001\u0006ဇ\u0002\u0007က\u0006", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new asun();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asun.class) {
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
