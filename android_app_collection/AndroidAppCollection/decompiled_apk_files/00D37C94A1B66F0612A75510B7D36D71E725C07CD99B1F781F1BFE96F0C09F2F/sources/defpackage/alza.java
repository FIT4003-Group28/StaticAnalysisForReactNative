package defpackage;
/* compiled from: PG */
/* renamed from: alza  reason: default package */
/* loaded from: classes.dex */
public final class alza extends aopi implements aoqv {
    public static final alza a;
    private static volatile aorb c;
    public int b = 1;
    private int d;

    static {
        alza alzaVar = new alza();
        a = alzaVar;
        aopi.registerDefaultInstance(alza.class, alzaVar);
    }

    private alza() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0003", new Object[]{"d", "b", adzd.j});
            case 3:
                return new alza();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (alza.class) {
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
