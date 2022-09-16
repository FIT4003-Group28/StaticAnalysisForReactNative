package defpackage;
/* compiled from: PG */
/* renamed from: rqr  reason: default package */
/* loaded from: classes4.dex */
public final class rqr extends aopi implements aoqv {
    public static final rqr a;
    private static volatile aorb d;
    public aopu b = emptyProtobufList();
    public rqp c;
    private int e;

    static {
        rqr rqrVar = new rqr();
        a = rqrVar;
        aopi.registerDefaultInstance(rqr.class, rqrVar);
    }

    private rqr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"e", "b", rqs.class, "c"});
            case 3:
                return new rqr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (rqr.class) {
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
