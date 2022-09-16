package defpackage;
/* compiled from: PG */
/* renamed from: anvo  reason: default package */
/* loaded from: classes.dex */
public final class anvo extends aopi implements aoqv {
    private static final anvo a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    static {
        anvo anvoVar = new anvo();
        a = anvoVar;
        aopi.registerDefaultInstance(anvo.class, anvoVar);
    }

    private anvo() {
    }

    public static anvn a() {
        return (anvn) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i) {
        this.c |= 16;
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i) {
        this.c |= 128;
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i) {
        this.c |= 2;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i) {
        this.c |= 32;
        this.i = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i) {
        this.c |= 4;
        this.f = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int i) {
        this.c |= 8;
        this.g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i) {
        this.c |= 1;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i) {
        this.c |= 64;
        this.j = i;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new anvo();
            case 4:
                return new anvn();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anvo.class) {
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
