package defpackage;
/* compiled from: PG */
/* renamed from: apmv  reason: default package */
/* loaded from: classes.dex */
public final class apmv extends aopi implements aoqv {
    public static final apmv a;
    private static volatile aorb f;
    public int b;
    public auff c;
    public auff d;
    public apmw e;

    static {
        apmv apmvVar = new apmv();
        a = apmvVar;
        aopi.registerDefaultInstance(apmv.class, apmvVar);
    }

    private apmv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဉ\u0004\u0006ဉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new apmv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apmv.class) {
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
