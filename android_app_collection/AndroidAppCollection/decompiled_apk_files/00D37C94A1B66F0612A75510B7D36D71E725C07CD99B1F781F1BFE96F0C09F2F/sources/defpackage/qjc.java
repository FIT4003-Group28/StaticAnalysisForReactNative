package defpackage;
/* compiled from: PG */
/* renamed from: qjc  reason: default package */
/* loaded from: classes4.dex */
public final class qjc extends aopi implements aoqv {
    public static final qjc a;
    private static volatile aorb d;
    public int b;
    public String c = "";
    private int e;

    static {
        qjc qjcVar = new qjc();
        a = qjcVar;
        aopi.registerDefaultInstance(qjc.class, qjcVar);
    }

    private qjc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"e", "b", dnn.p, "c"});
            case 3:
                return new qjc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (qjc.class) {
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
