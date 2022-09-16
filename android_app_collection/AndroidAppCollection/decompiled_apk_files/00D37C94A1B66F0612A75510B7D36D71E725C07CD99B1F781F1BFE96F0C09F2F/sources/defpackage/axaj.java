package defpackage;
/* compiled from: PG */
/* renamed from: axaj  reason: default package */
/* loaded from: classes2.dex */
public final class axaj extends aopi implements aoqv {
    private static final axaj a;
    private static volatile aorb b;
    private int c;
    private axbm d;

    static {
        axaj axajVar = new axaj();
        a = axajVar;
        aopi.registerDefaultInstance(axaj.class, axajVar);
    }

    private axaj() {
    }

    public static axaj b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(axbm axbmVar) {
        axbmVar.getClass();
        this.d = axbmVar;
        this.c |= 1;
    }

    public axbm c() {
        axbm axbmVar = this.d;
        return axbmVar == null ? axbm.l() : axbmVar;
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
                return new axaj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axaj.class) {
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
