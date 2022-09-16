package defpackage;
/* compiled from: PG */
/* renamed from: tqt  reason: default package */
/* loaded from: classes4.dex */
public final class tqt extends aopi implements aoqv {
    public static final tqt a;
    private static volatile aorb e;
    public aoqp b = aoqp.a;
    public aoqp c = aoqp.a;
    public aopu d = emptyProtobufList();

    static {
        tqt tqtVar = new tqt();
        a = tqtVar;
        aopi.registerDefaultInstance(tqt.class, tqtVar);
    }

    private tqt() {
    }

    public final aoqp a() {
        aoqp aoqpVar = this.b;
        if (!aoqpVar.b) {
            this.b = aoqpVar.a();
        }
        return this.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", tqr.a, "c", tqs.a, "d", tqm.class});
            case 3:
                return new tqt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (tqt.class) {
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
