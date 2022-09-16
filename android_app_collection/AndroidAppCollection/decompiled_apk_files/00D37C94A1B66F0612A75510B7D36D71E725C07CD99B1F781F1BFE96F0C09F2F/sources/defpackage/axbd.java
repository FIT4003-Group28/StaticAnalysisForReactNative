package defpackage;
/* compiled from: PG */
/* renamed from: axbd  reason: default package */
/* loaded from: classes2.dex */
public final class axbd extends aopi implements aoqv {
    private static final axbd a;
    private static volatile aorb b;
    private int c;
    private axan d;

    static {
        axbd axbdVar = new axbd();
        a = axbdVar;
        aopi.registerDefaultInstance(axbd.class, axbdVar);
    }

    private axbd() {
    }

    public static axbd c() {
        return a;
    }

    public axan a() {
        axan axanVar = this.d;
        return axanVar == null ? axan.a : axanVar;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new axbd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbd.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
