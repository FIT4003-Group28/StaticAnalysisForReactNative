package defpackage;
/* compiled from: PG */
/* renamed from: aqka  reason: default package */
/* loaded from: classes2.dex */
public final class aqka extends aopi implements aoqv {
    public static final aqka a;
    private static volatile aorb h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        aqka aqkaVar = new aqka();
        a = aqkaVar;
        aopi.registerDefaultInstance(aqka.class, aqkaVar);
    }

    private aqka() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0000\u0004ဌ\u0003\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"b", "c", aqfh.g, "d", "e", "f", "g"});
            case 3:
                return new aqka();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqka.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
