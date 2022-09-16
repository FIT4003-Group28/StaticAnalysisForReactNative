package defpackage;
/* compiled from: PG */
/* renamed from: auie  reason: default package */
/* loaded from: classes2.dex */
public final class auie extends aopi implements aoqv {
    public static final auie a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        auie auieVar = new auie();
        a = auieVar;
        aopi.registerDefaultInstance(auie.class, auieVar);
    }

    private auie() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", auib.a(), "d", "e", auhz.a(), "f", auhz.a()});
            case 3:
                return new auie();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (auie.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
