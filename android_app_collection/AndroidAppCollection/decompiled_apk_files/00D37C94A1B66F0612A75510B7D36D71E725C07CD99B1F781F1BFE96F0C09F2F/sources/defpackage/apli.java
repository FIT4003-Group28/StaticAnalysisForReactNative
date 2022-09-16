package defpackage;
/* compiled from: PG */
/* renamed from: apli  reason: default package */
/* loaded from: classes.dex */
public final class apli extends aopi implements aoqv {
    private static volatile aorb M;
    public static final apli a;
    public aplj A;
    public aunb B;
    public aunb C;
    public aunb E;
    public long F;
    public aunb G;
    public apzg I;

    /* renamed from: J  reason: collision with root package name */
    public aunb f91J;
    public apzg K;
    private arag N;
    private apok O;
    private aple P;
    private arag Q;
    private arag R;
    private arag S;
    private arag T;
    private aoux U;
    private apok V;
    private aunb W;
    private aunb X;
    private aunb Y;
    private aunb Z;
    public int b;
    public int c;
    public arag d;
    public avhn e;
    public arag f;
    public arag g;
    public arag h;
    public arag i;
    public arag j;
    public apok k;
    public apld l;
    public aplq m;
    public int n;
    public apok o;
    public aplf p;
    public auez q;
    public aplc r;
    public aunb s;
    public arag u;
    public aplk v;
    public int w;
    public aunb y;
    public apzg z;
    private byte aa = 2;
    public aoob t = aoob.b;
    public aoob x = aoob.b;
    public String D = "";
    public String H = "";
    public String L = "";

    static {
        apli apliVar = new apli();
        a = apliVar;
        aopi.registerDefaultInstance(apli.class, apliVar);
    }

    private apli() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.aa);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.aa = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u00010\u0000\u0002\u000150\u0000\u0000&\u0001ᐉ\u0001\u0002ᐉ\b\u0003ᐉ\t\u0004ᐉ\n\u0005ᐉ\u0003\u0006ᐉ\u0007\u0007ᐉ\u000b\bᐉ\u0000\tᐉ\u0004\nᐉ\r\u000bᐉ\u0005\fᐉ\u000e\rᐉ\u000f\u000eᐉ\u0010\u000fᐉ\u0006\u0010ᐉ\u0011\u0011ᐉ\u0013\u0012ᐉ\u0014\u0013ᐉ\u0015\u0014ᐉ\u0016\u0015ည\u0017\u0016ᐉ\u0018\u0018ᐉ\u001a\u0019ဌ\u001d\u001bဉ\u001b\u001cည\u001f\u001eᐉ\u001c\u001fᐉ  ᐉ!!ᐉ\"\"ဉ##ᐉ\u0002$ᐉ\u0012&ᐉ%'ᐉ'(ᐉ&)ᐉ(*ဈ*+ᐉ+,ဃ,-ဌ\f.ᐉ-/ᐉ.1ဈ02ᐉ13ᐉ24ᐉ35ဈ4", new Object[]{"b", "c", "e", "k", "O", "l", "g", "j", "m", "d", "h", "o", "i", "p", "q", "P", "N", "Q", "r", "s", "S", "T", "t", "U", "u", "w", apvq.l, "v", "x", "V", "y", "W", "z", "A", "f", "R", "X", "Y", "B", "C", "D", "E", "F", "n", apfa.s, "G", "Z", "H", "I", "J", "K", "L"});
            case 3:
                return new apli();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = M;
                if (aorbVar == null) {
                    synchronized (apli.class) {
                        aorbVar = M;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            M = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
