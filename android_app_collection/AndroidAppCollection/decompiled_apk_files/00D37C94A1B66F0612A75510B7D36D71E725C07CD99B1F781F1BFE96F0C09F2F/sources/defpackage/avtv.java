package defpackage;
/* compiled from: PG */
/* renamed from: avtv */
/* loaded from: classes2.dex */
public final class avtv extends aopi implements aoqv {
    private static final avtv a;
    private static volatile aorb b;
    private int c;
    private avtw d;
    private int e;
    private int g;
    private int h;
    private int i;
    private int j;
    private long l;
    private int m;
    private int n;
    private long o;
    private long p;
    private long q;
    private long r;
    private avts t;
    private avud u;
    private String f = "";
    private String k = "";
    private aopu s = emptyProtobufList();
    private String v = "";

    static {
        avtv avtvVar = new avtv();
        a = avtvVar;
        aopi.registerDefaultInstance(avtv.class, avtvVar);
    }

    private avtv() {
    }

    public void A(avuo avuoVar) {
        this.g = avuoVar.R;
        this.c |= 8192;
    }

    public void B(long j) {
        this.c |= 262144;
        this.l = j;
    }

    public void C(avts avtsVar) {
        avtsVar.getClass();
        this.t = avtsVar;
        this.c |= 536870912;
    }

    public void D(avuf avufVar) {
        this.m = avufVar.d;
        this.c |= 524288;
    }

    public void E(avuk avukVar) {
        this.j = avukVar.k;
        this.c |= 65536;
    }

    public void F(avtw avtwVar) {
        avtwVar.getClass();
        this.d = avtwVar;
        this.c |= 1;
    }

    public void G(String str) {
        str.getClass();
        this.c |= 131072;
        this.k = str;
    }

    public void H(avud avudVar) {
        avudVar.getClass();
        this.u = avudVar;
        this.c |= 1073741824;
    }

    public static avtu a() {
        return (avtu) a.createBuilder();
    }

    public static /* synthetic */ avtv b() {
        return a;
    }

    public void s(avum avumVar) {
        this.n = avumVar.p;
        this.c |= 1048576;
    }

    public void t(long j) {
        this.c |= 2097152;
        this.o = j;
    }

    public void u(long j) {
        this.c |= 4194304;
        this.p = j;
    }

    public void v(long j) {
        this.c |= 16777216;
        this.r = j;
    }

    public void w(long j) {
        this.c |= 8388608;
        this.q = j;
    }

    public void x(avug avugVar) {
        this.i = avugVar.l;
        this.c |= 32768;
    }

    public void y(avul avulVar) {
        this.e = avulVar.aJ;
        this.c |= 2;
    }

    public void z(avun avunVar) {
        this.h = avunVar.aB;
        this.c |= 16384;
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001,\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\rဌ\r\u000eဌ\u000e\u000fဌ\u0010\u0010ဈ\u0011\u0011ဃ\u0012\u0012ဌ\u0013\u0013ဌ\u0014\u0015ဃ\u0015\u0016ဃ\u0016\u0017ဃ\u0017\u0018ဃ\u0018\u001eဉ\u001e\"ဌ\u000f,ဉ\u001d", new Object[]{"c", "d", "e", avul.a(), "g", avuo.a(), "h", avun.a(), "j", avuk.a(), "k", "l", "m", avuf.a(), "n", avum.a(), "o", "p", "q", "r", "u", "i", avug.a(), "t"});
            case 3:
                return new avtv();
            case 4:
                return new avtu();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avtv.class) {
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
