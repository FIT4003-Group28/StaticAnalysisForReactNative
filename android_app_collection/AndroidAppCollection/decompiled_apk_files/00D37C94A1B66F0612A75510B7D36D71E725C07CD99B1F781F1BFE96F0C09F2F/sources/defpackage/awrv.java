package defpackage;
/* compiled from: PG */
/* renamed from: awrv  reason: default package */
/* loaded from: classes2.dex */
public final class awrv extends aopi implements aoqv {
    public static final awrv a;
    private static volatile aorb d;
    public boolean b;
    public int c;
    private int e;

    static {
        awrv awrvVar = new awrv();
        a = awrvVar;
        aopi.registerDefaultInstance(awrv.class, awrvVar);
    }

    private awrv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c", awsi.b});
            case 3:
                return new awrv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awrv.class) {
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
