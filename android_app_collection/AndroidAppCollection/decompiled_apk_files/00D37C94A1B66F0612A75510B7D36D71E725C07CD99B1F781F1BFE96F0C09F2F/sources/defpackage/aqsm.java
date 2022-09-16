package defpackage;
/* compiled from: PG */
/* renamed from: aqsm  reason: default package */
/* loaded from: classes2.dex */
public final class aqsm extends aopi implements aoqv {
    public static final aqsm a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public aopp e = emptyFloatList();
    public int f;

    static {
        aqsm aqsmVar = new aqsm();
        a = aqsmVar;
        aopi.registerDefaultInstance(aqsm.class, aqsmVar);
    }

    private aqsm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", "f", avxs.r});
            case 3:
                return new aqsm();
            case 4:
                return new aopa((char[][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqsm.class) {
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
