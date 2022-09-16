package defpackage;
/* compiled from: PG */
/* renamed from: asve  reason: default package */
/* loaded from: classes2.dex */
public final class asve extends aopi implements aoqv {
    public static final asve a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;

    static {
        asve asveVar = new asve();
        a = asveVar;
        aopi.registerDefaultInstance(asve.class, asveVar);
    }

    private asve() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asve();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asve.class) {
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
