package defpackage;
/* compiled from: PG */
/* renamed from: aqxl  reason: default package */
/* loaded from: classes2.dex */
public final class aqxl extends aopi implements aoqv {
    public static final aqxl a;
    private static volatile aorb h;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;
    public double g;

    static {
        aqxl aqxlVar = new aqxl();
        a = aqxlVar;
        aopi.registerDefaultInstance(aqxl.class, aqxlVar);
    }

    private aqxl() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005က\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqxl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqxl.class) {
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
