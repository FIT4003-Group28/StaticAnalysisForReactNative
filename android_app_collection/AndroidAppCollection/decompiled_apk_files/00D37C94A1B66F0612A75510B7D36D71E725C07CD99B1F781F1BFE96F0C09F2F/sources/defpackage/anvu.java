package defpackage;
/* compiled from: PG */
/* renamed from: anvu  reason: default package */
/* loaded from: classes.dex */
public final class anvu extends aopi implements aoqv {
    public static final anvu a;
    private static volatile aorb f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        anvu anvuVar = new anvu();
        a = anvuVar;
        aopi.registerDefaultInstance(anvu.class, anvuVar);
    }

    private anvu() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"d", "c", "b", "e", anvm.class, anvk.class, anvo.class, anvg.class, anvt.class, anvs.class, anvr.class});
            case 3:
                return new anvu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anvu.class) {
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
