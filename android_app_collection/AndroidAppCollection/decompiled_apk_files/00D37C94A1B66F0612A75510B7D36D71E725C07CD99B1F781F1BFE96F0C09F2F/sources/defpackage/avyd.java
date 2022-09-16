package defpackage;
/* compiled from: PG */
/* renamed from: avyd  reason: default package */
/* loaded from: classes2.dex */
public final class avyd extends aopi implements aoqv {
    public static final avyd a;
    private static volatile aorb g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;

    static {
        avyd avydVar = new avyd();
        a = avydVar;
        aopi.registerDefaultInstance(avyd.class, avydVar);
    }

    private avyd() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဇ\b\u0005ြ\u0000\u0006ြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"d", "c", "b", "e", avxs.g, avye.class, avyc.class, "f", avyf.class, avyb.class, avxy.class, avya.class, avyj.class});
            case 3:
                return new avyd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avyd.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
