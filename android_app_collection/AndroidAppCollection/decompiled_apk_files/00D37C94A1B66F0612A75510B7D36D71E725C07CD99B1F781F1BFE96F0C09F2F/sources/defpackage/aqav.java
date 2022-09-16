package defpackage;
/* compiled from: PG */
/* renamed from: aqav  reason: default package */
/* loaded from: classes2.dex */
public final class aqav extends aopi implements aoqv {
    private static volatile aorb Q;
    public static final aqav a;
    public aoob A;
    public aplq B;
    public apzg C;
    public apzg D;
    public aqax E;
    public boolean F;
    public aopu G;
    public int H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public aqay f93J;
    public aqaw K;
    public aopu L;
    public aunb M;
    public boolean N;
    public arag O;
    public boolean P;
    private arag R;
    private arag S;
    private arag T;
    private arag U;
    private apok V;
    private arag W;
    private aplw X;
    private aqjj Y;
    private aoux Z;
    private aqbe aa;
    private aqby ab;
    private aunb ac;
    private apok ad;
    private arag ae;
    private aunb af;
    private aunb ag;
    private aunb ah;
    public int b;
    public int c;
    public int d;
    public Object f;
    public Object h;
    public aunb j;
    public arag k;
    public int l;
    public avhn m;
    public apzg n;
    public boolean o;
    public arag p;
    public apok q;
    public arag r;
    public arag s;
    public apzl t;
    public ates u;
    public aqaq v;
    public apzp w;
    public apzp x;
    public apzp y;
    public apzp z;
    public int e = 0;
    public int g = 0;
    private byte ai = 2;
    public String i = "";

    static {
        aqav aqavVar = new aqav();
        a = aqavVar;
        aopi.registerDefaultInstance(aqav.class, aqavVar);
    }

    private aqav() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.A = aoob.b;
        this.G = emptyProtobufList();
        this.L = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.ai);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.ai = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u00017\u0002\u0003\u0001^7\u0000\u0002*\u0001ᐉ\u0005\u0002ᐉ\t\u0003ᐉ\n\u0004ᐉ\u000e\u0005ᐉ\u0012\bᐉ\u0017\tဈ\u0000\nᐉ\u0016\fᐼ\u0001\u000eᐉ\u000f\u0012ᐉ\u001e\u0013ည%\u0014ᐉ&\u0017ᐉ'\u0018ᐉ(\u0019ᐉ\u0007\u001aᐉ\r\u001bဇ\f\u001cᐉ\u0015\u001eဌ\b\u001fဿ\u0000 ᐉ)!ᐉ \"ᐉ\u0010#ᐉ\u0011$ᐉ+&ᐉ*'ᐉ\u001f(ဇ-)ᐉ,*ဌ.+ᐼ\u0001,ᐉ$-Л1ᐉ\u00062ဇ23ᐉ\u00185ဉ47ᐉ\u001b8ᐉ59ဉ6:ᐉ!;\u001b<ᐉ#>ᐉ:NᐉAOဇBQᐉ\u0004SᐉETᐉFVᐉHZဇJ\\ᐉD]ᐉL^ᐼ\u0000", new Object[]{"f", "e", "h", "g", "b", "c", "d", "k", "m", "n", "p", "r", "u", "i", "t", arag.class, "U", "X", "A", "Z", "aa", "B", "S", "T", "o", "s", "l", apvq.p, apvq.q, "C", "x", "q", "V", "E", "D", "w", "F", "ab", "H", aqal.a(), aplw.class, "Y", "G", apzg.class, "R", "I", "v", "J", "W", "ac", "K", "y", "L", aqau.class, "z", "ad", "M", "N", "j", "af", "ag", "O", "P", "ae", "ah", aqat.class});
            case 3:
                return new aqav();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = Q;
                if (aorbVar == null) {
                    synchronized (aqav.class) {
                        aorbVar = Q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            Q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
