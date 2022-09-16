package defpackage;
/* compiled from: PG */
/* renamed from: auaf  reason: default package */
/* loaded from: classes2.dex */
public final class auaf extends aopi implements aoqv {
    private static volatile aorb Y;
    public static final auaf a;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f115J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    private int Z;
    private int aa;
    private int ab;
    public int b;
    public int c;
    public apgh d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public aubv r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        auaf auafVar = new auaf();
        a = auafVar;
        aopi.registerDefaultInstance(auaf.class, auafVar);
    }

    private auaf() {
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
                return newMessageInfo(a, "\u0001/\u0000\u0005\f\uf393墷/\u0000\u0000\u0000\fဇ)\u000fဉ+\u001bဇ2\u001eင4'ဇ@)ဇBHဇ[Iဇ:Kဇ\\Lဇ]QဇbRဇcXဇhYဇiZဇj[ဇk\\ဇ\u001fhဇwjဇykဇzlဇ{nဇ}oဇ~pဇ\u007ftဇ=uဇ<vဇ\u0083wခ\u0084xဇ^~ဇ\u008a\u007fဇ\u008b\u0080ဇ\u008c\u0084ဇ\u0090\u0085ဇ\u0092\u0089ဇ\u0095\ued7c୍ဇ\u0017ﮀ䈿ဉ\u0000\ue156䎣ဇ\u0007ﱥ䔘ဇ\n\uf4e1䔴ဇ\b\uf336䢒ဇ\u0012\uf337䢒င\u0013精䷙ဇ\u0014\ueb3f厙င\u0005\ue0e9囫ဇ\u001e\uecbc墶ဇ#\uf393墷ဇ$", new Object[]{"b", "Z", "aa", "ab", "c", "q", "r", "s", "t", "x", "y", "z", "u", "A", "B", "D", "E", "F", "G", "H", "I", "n", "J", "K", "L", "M", "N", "O", "P", "w", "v", "Q", "R", "C", "S", "T", "U", "V", "W", "X", "l", "d", "f", "h", "g", "i", "j", "k", "e", "m", "o", "p"});
            case 3:
                return new auaf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = Y;
                if (aorbVar == null) {
                    synchronized (auaf.class) {
                        aorbVar = Y;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            Y = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
