package defpackage;
/* compiled from: PG */
/* renamed from: qjd  reason: default package */
/* loaded from: classes4.dex */
public final class qjd extends aopi implements aoqv {
    public static final qjd a;
    private static volatile aorb e;
    public int b;
    public aopu c = emptyProtobufList();
    public aopu d;
    private int f;

    static {
        qjd qjdVar = new qjd();
        a = qjdVar;
        aopi.registerDefaultInstance(qjd.class, qjdVar);
    }

    private qjd() {
        emptyProtobufList();
        this.d = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0004\u001b", new Object[]{"f", "b", dnn.q, "c", qja.class, "d", qjc.class});
            case 3:
                return new qjd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (qjd.class) {
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
