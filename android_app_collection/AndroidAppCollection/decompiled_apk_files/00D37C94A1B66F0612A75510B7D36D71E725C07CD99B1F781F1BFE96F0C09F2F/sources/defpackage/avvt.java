package defpackage;
/* compiled from: PG */
/* renamed from: avvt */
/* loaded from: classes2.dex */
public final class avvt extends aopi implements aoqv {
    private static final avvt a;
    private static volatile aorb b;
    private int c;
    private Object e;
    private int g;
    private int h;
    private int d = 0;
    private String f = "";

    static {
        avvt avvtVar = new avvt();
        a = avvtVar;
        aopi.registerDefaultInstance(avvt.class, avvtVar);
    }

    private avvt() {
    }

    public static avvr a() {
        return (avvr) a.createBuilder();
    }

    public static /* synthetic */ avvt b() {
        return a;
    }

    public void g(avvp avvpVar) {
        this.g = avvpVar.h;
        this.c |= 2;
    }

    public void h(String str) {
        str.getClass();
        this.c |= 1;
        this.f = str;
    }

    public void i(avvq avvqVar) {
        this.h = avvqVar.f;
        this.c |= 4;
    }

    public void j(avvs avvsVar) {
        avvsVar.getClass();
        this.e = avvsVar;
        this.d = 3;
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ဌ\u0002", new Object[]{"e", "d", "c", "f", "g", avvp.a(), avvs.class, "h", avvq.a()});
            case 3:
                return new avvt();
            case 4:
                return new avvr();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avvt.class) {
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
