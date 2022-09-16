package defpackage;
/* compiled from: PG */
/* renamed from: rqh  reason: default package */
/* loaded from: classes4.dex */
public final class rqh extends aopi implements aoqv {
    public static final rqh a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public long d;

    static {
        rqh rqhVar = new rqh();
        a = rqhVar;
        aopi.registerDefaultInstance(rqh.class, rqhVar);
    }

    private rqh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new rqh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (rqh.class) {
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
