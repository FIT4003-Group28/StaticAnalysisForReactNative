package defpackage;
/* compiled from: PG */
/* renamed from: arqs  reason: default package */
/* loaded from: classes2.dex */
public final class arqs extends aopi implements aoqv {
    public static final arqs a;
    private static volatile aorb c;
    public long b;
    private int d;

    static {
        arqs arqsVar = new arqs();
        a = arqsVar;
        aopi.registerDefaultInstance(arqs.class, arqsVar);
    }

    private arqs() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"d", "b"});
            case 3:
                return new arqs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arqs.class) {
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
