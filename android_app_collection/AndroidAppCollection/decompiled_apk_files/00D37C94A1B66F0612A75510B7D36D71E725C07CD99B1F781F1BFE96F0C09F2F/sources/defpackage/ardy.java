package defpackage;
/* compiled from: PG */
/* renamed from: ardy */
/* loaded from: classes2.dex */
public final class ardy extends aopi implements aoqv {
    private static final ardy a;
    private static volatile aorb b;
    private int c;
    private int d;

    static {
        ardy ardyVar = new ardy();
        a = ardyVar;
        aopi.registerDefaultInstance(ardy.class, ardyVar);
    }

    private ardy() {
    }

    public static ardx a() {
        return (ardx) a.createBuilder();
    }

    public static /* synthetic */ void c(ardy ardyVar, ardw ardwVar) {
        ardyVar.d(ardwVar);
    }

    public void d(ardw ardwVar) {
        this.d = ardwVar.f;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", ardw.a()});
            case 3:
                return new ardy();
            case 4:
                return new ardx();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ardy.class) {
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
