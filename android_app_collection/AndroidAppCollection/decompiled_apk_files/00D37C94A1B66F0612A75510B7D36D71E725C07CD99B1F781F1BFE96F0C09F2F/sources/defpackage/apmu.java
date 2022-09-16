package defpackage;
/* compiled from: PG */
/* renamed from: apmu  reason: default package */
/* loaded from: classes.dex */
public final class apmu extends aopi implements aoqv {
    public static final apmu a;
    private static volatile aorb f;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        apmu apmuVar = new apmu();
        a = apmuVar;
        aopi.registerDefaultInstance(apmu.class, apmuVar);
    }

    private apmu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0001\u0002င\u0002\u0003င\u0003\u0004ဇ\u0000", new Object[]{"g", "c", "d", "e", "b"});
            case 3:
                return new apmu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apmu.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
