package defpackage;
/* compiled from: PG */
/* renamed from: asit  reason: default package */
/* loaded from: classes2.dex */
public final class asit extends aopi implements aoqv {
    public static final asit a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public apcg e;
    public int c = 0;
    public aoob f = aoob.b;

    static {
        asit asitVar = new asit();
        a = asitVar;
        aopi.registerDefaultInstance(asit.class, asitVar);
    }

    private asit() {
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
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0004ဉ\t\u0005ည\n\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"d", "c", "b", asis.class, asiu.class, "e", "f", asip.class, asiv.class, asiq.class, asio.class, asin.class, asim.class});
            case 3:
                return new asit();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asit.class) {
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
