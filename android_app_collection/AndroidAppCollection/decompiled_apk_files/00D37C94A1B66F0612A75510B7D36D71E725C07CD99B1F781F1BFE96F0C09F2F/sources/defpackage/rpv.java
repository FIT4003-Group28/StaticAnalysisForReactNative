package defpackage;
/* compiled from: PG */
/* renamed from: rpv  reason: default package */
/* loaded from: classes4.dex */
public final class rpv extends aopi implements aoqv {
    public static final rpv a;
    private static volatile aorb g;
    public int b;
    public rpz c;
    public rpw d;
    public boolean e;
    public String f = "";

    static {
        rpv rpvVar = new rpv();
        a = rpvVar;
        aopi.registerDefaultInstance(rpv.class, rpvVar);
    }

    private rpv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new rpv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (rpv.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
