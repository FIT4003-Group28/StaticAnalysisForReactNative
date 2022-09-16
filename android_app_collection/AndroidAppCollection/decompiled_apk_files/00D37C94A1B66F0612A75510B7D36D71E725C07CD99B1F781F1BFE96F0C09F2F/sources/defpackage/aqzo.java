package defpackage;
/* compiled from: PG */
/* renamed from: aqzo  reason: default package */
/* loaded from: classes2.dex */
public final class aqzo extends aopi implements aoqv {
    public static final aqzo a;
    private static volatile aorb h;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;
    public String g = "";

    static {
        aqzo aqzoVar = new aqzo();
        a = aqzoVar;
        aopi.registerDefaultInstance(aqzo.class, aqzoVar);
    }

    private aqzo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", aqyp.g, "g"});
            case 3:
                return new aqzo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqzo.class) {
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
