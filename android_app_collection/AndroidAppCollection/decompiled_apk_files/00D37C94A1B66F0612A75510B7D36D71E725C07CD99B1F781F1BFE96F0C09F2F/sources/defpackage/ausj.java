package defpackage;
/* compiled from: PG */
/* renamed from: ausj  reason: default package */
/* loaded from: classes2.dex */
public final class ausj extends aopi implements aoqv {
    public static final ausj a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        ausj ausjVar = new ausj();
        a = ausjVar;
        aopi.registerDefaultInstance(ausj.class, ausjVar);
    }

    private ausj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", ausi.a()});
            case 3:
                return new ausj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (ausj.class) {
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
