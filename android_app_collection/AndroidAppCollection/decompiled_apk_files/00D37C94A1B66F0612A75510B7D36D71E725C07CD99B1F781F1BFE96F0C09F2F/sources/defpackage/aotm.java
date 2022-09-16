package defpackage;
/* compiled from: PG */
/* renamed from: aotm */
/* loaded from: classes.dex */
public final class aotm extends aopi implements aoqv {
    public static final aotm a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public aopp e = emptyFloatList();
    public int f;

    static {
        aotm aotmVar = new aotm();
        a = aotmVar;
        aopi.registerDefaultInstance(aotm.class, aotmVar);
    }

    private aotm() {
    }

    public static /* synthetic */ void a(aotm aotmVar) {
        aotmVar.b |= 1;
        aotmVar.c = 3;
    }

    public static /* synthetic */ void b(aotm aotmVar) {
        aotmVar.b |= 2;
        aotmVar.d = 3;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003$\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", "f", aoli.u});
            case 3:
                return new aotm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aotm.class) {
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
