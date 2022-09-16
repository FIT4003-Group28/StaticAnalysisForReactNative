package defpackage;
/* compiled from: PG */
/* renamed from: avyb  reason: default package */
/* loaded from: classes2.dex */
public final class avyb extends aopi implements aoqv {
    public static final avyb a;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        avyb avybVar = new avyb();
        a = avybVar;
        aopi.registerDefaultInstance(avyb.class, avybVar);
    }

    private avyb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case 3:
                return new avyb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avyb.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
