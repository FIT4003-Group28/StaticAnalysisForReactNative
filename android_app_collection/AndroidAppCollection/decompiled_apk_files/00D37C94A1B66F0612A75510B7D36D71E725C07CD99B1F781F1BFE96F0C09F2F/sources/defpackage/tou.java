package defpackage;
/* compiled from: PG */
/* renamed from: tou  reason: default package */
/* loaded from: classes4.dex */
public final class tou extends aopi implements aoqv {
    public static final tou a;
    private static volatile aorb e;
    public int b;
    public int c = 250;
    public tos d;
    private int f;

    static {
        tou touVar = new tou();
        a = touVar;
        aopi.registerDefaultInstance(tou.class, touVar);
    }

    private tou() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"f", "b", sml.f, "c", "d"});
            case 3:
                return new tou();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (tou.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
