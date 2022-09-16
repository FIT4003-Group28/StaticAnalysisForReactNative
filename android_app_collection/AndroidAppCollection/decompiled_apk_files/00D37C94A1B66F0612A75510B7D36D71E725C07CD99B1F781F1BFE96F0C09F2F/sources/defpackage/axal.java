package defpackage;
/* compiled from: PG */
/* renamed from: axal  reason: default package */
/* loaded from: classes2.dex */
public final class axal extends aopi implements aoqv {
    public static final axal a;
    private static volatile aorb e;
    public axam b;
    public axam c;
    public int d;
    private int f;

    static {
        axal axalVar = new axal();
        a = axalVar;
        aopi.registerDefaultInstance(axal.class, axalVar);
    }

    private axal() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"f", "b", "c", "d", awsi.r});
            case 3:
                return new axal();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (axal.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
