package defpackage;
/* compiled from: PG */
/* renamed from: alcw  reason: default package */
/* loaded from: classes.dex */
public final class alcw extends aopi implements aoqv {
    public static final alcw a;
    private static volatile aorb ap;
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long G;
    public alct H;
    public alct I;

    /* renamed from: J  reason: collision with root package name */
    public alct f62J;
    public alct K;
    public alct L;
    public alct M;
    public alcr P;
    public boolean S;
    public boolean T;
    public avzc U;
    public int X;
    public alct Y;
    public avvd Z;
    public alct aa;
    public alct ab;
    public boolean ac;
    public boolean ad;
    public int ae;
    public int af;
    public alct ag;
    public alct ah;
    public alct ai;
    public alct ak;
    public alcs al;
    public boolean am;
    public boolean an;
    public awbb ao;
    public int b;
    public int c;
    public int d;
    public long h;
    public alda i;
    public arxl j;
    public int l;
    public int m;
    public alcx p;
    public alcp q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public alcq v;
    public alct w;
    public boolean x;
    public alct y;
    private byte aq = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String k = "";
    public aoob n = aoob.b;
    public aoob o = aoob.b;
    public String z = "";
    public String E = "";
    public String F = "";
    public aopu N = aopi.emptyProtobufList();
    public aopu O = aopi.emptyProtobufList();
    public String Q = "";
    public aopu R = aopi.emptyProtobufList();
    public String V = "";
    public String W = "";
    public String aj = "";

    static {
        alcw alcwVar = new alcw();
        a = alcwVar;
        aopi.registerDefaultInstance(alcw.class, alcwVar);
    }

    private alcw() {
    }

    public static /* synthetic */ void a(alcw alcwVar) {
        alcwVar.c |= 2048;
        alcwVar.S = true;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.aq);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.aq = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001?\u0000\u0003\u0001ϫ?\u0000\u0003\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0004\u0004ဈ\u0006\u0005ဈ \u0006ဈ!\u0007ဉ#\bဉ&\tဈ/\nဌ0\u000bဉ1\fဉ3\rဉ4\u000eဇ5\u000fဉ9\u0010ဃ\u0003\u0011ဈ.\u0012ဈ<\u0013ဉ=\u0014ဉ\u0017\u0015ဉ\u0018\u001cဉ;\u001eဉ'\u001fဌ\u0007 ဉ(!\u001a\"\u001a$ဉ)%ဇ6&ဉ?'ဈ*)ည\u000b*\u001a+ဇ+,ဉ$-ဃ\".ဉ-/ဇA0ဇ,1ဉ\u001a2ဈ\u001b3ဇ\u00194ဉ%5ဌ76ဌ87ဉ\r8ဌ\u00109ᐉ\u0005:ᐉ2;ဉC<ဇ\u0014=ဇ\u0015>ဈ\u0002?ည\f@ဉ\u000eAဉ:Bဇ\u001fCဌ\bDဇ\u0016EဇBϩဃ\u001cϪဃ\u001eϫဃ\u001d", new Object[]{"b", "c", "d", "e", "f", "i", "k", "E", "F", "H", "K", "W", "X", alcv.b(), "Y", "aa", "ab", "ac", "ag", "h", "V", "aj", "ak", "v", "w", "ai", "L", "l", alcu.b(), "M", "N", "O", "P", "ad", "al", "Q", "n", "R", "S", "I", "G", "U", "am", "T", "y", "z", "x", "J", "ae", avuo.a(), "af", avun.a(), "p", "r", adzd.e, "j", "Z", "ao", "s", "t", "g", "o", "q", "ah", "D", "m", avuk.a(), "u", "an", "A", "C", "B"});
            case 3:
                return new alcw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = ap;
                if (aorbVar == null) {
                    synchronized (alcw.class) {
                        aorbVar = ap;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            ap = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
