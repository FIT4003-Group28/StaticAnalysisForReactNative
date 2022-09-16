package defpackage;
/* compiled from: PG */
/* renamed from: asvs  reason: default package */
/* loaded from: classes2.dex */
public final class asvs extends aopi implements aoqv {
    public static final asvs a;
    private static volatile aorb d;
    public aqwk b;
    public aqyy c;
    private int e;

    static {
        asvs asvsVar = new asvs();
        a = asvsVar;
        aopi.registerDefaultInstance(asvs.class, asvsVar);
    }

    private asvs() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"e", "b", "c"});
            case 3:
                return new asvs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asvs.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
