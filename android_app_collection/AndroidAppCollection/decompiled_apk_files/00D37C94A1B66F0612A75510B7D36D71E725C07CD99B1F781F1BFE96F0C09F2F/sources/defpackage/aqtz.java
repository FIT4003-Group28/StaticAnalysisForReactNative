package defpackage;
/* compiled from: PG */
/* renamed from: aqtz */
/* loaded from: classes2.dex */
public final class aqtz extends aopi implements aoqv {
    private static final aqtz a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;
    private String f = "";

    static {
        aqtz aqtzVar = new aqtz();
        a = aqtzVar;
        aopi.registerDefaultInstance(aqtz.class, aqtzVar);
    }

    private aqtz() {
    }

    public static aqty a() {
        return (aqty) a.createBuilder();
    }

    public static /* synthetic */ void c(aqtz aqtzVar, aqtx aqtxVar) {
        aqtzVar.g(aqtxVar);
    }

    public static /* synthetic */ void d(aqtz aqtzVar, aqtw aqtwVar) {
        aqtzVar.f(aqtwVar);
    }

    public static /* synthetic */ void e(aqtz aqtzVar, String str) {
        aqtzVar.h(str);
    }

    public void f(aqtw aqtwVar) {
        this.e = aqtwVar.e;
        this.c |= 2;
    }

    public void g(aqtx aqtxVar) {
        this.d = aqtxVar.i;
        this.c |= 1;
    }

    public void h(String str) {
        str.getClass();
        this.c |= 4;
        this.f = str;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", aqtx.a(), "e", aqtw.a(), "f"});
            case 3:
                return new aqtz();
            case 4:
                return new aqty();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqtz.class) {
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
