package defpackage;
/* compiled from: PG */
/* renamed from: anvk */
/* loaded from: classes.dex */
public final class anvk extends aopi implements aoqv {
    private static final anvk a;
    private static volatile aorb b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    static {
        anvk anvkVar = new anvk();
        a = anvkVar;
        aopi.registerDefaultInstance(anvk.class, anvkVar);
    }

    private anvk() {
    }

    public static anvj a() {
        return (anvj) a.createBuilder();
    }

    public static /* synthetic */ anvk b() {
        return a;
    }

    public void k(int i) {
        this.c |= 16;
        this.h = i;
    }

    public void l(anvh anvhVar) {
        this.f = anvhVar.f;
        this.c |= 4;
    }

    public void m(boolean z) {
        this.c |= 2;
        this.e = z;
    }

    public void n(int i) {
        this.c |= 8;
        this.g = i;
    }

    public void o(int i) {
        this.c |= 64;
        this.j = i;
    }

    public void p(int i) {
        this.c |= 1;
        this.d = i;
    }

    public void q(int i) {
        this.c |= 32;
        this.i = i;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"c", "d", "e", "f", anvh.b(), "g", "h", "i", "j"});
            case 3:
                return new anvk();
            case 4:
                return new anvj();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anvk.class) {
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

    public boolean j() {
        return (this.c & 16) != 0;
    }
}
