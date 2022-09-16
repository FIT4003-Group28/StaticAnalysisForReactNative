package defpackage;
/* compiled from: PG */
/* renamed from: apcv  reason: default package */
/* loaded from: classes.dex */
public final class apcv extends aopi implements aoqv {
    public static final apcv a;
    private static volatile aorb e;
    public int b;
    public apdc c;
    public apci d;

    static {
        apcv apcvVar = new apcv();
        a = apcvVar;
        aopi.registerDefaultInstance(apcv.class, apcvVar);
    }

    private apcv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new apcv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apcv.class) {
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
