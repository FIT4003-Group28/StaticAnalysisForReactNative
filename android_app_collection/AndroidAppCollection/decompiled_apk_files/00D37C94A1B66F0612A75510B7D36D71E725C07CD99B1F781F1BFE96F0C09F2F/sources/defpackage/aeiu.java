package defpackage;
/* compiled from: PG */
/* renamed from: aeiu  reason: default package */
/* loaded from: classes.dex */
public final class aeiu extends aopi implements aoqv {
    public static final aeiu a;
    private static volatile aorb g;
    public int b;
    public int c;
    public aoob d = aoob.b;
    public int e;
    public int f;

    static {
        aeiu aeiuVar = new aeiu();
        a = aeiuVar;
        aopi.registerDefaultInstance(aeiu.class, aeiuVar);
    }

    private aeiu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဍ\u0000\u0002ည\u0001\u0003ဍ\u0002\u0004ဍ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aeiu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aeiu.class) {
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
