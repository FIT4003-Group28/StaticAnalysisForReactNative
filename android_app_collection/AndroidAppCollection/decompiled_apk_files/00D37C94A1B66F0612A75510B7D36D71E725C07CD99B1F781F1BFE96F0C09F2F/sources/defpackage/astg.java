package defpackage;
/* compiled from: PG */
/* renamed from: astg  reason: default package */
/* loaded from: classes2.dex */
public final class astg extends aopi implements aoqv {
    public static final astg a;
    private static volatile aorb e;
    public int b;
    public int c;
    public boolean d;

    static {
        astg astgVar = new astg();
        a = astgVar;
        aopi.registerDefaultInstance(astg.class, astgVar);
    }

    private astg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", asnz.n, "d"});
            case 3:
                return new astg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (astg.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
