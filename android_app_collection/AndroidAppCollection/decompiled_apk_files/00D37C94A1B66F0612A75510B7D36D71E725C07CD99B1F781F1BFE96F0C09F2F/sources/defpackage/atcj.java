package defpackage;
/* compiled from: PG */
/* renamed from: atcj  reason: default package */
/* loaded from: classes2.dex */
public final class atcj extends aopi implements aoqv {
    public static final atcj a;
    private static volatile aorb am;
    public int A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f112J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public int aa;
    public int ab;
    public int ac;
    public boolean ad;
    public int ae;
    public int af;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public int al;
    private int an;
    private int ao;
    private int ap;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public aopu g = aopi.emptyProtobufList();
    public aopq V = emptyIntList();
    public aopu ag = aopi.emptyProtobufList();

    static {
        atcj atcjVar = new atcj();
        a = atcjVar;
        aopi.registerDefaultInstance(atcj.class, atcjVar);
    }

    private atcj() {
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
                return newMessageInfo(a, "\u0001>\u0000\u0004\u0006u>\u0000\u0003\u0000\u0006ဇ\u0005\bဋ\u0006\u000eဇ\f\u0016ဇ\u0014\u0017\u001a\u0018ဋ\u0015\u001aဇ\u0017\u001cဇ\u0019\u001dဇ\u001a\u001eဇ\u001b\u001fဋ\u001c ဇ\u001d!ဋ\u001e\"ဇ\u001f%ဇ\"(ဇ%)ဇ&*ဇ'/ဇ,0ဇ-1ဇ.3ဇ04ဇ17ဇ4=ဋ:>ဇ;?ဇ<Aခ>Bခ?Cဇ@EဇBGဇDPဇMQဇNRဋOSဋPUဋRWဇTYဋVZဋW[ဋX\\ဋY]ဋZ^ဋ[_ဋ\\`\u001daဋ]bဋ^cဋ_dဇ`eဋafဋbgဌciဇejဋfkဋgl\u001amဇhoဇjrဇmtဇouဋp", new Object[]{"b", "an", "ao", "ap", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", atdq.a, "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al"});
            case 3:
                return new atcj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = am;
                if (aorbVar == null) {
                    synchronized (atcj.class) {
                        aorbVar = am;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            am = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
