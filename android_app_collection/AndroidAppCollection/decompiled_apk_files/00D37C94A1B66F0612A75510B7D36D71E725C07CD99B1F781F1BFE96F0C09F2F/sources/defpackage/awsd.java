package defpackage;
/* compiled from: PG */
/* renamed from: awsd  reason: default package */
/* loaded from: classes2.dex */
public final class awsd extends aopi implements aoqv {
    public static final awsd a;
    private static volatile aorb e;
    public Object c;
    public int b = 0;
    public aopl d = emptyDoubleList();

    static {
        awsd awsdVar = new awsd();
        a = awsdVar;
        aopi.registerDefaultInstance(awsd.class, awsdVar);
    }

    private awsd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0012\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", "d", awry.class, awse.class, awrx.class});
            case 3:
                return new awsd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awsd.class) {
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
