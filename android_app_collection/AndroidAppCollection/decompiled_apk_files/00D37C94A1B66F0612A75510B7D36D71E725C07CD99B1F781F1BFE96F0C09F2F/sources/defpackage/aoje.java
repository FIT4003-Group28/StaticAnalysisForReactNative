package defpackage;
/* compiled from: PG */
/* renamed from: aoje  reason: default package */
/* loaded from: classes.dex */
public final class aoje extends aopi implements aoqv {
    public static final aoje a;
    private static volatile aorb g;
    public int b;
    public long d;
    public long f;
    public String c = "";
    public String e = "";

    static {
        aoje aojeVar = new aoje();
        a = aojeVar;
        aopi.registerDefaultInstance(aoje.class, aojeVar);
    }

    private aoje() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004", new Object[]{"b", "c", "e", "d", "f"});
            case 3:
                return new aoje();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aoje.class) {
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
