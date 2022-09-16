package defpackage;
/* compiled from: PG */
/* renamed from: angu  reason: default package */
/* loaded from: classes.dex */
public final class angu extends aopi implements aoqv {
    public static final angu a;
    private static volatile aorb g;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    static {
        angu anguVar = new angu();
        a = anguVar;
        aopi.registerDefaultInstance(angu.class, anguVar);
    }

    private angu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", anfo.f, "d", "e", "f"});
            case 3:
                return new angu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (angu.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
