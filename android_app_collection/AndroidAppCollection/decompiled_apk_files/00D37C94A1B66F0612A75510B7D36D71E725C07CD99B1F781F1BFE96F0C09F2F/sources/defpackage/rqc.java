package defpackage;
/* compiled from: PG */
/* renamed from: rqc  reason: default package */
/* loaded from: classes4.dex */
public final class rqc extends aopi implements aoqv {
    public static final rqc a;
    private static volatile aorb d;
    public String b = "";
    public String c = "";
    private int e;

    static {
        rqc rqcVar = new rqc();
        a = rqcVar;
        aopi.registerDefaultInstance(rqc.class, rqcVar);
    }

    private rqc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new rqc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (rqc.class) {
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
