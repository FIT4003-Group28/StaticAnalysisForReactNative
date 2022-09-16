package defpackage;
/* compiled from: PG */
/* renamed from: orv  reason: default package */
/* loaded from: classes4.dex */
public final class orv extends aopi implements aoqv {
    public static final orv a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public aopq f = emptyIntList();

    static {
        orv orvVar = new orv();
        a = orvVar;
        aopi.registerDefaultInstance(orv.class, orvVar);
    }

    private orv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003\u0016\u0006ဇ\u0001", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new orv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (orv.class) {
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
