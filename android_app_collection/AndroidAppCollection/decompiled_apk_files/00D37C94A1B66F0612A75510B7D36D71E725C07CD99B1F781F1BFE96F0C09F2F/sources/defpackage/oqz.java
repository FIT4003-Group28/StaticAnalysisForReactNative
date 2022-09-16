package defpackage;
/* compiled from: PG */
/* renamed from: oqz  reason: default package */
/* loaded from: classes4.dex */
public final class oqz extends aopi implements aoqv {
    public static final oqz a;
    private static volatile aorb f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        oqz oqzVar = new oqz();
        a = oqzVar;
        aopi.registerDefaultInstance(oqz.class, oqzVar);
    }

    private oqz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new oqz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (oqz.class) {
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
