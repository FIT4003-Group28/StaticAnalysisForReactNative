package defpackage;
/* compiled from: PG */
/* renamed from: rqj  reason: default package */
/* loaded from: classes4.dex */
public final class rqj extends aopi implements aoqv {
    public static final rqj a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        rqj rqjVar = new rqj();
        a = rqjVar;
        aopi.registerDefaultInstance(rqj.class, rqjVar);
    }

    private rqj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", rqk.class});
            case 3:
                return new rqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (rqj.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
