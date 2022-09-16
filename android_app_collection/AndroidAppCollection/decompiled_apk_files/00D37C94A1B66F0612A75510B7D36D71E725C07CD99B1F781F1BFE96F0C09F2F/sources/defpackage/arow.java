package defpackage;
/* compiled from: PG */
/* renamed from: arow  reason: default package */
/* loaded from: classes2.dex */
public final class arow extends aopi implements aoqv {
    private static volatile aorb T;
    public static final arow a;
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public int G;
    public float H;
    public int I;

    /* renamed from: J  reason: collision with root package name */
    public atic f103J;
    public int K;
    public int L;
    public int M;
    public String N;
    public int O;
    public aoob P;
    public int Q;
    public long R;
    public atoq S;
    private awzj U;
    public int b;
    public int c;
    public int d;
    public boolean g;
    public asvj k;
    public aopq n;
    public aopu o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public int x;
    public arox y;
    public int z;
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";

    static {
        arow arowVar = new arow();
        a = arowVar;
        aopi.registerDefaultInstance(arow.class, arowVar);
    }

    private arow() {
        emptyIntList();
        this.n = emptyIntList();
        emptyIntList();
        emptyIntList();
        this.o = emptyProtobufList();
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = "";
        this.N = "";
        this.P = aoob.b;
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
                return newMessageInfo(a, "\u0001*\u0000\u0003\u0001b*\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0003\bဈ\u0014\u000bဇ\u0002\fဈ\u001f\rဈ!\u0010ဌ\u0018\u0011ဈ\u001a\u0012ဈ$\u0013ဈ%\u0015ဈ\u0001\u0016ဈ\u0004\u0019ဈ\u0015\"ဈ\u0007#ဌ1%င3&င4'ခ7(ခ8)င9.ဌ?/ဉ\u001c1ဉ@2ငA4ဌD7င58င6=ဌ*>ဉ.@င\u0019Aခ:B\u0016CငFJဉ\nNဌMPဈGTညPV\u001b^ဌS_ဂTaဉUbဈ ", new Object[]{"b", "c", "d", "e", "h", "l", "g", "s", "u", "p", arov.a(), "r", "v", "w", "f", "i", "m", "j", "z", arka.o, "A", "B", "E", "F", "G", "I", arou.a(), "U", "J", "K", "L", arot.a(), "C", "D", "x", apwf.a(), "y", "q", "H", "n", "M", "k", "O", apfa.r, "N", "P", "o", anva.class, "Q", atnw.a(), "R", "S", "t"});
            case 3:
                return new arow();
            case 4:
                return new aopa((int[][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = T;
                if (aorbVar == null) {
                    synchronized (arow.class) {
                        aorbVar = T;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            T = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
