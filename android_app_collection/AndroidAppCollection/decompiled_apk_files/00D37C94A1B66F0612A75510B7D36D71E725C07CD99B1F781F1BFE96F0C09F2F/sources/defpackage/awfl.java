package defpackage;
/* compiled from: PG */
/* renamed from: awfl  reason: default package */
/* loaded from: classes2.dex */
public final class awfl extends aopi implements aoqv {
    public static final awfl a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        awfl awflVar = new awfl();
        a = awflVar;
        aopi.registerDefaultInstance(awfl.class, awflVar);
    }

    private awfl() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0000\u0001\u0010\u000b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000", new Object[]{"c", "b", awgg.class, awgh.class, awfu.class, awfz.class, awfp.class, awfn.class, awfq.class, awfm.class, awfo.class, awfw.class, awfr.class});
            case 3:
                return new awfl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awfl.class) {
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
