package defpackage;
/* compiled from: PG */
/* renamed from: avii  reason: default package */
/* loaded from: classes2.dex */
public final class avii extends aopi implements aoqv {
    public static final avii a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public avic d;

    static {
        avii aviiVar = new avii();
        a = aviiVar;
        aopi.registerDefaultInstance(avii.class, aviiVar);
    }

    private avii() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new avii();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avii.class) {
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
