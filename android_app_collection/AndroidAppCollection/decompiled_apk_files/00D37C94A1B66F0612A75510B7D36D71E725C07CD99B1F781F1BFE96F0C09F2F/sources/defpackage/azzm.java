package defpackage;
/* compiled from: PG */
/* renamed from: azzm  reason: default package */
/* loaded from: classes2.dex */
public final class azzm extends aopi implements aoqv {
    public static final azzm a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public azzl d;

    static {
        azzm azzmVar = new azzm();
        a = azzmVar;
        aopi.registerDefaultInstance(azzm.class, azzmVar);
        b = aopi.newSingularGeneratedExtension(azzk.a, azzmVar, azzmVar, null, 6, aosj.MESSAGE, azzm.class);
    }

    private azzm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new azzm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (azzm.class) {
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
