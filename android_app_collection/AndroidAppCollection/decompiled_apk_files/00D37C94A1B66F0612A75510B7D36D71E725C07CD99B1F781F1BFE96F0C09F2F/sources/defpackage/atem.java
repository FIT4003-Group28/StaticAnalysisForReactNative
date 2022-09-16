package defpackage;
/* compiled from: PG */
/* renamed from: atem  reason: default package */
/* loaded from: classes2.dex */
public final class atem extends aopi implements aoqv {
    public static final atem a;
    private static volatile aorb c;
    public aovr b;
    private int d;

    static {
        atem atemVar = new atem();
        a = atemVar;
        aopi.registerDefaultInstance(atem.class, atemVar);
    }

    private atem() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uecfa␜\uecfa␜\u0001\u0000\u0000\u0000\uecfa␜ဉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new atem();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atem.class) {
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
