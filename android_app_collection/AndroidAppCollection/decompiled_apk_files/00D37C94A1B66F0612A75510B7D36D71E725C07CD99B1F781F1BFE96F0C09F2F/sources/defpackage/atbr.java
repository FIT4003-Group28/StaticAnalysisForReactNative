package defpackage;
/* compiled from: PG */
/* renamed from: atbr */
/* loaded from: classes2.dex */
public final class atbr extends aopi implements aoqv {
    private static final atbr a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;

    static {
        atbr atbrVar = new atbr();
        a = atbrVar;
        aopi.registerDefaultInstance(atbr.class, atbrVar);
    }

    private atbr() {
    }

    public static atbq a() {
        return (atbq) a.createBuilder();
    }

    public static /* synthetic */ void c(atbr atbrVar, atct atctVar) {
        atbrVar.f(atctVar);
    }

    public static /* synthetic */ void d(atbr atbrVar, atcs atcsVar) {
        atbrVar.e(atcsVar);
    }

    public void e(atcs atcsVar) {
        this.e = atcsVar.j;
        this.c |= 2;
    }

    public void f(atct atctVar) {
        this.d = atctVar.d;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", atct.a(), "e", atcs.a()});
            case 3:
                return new atbr();
            case 4:
                return new atbq();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atbr.class) {
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
