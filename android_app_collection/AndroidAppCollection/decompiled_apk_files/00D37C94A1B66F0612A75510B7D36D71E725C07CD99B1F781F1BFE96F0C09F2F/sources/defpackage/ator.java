package defpackage;
/* compiled from: PG */
/* renamed from: ator  reason: default package */
/* loaded from: classes2.dex */
public final class ator extends aopi implements aoqv {
    public static final ator a;
    private static volatile aorb f;
    public int b;
    public boolean c;
    public long d;
    public boolean e;

    static {
        ator atorVar = new ator();
        a = atorVar;
        aopi.registerDefaultInstance(ator.class, atorVar);
    }

    private ator() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ator();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ator.class) {
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
