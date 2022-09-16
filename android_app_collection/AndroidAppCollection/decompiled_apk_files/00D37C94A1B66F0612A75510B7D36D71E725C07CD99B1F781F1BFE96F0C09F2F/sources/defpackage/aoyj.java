package defpackage;
/* compiled from: PG */
/* renamed from: aoyj  reason: default package */
/* loaded from: classes.dex */
public final class aoyj extends aopi implements aoqv {
    public static final aoyj a;
    private static volatile aorb f;
    public int b;
    public aoyi c;
    public aoyk d;
    public boolean e;

    static {
        aoyj aoyjVar = new aoyj();
        a = aoyjVar;
        aopi.registerDefaultInstance(aoyj.class, aoyjVar);
    }

    private aoyj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aoyj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aoyj.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
