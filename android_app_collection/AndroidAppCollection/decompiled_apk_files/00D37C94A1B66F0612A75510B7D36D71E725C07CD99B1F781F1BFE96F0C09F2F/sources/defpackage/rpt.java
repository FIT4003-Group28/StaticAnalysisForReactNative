package defpackage;
/* compiled from: PG */
/* renamed from: rpt  reason: default package */
/* loaded from: classes4.dex */
public final class rpt extends aopi implements aoqv {
    public static final rpt a;
    private static volatile aorb f;
    public int b;
    public int c;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        rpt rptVar = new rpt();
        a = rptVar;
        aopi.registerDefaultInstance(rpt.class, rptVar);
    }

    private rpt() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", rpx.class, "e", rpu.class});
            case 3:
                return new rpt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (rpt.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
