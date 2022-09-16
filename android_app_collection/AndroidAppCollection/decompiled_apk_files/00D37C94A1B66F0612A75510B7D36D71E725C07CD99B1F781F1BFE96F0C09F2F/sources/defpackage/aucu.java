package defpackage;
/* compiled from: PG */
/* renamed from: aucu  reason: default package */
/* loaded from: classes2.dex */
public final class aucu extends aopi implements aoqv {
    private static volatile aorb O;
    public static final aucu a;
    public asow A;
    public apok B;
    public int C;
    public auct D;
    public apok E;
    public aoob F;
    public String G;
    public apon H;
    public aucv I;

    /* renamed from: J  reason: collision with root package name */
    public aucn f116J;
    public aucq K;
    public aucr L;
    public aucs M;
    public aopu N;
    private arag P;
    private aueo Q;
    private arag R;
    private arag S;
    private arag T;
    private arag U;
    private arag V;
    private aucp W;
    private apzg X;
    private apzg Y;
    private aoux Z;
    private apzg aa;
    private apzg ab;
    private aunb ac;
    private aunb ad;
    private apzg ae;
    public int b;
    public int c;
    public Object e;
    public Object g;
    public apzg i;
    public aunb j;
    public aunb k;
    public asos l;
    public boolean m;
    public arag n;
    public arag o;
    public arag p;
    public avhn q;
    public avhn r;
    public arag s;
    public arag t;
    public arag u;
    public apzg v;
    public aopu w;
    public aucw x;
    public aucm y;
    public auco z;
    public int d = 0;
    public int f = 0;
    private byte af = 2;
    public String h = "";

    static {
        aucu aucuVar = new aucu();
        a = aucuVar;
        aopi.registerDefaultInstance(aucu.class, aucuVar);
    }

    private aucu() {
        emptyProtobufList();
        this.w = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.F = aoob.b;
        this.G = "";
        emptyProtobufList();
        emptyProtobufList();
        this.N = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.af);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.af = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u00015\u0002\u0002\u0001F5\u0000\u0002-\u0001ဈ\u0000\u0002ᐼ\u0000\u0003ᐉ\u000b\u0004ᐉ\u0010\u0005ᐉ\u0012\u0006ᐉ\u0013\u0007ᐉ\u0014\bᐉ\u0016\tᐉ\u001a\u000bဉ\u001b\rᐉ\u001e\u000fᐉ\"\u0010ဌ$\u0011ᐉ\u0015\u0012ဉ\u001d\u0013ᐉ%\u0014ᐉ)\u0015ᐉ&\u0016ᐉ(\u0017ည*\u0019ᐉ\u0017\u001aᐉ\u0018\u001bᐉ\u0019\u001cᐼ\u0001\u001dᐉ\n\u001eဈ+\u001fᐉ\u000f Л(ᐉ,)ᐉ-*ᐉ\u0003,ᐉ\u001f-ᐉ'.ᐉ./ᐉ/1ᐉ22ᐉ35ᐉ56ᐉ67ᐉ78ဉ\b9ᐉ#:ᐉ\f;ᐉ\r=ᐉ\u000e>ဇ\t?ᐼ\u0000@ᐼ\u0001Aᐉ0Bᐉ1Dᐉ\u0006Eᐉ\u0007FЛ", new Object[]{"e", "d", "g", "f", "b", "c", "h", apzg.class, "n", "r", "s", "t", "u", "R", "V", "x", "W", "A", "C", auca.p, "v", "y", "X", "Z", "D", "Y", "F", "S", "T", "U", apzg.class, "P", "G", "Q", "w", arag.class, "aa", "ab", "i", "z", "E", "H", "I", "J", "K", "L", "ae", "M", "l", "B", "o", "p", "q", "m", aunb.class, aunb.class, "ac", "ad", "j", "k", "N", aunb.class});
            case 3:
                return new aucu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = O;
                if (aorbVar == null) {
                    synchronized (aucu.class) {
                        aorbVar = O;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            O = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
