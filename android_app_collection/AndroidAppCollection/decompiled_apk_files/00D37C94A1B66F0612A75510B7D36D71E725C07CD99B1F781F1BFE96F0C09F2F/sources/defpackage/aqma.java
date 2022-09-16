package defpackage;
/* compiled from: PG */
/* renamed from: aqma  reason: default package */
/* loaded from: classes2.dex */
public final class aqma extends aopi implements aoqv {
    public static final aqma a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        aqma aqmaVar = new aqma();
        a = aqmaVar;
        aopi.registerDefaultInstance(aqma.class, aqmaVar);
    }

    private aqma() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqma();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqma.class) {
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
