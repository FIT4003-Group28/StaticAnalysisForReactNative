package defpackage;
/* compiled from: PG */
/* renamed from: aufi  reason: default package */
/* loaded from: classes2.dex */
public final class aufi extends aopi implements aoqv {
    public static final aufi a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        aufi aufiVar = new aufi();
        a = aufiVar;
        aopi.registerDefaultInstance(aufi.class, aufiVar);
    }

    private aufi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"d", "b"});
            case 3:
                return new aufi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aufi.class) {
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
