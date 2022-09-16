package defpackage;
/* compiled from: PG */
/* renamed from: apeq  reason: default package */
/* loaded from: classes.dex */
public final class apeq extends aopi implements aoqv {
    public static final apeq a;
    private static volatile aorb f;
    public int b;
    public long c;
    public aper d;
    public aper e;

    static {
        apeq apeqVar = new apeq();
        a = apeqVar;
        aopi.registerDefaultInstance(apeq.class, apeqVar);
    }

    private apeq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apeq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apeq.class) {
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
