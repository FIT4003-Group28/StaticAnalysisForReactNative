package defpackage;
/* compiled from: PG */
/* renamed from: axcb  reason: default package */
/* loaded from: classes2.dex */
public final class axcb extends aopi implements aoqv {
    public static final axcb a;
    private static volatile aorb d;
    public int b;
    public awzs c;

    static {
        axcb axcbVar = new axcb();
        a = axcbVar;
        aopi.registerDefaultInstance(axcb.class, axcbVar);
    }

    private axcb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new axcb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (axcb.class) {
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
