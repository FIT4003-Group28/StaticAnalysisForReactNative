package defpackage;
/* compiled from: PG */
/* renamed from: awtn  reason: default package */
/* loaded from: classes2.dex */
public final class awtn extends aopi implements aoqv {
    public static final awtn a;
    private static volatile aorb h;
    public int b;
    public boolean f;
    public long c = -1;
    public aoob d = aoob.b;
    public long e = -1;
    public long g = 10000;

    static {
        awtn awtnVar = new awtn();
        a = awtnVar;
        aopi.registerDefaultInstance(awtn.class, awtnVar);
    }

    private awtn() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new awtn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awtn.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
