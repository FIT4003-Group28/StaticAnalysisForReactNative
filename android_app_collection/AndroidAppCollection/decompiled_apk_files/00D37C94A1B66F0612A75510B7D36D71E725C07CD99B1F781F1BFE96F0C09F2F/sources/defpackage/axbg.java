package defpackage;
/* compiled from: PG */
/* renamed from: axbg  reason: default package */
/* loaded from: classes2.dex */
public final class axbg extends aopi implements aoqv {
    private static final axbg a;
    private static volatile aorb b;
    private int c;
    private boolean d;

    static {
        axbg axbgVar = new axbg();
        a = axbgVar;
        aopi.registerDefaultInstance(axbg.class, axbgVar);
    }

    private axbg() {
    }

    public static axbg b() {
        return a;
    }

    public boolean c() {
        return this.d;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case 3:
                return new axbg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbg.class) {
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
