package defpackage;
/* compiled from: PG */
/* renamed from: asjg  reason: default package */
/* loaded from: classes2.dex */
public final class asjg extends aopi implements aoqv {
    public static final asjg a;
    private static volatile aorb b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    static {
        asjg asjgVar = new asjg();
        a = asjgVar;
        aopi.registerDefaultInstance(asjg.class, asjgVar);
    }

    private asjg() {
    }

    public static /* synthetic */ void a(asjg asjgVar) {
        asjgVar.c |= 1;
        asjgVar.d = true;
    }

    public static /* synthetic */ void b(asjg asjgVar) {
        asjgVar.c |= 2;
        asjgVar.e = true;
    }

    public static /* synthetic */ void c(asjg asjgVar) {
        asjgVar.c |= 4;
        asjgVar.f = true;
    }

    public static /* synthetic */ void d(asjg asjgVar) {
        asjgVar.c |= 8;
        asjgVar.g = true;
    }

    public static /* synthetic */ void e(asjg asjgVar) {
        asjgVar.c |= 16;
        asjgVar.h = true;
    }

    public static /* synthetic */ void f(asjg asjgVar) {
        asjgVar.c |= 32;
        asjgVar.i = true;
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
                return new asjg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asjg.class) {
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
