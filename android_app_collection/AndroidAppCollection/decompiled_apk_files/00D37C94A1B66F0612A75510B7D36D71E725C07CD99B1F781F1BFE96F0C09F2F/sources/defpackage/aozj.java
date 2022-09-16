package defpackage;
/* compiled from: PG */
/* renamed from: aozj  reason: default package */
/* loaded from: classes.dex */
public final class aozj extends aopi implements aoqv {
    public static final aozj a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";

    static {
        aozj aozjVar = new aozj();
        a = aozjVar;
        aopi.registerDefaultInstance(aozj.class, aozjVar);
    }

    private aozj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဈ\u0004", new Object[]{"b", "c", arka.d, "d", arka.e, "e", arka.f, "f"});
            case 3:
                return new aozj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aozj.class) {
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
