package defpackage;
/* compiled from: PG */
/* renamed from: asxi  reason: default package */
/* loaded from: classes2.dex */
public final class asxi extends aopi implements aoqv {
    public static final asxi a;
    private static volatile aorb h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        asxi asxiVar = new asxi();
        a = asxiVar;
        aopi.registerDefaultInstance(asxi.class, asxiVar);
    }

    private asxi() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဋ\u0004", new Object[]{"b", "c", asut.m, "d", asxh.a(), "e", asut.o, "f", asut.n, "g"});
            case 3:
                return new asxi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asxi.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
