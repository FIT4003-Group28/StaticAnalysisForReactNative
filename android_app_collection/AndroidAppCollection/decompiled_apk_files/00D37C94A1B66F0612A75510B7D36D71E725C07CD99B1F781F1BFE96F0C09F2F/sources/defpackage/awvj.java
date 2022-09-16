package defpackage;
/* compiled from: PG */
/* renamed from: awvj  reason: default package */
/* loaded from: classes2.dex */
public final class awvj extends aopi implements aoqv {
    public static final awvj a;
    private static volatile aorb f;
    public int b;
    public boolean d;
    public aoqp c = aoqp.a;
    public long e = -1;

    static {
        awvj awvjVar = new awvj();
        a = awvjVar;
        aopi.registerDefaultInstance(awvj.class, awvjVar);
    }

    private awvj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဇ\u0000\u0003ဂ\u0001", new Object[]{"b", "c", awvi.a, "d", "e"});
            case 3:
                return new awvj();
            case 4:
                return new aopa((float[][][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awvj.class) {
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
