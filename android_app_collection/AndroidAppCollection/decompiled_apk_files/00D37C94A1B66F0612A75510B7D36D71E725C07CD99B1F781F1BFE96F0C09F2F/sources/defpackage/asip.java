package defpackage;
/* compiled from: PG */
/* renamed from: asip  reason: default package */
/* loaded from: classes2.dex */
public final class asip extends aopi implements aoqv {
    public static final asip a;
    private static volatile aorb b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    static {
        asip asipVar = new asip();
        a = asipVar;
        aopi.registerDefaultInstance(asip.class, asipVar);
    }

    private asip() {
    }

    public static /* synthetic */ void a(asip asipVar) {
        asipVar.c |= 1;
        asipVar.d = true;
    }

    public static /* synthetic */ void b(asip asipVar) {
        asipVar.c |= 2;
        asipVar.e = true;
    }

    public static /* synthetic */ void c(asip asipVar) {
        asipVar.c |= 4;
        asipVar.f = true;
    }

    public static /* synthetic */ void d(asip asipVar) {
        asipVar.c |= 8;
        asipVar.g = true;
    }

    public static /* synthetic */ void e(asip asipVar) {
        asipVar.c |= 16;
        asipVar.h = true;
    }

    public static /* synthetic */ void f(asip asipVar) {
        asipVar.c |= 32;
        asipVar.i = true;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new asip();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asip.class) {
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
