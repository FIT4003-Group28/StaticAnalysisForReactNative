package defpackage;
/* compiled from: PG */
/* renamed from: awgt */
/* loaded from: classes2.dex */
public final class awgt extends aopi implements aoqv {
    private static final awgt a;
    private static volatile aorb b;
    private int c;
    private int d;
    private long e;
    private int g;
    private int h;
    private long i;
    private int j;
    private String f = "";
    private String k = "";

    static {
        awgt awgtVar = new awgt();
        a = awgtVar;
        aopi.registerDefaultInstance(awgt.class, awgtVar);
    }

    private awgt() {
    }

    public static awgs a() {
        return (awgs) a.createBuilder();
    }

    public static /* synthetic */ awgt b() {
        return a;
    }

    public void k(String str) {
        str.getClass();
        this.c |= 512;
        this.k = str;
    }

    public void l(String str) {
        str.getClass();
        this.c |= 8;
        this.f = str;
    }

    public void m(long j) {
        this.c |= 64;
        this.i = j;
    }

    public void n(long j) {
        this.c |= 2;
        this.e = j;
    }

    public void o(int i) {
        this.c |= 16;
        this.g = i;
    }

    public void p(int i) {
        this.c |= 32;
        this.h = i;
    }

    public void q(awgv awgvVar) {
        this.j = awgvVar.f;
        this.c |= 256;
    }

    public void r(awgu awguVar) {
        this.d = awguVar.y;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0006\bဌ\b\tဈ\t\nင\u0005", new Object[]{"c", "d", awgu.a(), "e", "f", "g", "i", "j", awgv.a(), "k", "h"});
            case 3:
                return new awgt();
            case 4:
                return new awgs();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awgt.class) {
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
