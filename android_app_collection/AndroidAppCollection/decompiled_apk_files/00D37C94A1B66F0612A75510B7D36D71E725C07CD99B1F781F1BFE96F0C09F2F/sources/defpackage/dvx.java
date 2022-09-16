package defpackage;
/* compiled from: PG */
/* renamed from: dvx  reason: default package */
/* loaded from: classes3.dex */
public final class dvx extends aopi implements aoqv {
    public static final dvx a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        dvx dvxVar = new dvx();
        a = dvxVar;
        aopi.registerDefaultInstance(dvx.class, dvxVar);
    }

    private dvx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
            case 3:
                return new dvx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (dvx.class) {
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
