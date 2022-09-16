package defpackage;
/* compiled from: PG */
/* renamed from: orj  reason: default package */
/* loaded from: classes4.dex */
public final class orj extends aopi implements aoqv {
    public static final orj a;
    private static volatile aorb h;
    public int b;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public String c = "";
    private String i = "";

    static {
        orj orjVar = new orj();
        a = orjVar;
        aopi.registerDefaultInstance(orj.class, orjVar);
    }

    private orj() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0000\bဇ\u0006", new Object[]{"b", "i", "d", "e", "f", "c", "g"});
            case 3:
                return new orj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (orj.class) {
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
