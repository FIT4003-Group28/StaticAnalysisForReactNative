package defpackage;
/* compiled from: PG */
/* renamed from: arpl */
/* loaded from: classes2.dex */
public final class arpl extends aopi implements aoqv {
    public static final arpl a;
    private static volatile aorb h;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;

    static {
        arpl arplVar = new arpl();
        a = arplVar;
        aopi.registerDefaultInstance(arpl.class, arplVar);
    }

    private arpl() {
    }

    public static /* synthetic */ void a(arpl arplVar) {
        arplVar.i |= 1;
        arplVar.b = true;
    }

    public static /* synthetic */ void b(arpl arplVar) {
        arplVar.i |= 2;
        arplVar.c = true;
    }

    public static /* synthetic */ void c(arpl arplVar) {
        arplVar.i |= 4;
        arplVar.d = true;
    }

    public static /* synthetic */ void d(arpl arplVar) {
        arplVar.i |= 8;
        arplVar.e = true;
    }

    public static /* synthetic */ void e(arpl arplVar) {
        arplVar.i |= 16;
        arplVar.f = true;
    }

    public static /* synthetic */ void f(arpl arplVar) {
        arplVar.i |= 32;
        arplVar.g = true;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဇ\u0004\u0005ဇ\u0005\u0006ဇ\u0001", new Object[]{"i", "b", "d", "e", "f", "g", "c"});
            case 3:
                return new arpl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arpl.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
