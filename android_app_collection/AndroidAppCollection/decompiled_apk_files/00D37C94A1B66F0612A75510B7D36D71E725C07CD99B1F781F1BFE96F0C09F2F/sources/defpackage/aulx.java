package defpackage;
/* compiled from: PG */
/* renamed from: aulx  reason: default package */
/* loaded from: classes2.dex */
public final class aulx extends aopi implements aoqv {
    public static final aulx a;
    private static volatile aorb d;
    public int b;
    public aulw c;

    static {
        aulx aulxVar = new aulx();
        a = aulxVar;
        aopi.registerDefaultInstance(aulx.class, aulxVar);
    }

    private aulx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf143䝮\uf143䝮\u0001\u0000\u0000\u0000\uf143䝮ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aulx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aulx.class) {
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
