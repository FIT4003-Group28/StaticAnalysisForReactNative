package defpackage;
/* compiled from: PG */
/* renamed from: avej  reason: default package */
/* loaded from: classes2.dex */
public final class avej extends aopi implements aoqv {
    public static final avej a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public int d;
    public long e;

    static {
        avej avejVar = new avej();
        a = avejVar;
        aopi.registerDefaultInstance(avej.class, avejVar);
    }

    private avej() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new avej();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avej.class) {
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
