package defpackage;
/* compiled from: PG */
/* renamed from: attx  reason: default package */
/* loaded from: classes2.dex */
public final class attx extends aopi implements aoqv {
    public static final attx a;
    private static volatile aorb c;
    public aqwu b;
    private int d;

    static {
        attx attxVar = new attx();
        a = attxVar;
        aopi.registerDefaultInstance(attx.class, attxVar);
    }

    private attx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf6f3ᮒ\uf6f3ᮒ\u0001\u0000\u0000\u0000\uf6f3ᮒဉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new attx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (attx.class) {
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
