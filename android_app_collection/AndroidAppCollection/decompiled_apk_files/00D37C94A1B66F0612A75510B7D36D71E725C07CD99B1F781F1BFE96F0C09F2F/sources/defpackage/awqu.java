package defpackage;
/* compiled from: PG */
/* renamed from: awqu  reason: default package */
/* loaded from: classes2.dex */
public final class awqu extends aopi implements aoqv {
    public static final awqu a;
    private static volatile aorb h;
    public int b;
    public aorw d;
    public int e;
    public awqv g;
    private aoqp i = aoqp.a;
    public String c = "";
    public String f = "";

    static {
        awqu awquVar = new awqu();
        a = awquVar;
        aopi.registerDefaultInstance(awqu.class, awquVar);
    }

    private awqu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u00052\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", awkk.u, "f", "i", awqt.a, "g"});
            case 3:
                return new awqu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awqu.class) {
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
