package defpackage;
/* compiled from: PG */
/* renamed from: axbc  reason: default package */
/* loaded from: classes2.dex */
public final class axbc extends aopi implements aoqv {
    private static final axbc a;
    private static volatile aorb b;
    private int c;
    private int d = 1;
    private boolean e;

    static {
        axbc axbcVar = new axbc();
        a = axbcVar;
        aopi.registerDefaultInstance(axbc.class, axbcVar);
    }

    private axbc() {
    }

    public static axbc c() {
        return a;
    }

    public axai a() {
        axai b2 = axai.b(this.d);
        return b2 == null ? axai.ADD_STICKER : b2;
    }

    public boolean d() {
        return this.e;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", axai.a(), "e"});
            case 3:
                return new axbc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axbc.class) {
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
