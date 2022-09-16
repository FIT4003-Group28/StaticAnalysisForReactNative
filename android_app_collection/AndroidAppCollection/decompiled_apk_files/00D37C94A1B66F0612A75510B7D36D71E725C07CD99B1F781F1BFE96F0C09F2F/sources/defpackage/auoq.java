package defpackage;
/* compiled from: PG */
/* renamed from: auoq  reason: default package */
/* loaded from: classes2.dex */
public final class auoq extends aopi implements aoqv {
    private static final auoq a;
    private static volatile aorb b;
    private int c;
    private String d = "";
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private aqrk j;

    static {
        auoq auoqVar = new auoq();
        a = auoqVar;
        aopi.registerDefaultInstance(auoq.class, auoqVar);
    }

    private auoq() {
    }

    public static auop a() {
        return (auop) a.createBuilder();
    }

    public static /* synthetic */ void c(auoq auoqVar, String str) {
        auoqVar.k(str);
    }

    public static /* synthetic */ void d(auoq auoqVar, auon auonVar) {
        auoqVar.l(auonVar);
    }

    public static /* synthetic */ void e(auoq auoqVar, boolean z) {
        auoqVar.j(false);
    }

    public static /* synthetic */ void f(auoq auoqVar, aqrk aqrkVar) {
        auoqVar.m(aqrkVar);
    }

    public static /* synthetic */ void g(auoq auoqVar, int i) {
        auoqVar.n(i);
    }

    public static /* synthetic */ void h(auoq auoqVar, int i) {
        auoqVar.o(i);
    }

    public static /* synthetic */ void i(auoq auoqVar, auoo auooVar) {
        auoqVar.p(auooVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(boolean z) {
        this.c |= 64;
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(auon auonVar) {
        this.h = auonVar.d;
        this.c |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(aqrk aqrkVar) {
        aqrkVar.getClass();
        this.j = aqrkVar;
        this.c |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i) {
        this.c |= 2;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i) {
        this.c |= 4;
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(auoo auooVar) {
        this.g = auooVar.d;
        this.c |= 8;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0007ဇ\u0006\tဉ\b", new Object[]{"c", "d", "e", "f", "g", auoo.a(), "h", auon.a(), "i", "j"});
            case 3:
                return new auoq();
            case 4:
                return new auop();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auoq.class) {
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
