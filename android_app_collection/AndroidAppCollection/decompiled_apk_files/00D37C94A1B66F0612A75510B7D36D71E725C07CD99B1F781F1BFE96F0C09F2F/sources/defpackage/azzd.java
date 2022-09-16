package defpackage;
/* compiled from: PG */
/* renamed from: azzd  reason: default package */
/* loaded from: classes2.dex */
public final class azzd extends aopi implements aoqv {
    public static final azzd a;
    private static volatile aorb e;
    public int b;
    public long c;
    public String d = "";

    static {
        azzd azzdVar = new azzd();
        a = azzdVar;
        aopi.registerDefaultInstance(azzd.class, azzdVar);
    }

    private azzd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new azzd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (azzd.class) {
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
