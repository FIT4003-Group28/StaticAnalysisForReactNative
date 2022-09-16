package defpackage;
/* compiled from: PG */
/* renamed from: asop  reason: default package */
/* loaded from: classes2.dex */
public final class asop extends aopi implements aoqv {
    public static final asop a;
    private static volatile aorb j;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private int k;

    static {
        asop asopVar = new asop();
        a = asopVar;
        aopi.registerDefaultInstance(asop.class, asopVar);
    }

    private asop() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0012\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0006ဇ\u0005\fဇ\n\u000fဇ\r\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဇ\u0010", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new asop();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asop.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
