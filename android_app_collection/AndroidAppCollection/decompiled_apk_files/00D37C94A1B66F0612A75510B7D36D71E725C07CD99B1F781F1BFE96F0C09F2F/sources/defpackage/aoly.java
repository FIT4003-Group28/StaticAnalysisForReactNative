package defpackage;
/* compiled from: PG */
/* renamed from: aoly  reason: default package */
/* loaded from: classes.dex */
public final class aoly extends aopi implements aoqv {
    public static final aoly a;
    private static volatile aorb e;
    public boolean b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        aoly aolyVar = new aoly();
        a = aolyVar;
        aopi.registerDefaultInstance(aoly.class, aolyVar);
    }

    private aoly() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new aoly();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoly.class) {
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
