package defpackage;
/* compiled from: PG */
/* renamed from: rqk */
/* loaded from: classes4.dex */
public final class rqk extends aopi implements aoqv {
    private static volatile aorb S;
    public static final rqk a;
    public boolean C;
    public int F;
    public long H;
    public long I;
    public int K;
    public rql M;
    public long O;
    public long P;
    public int b;
    public int c;
    public int d;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int p;
    public long t;
    public long u;
    public boolean w;
    public long y;
    public int z;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String v = "";
    public String x = "";
    public String A = "";
    public String B = "";
    public aopu D = emptyProtobufList();
    public String E = "";
    public String G = "";

    /* renamed from: J */
    public String f265J = "";
    public String L = "";
    public aopq N = emptyIntList();
    public String Q = "";
    public String R = "";

    static {
        rqk rqkVar = new rqk();
        a = rqkVar;
        aopi.registerDefaultInstance(rqk.class, rqkVar);
    }

    private rqk() {
    }

    public static /* synthetic */ void c(rqk rqkVar) {
        rqkVar.b |= 64;
        rqkVar.l = "android";
    }

    public static /* synthetic */ void d(rqk rqkVar) {
        rqkVar.b |= 1;
        rqkVar.d = 1;
    }

    public final void a() {
        aopu aopuVar = this.e;
        if (!aopuVar.c()) {
            this.e = aopi.mutableCopy(aopuVar);
        }
    }

    public final void b() {
        aopu aopuVar = this.f;
        if (!aopuVar.c()) {
            this.f = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001)\u0000\u0002\u00014)\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'", new Object[]{"b", "c", "d", "e", rqg.class, "f", rqo.class, "g", "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "j", "C", "D", rqd.class, "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R"});
            case 3:
                return new rqk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = S;
                if (aorbVar == null) {
                    synchronized (rqk.class) {
                        aorbVar = S;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            S = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
