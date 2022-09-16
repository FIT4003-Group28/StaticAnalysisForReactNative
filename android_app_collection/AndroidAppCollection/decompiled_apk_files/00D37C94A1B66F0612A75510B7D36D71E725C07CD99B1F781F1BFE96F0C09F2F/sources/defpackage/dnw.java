package defpackage;
/* compiled from: PG */
/* renamed from: dnw  reason: default package */
/* loaded from: classes3.dex */
public final class dnw extends aopi implements aoqv {
    public static final dnw a;
    private static volatile aorb ag;
    public dnu P;
    public dnv R;
    public doa Y;
    public String ab;
    public int ac;
    public boolean ad;
    public long ae;
    public dnz af;
    public int b;
    public int c;
    public int d;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long u;
    public long v;
    public long w;
    public long y;
    public String e = "";
    public String f = "";
    public String s = "";
    public String t = "";
    public String x = "";
    public long z = -1;
    public long A = -1;
    public long B = -1;
    public long C = -1;
    public long D = -1;
    public long E = -1;
    public long F = -1;
    public long G = -1;
    public String H = "D";
    public String I = "D";

    /* renamed from: J  reason: collision with root package name */
    public int f179J = 1000;
    public int K = 1000;
    public long L = -1;
    public long M = -1;
    public long N = -1;
    public int O = 1000;
    public aopu Q = emptyProtobufList();
    public long S = -1;
    public long T = -1;
    public long U = -1;
    public long V = -1;
    public long W = -1;
    public String X = "D";
    public int Z = 1000;
    public int aa = 1000;

    static {
        dnw dnwVar = new dnw();
        a = dnwVar;
        aopi.registerDefaultInstance(dnw.class, dnwVar);
    }

    private dnw() {
        emptyProtobufList();
        emptyProtobufList();
        this.ab = "";
        this.ac = 2;
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
                return newMessageInfo(a, "\u00016\u0000\u0003\u0001É6\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0005ဂ\u0004\u0006ဂ\u0005\u000bဂ\n\fဂ\u000b\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0014ဂ\u0013\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈI\u0019ဂM\u001aဌJ\u001bဈ\u0016\u001cဇK\u001dဈ\u0018\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.8ဌ19ဉ3;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;Cဈ<EဉAIဌCLဌDÉဉN", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "ab", "ae", "ac", dnn.d, "s", "ad", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "Q", dnu.class, "F", "G", "H", "I", "J", dnn.f, "K", dnn.f, "P", "L", "M", "N", "O", dnn.f, "R", "S", "T", "U", "V", "W", "X", "Y", "Z", dnn.f, "aa", dnn.f, "af"});
            case 3:
                return new dnw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = ag;
                if (aorbVar == null) {
                    synchronized (dnw.class) {
                        aorbVar = ag;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            ag = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
