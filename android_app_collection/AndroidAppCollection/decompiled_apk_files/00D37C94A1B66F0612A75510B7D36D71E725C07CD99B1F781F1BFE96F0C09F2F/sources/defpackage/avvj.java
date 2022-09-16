package defpackage;
/* compiled from: PG */
/* renamed from: avvj  reason: default package */
/* loaded from: classes2.dex */
public final class avvj extends aopi implements aoqv {
    public static final avvj a;
    private static volatile aorb c;
    public boolean b;
    private int d;

    static {
        avvj avvjVar = new avvj();
        a = avvjVar;
        aopi.registerDefaultInstance(avvj.class, avvjVar);
    }

    private avvj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
            case 3:
                return new avvj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (avvj.class) {
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
