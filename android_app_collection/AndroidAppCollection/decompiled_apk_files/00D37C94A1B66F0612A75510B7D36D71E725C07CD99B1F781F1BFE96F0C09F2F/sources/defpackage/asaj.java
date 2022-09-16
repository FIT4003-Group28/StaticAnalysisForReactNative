package defpackage;
/* compiled from: PG */
/* renamed from: asaj  reason: default package */
/* loaded from: classes2.dex */
public final class asaj extends aopd implements aope {
    private static volatile aorb L;
    public static final asaj a;
    public atzu A;
    public arzw B;
    public asad C;
    public ario D;
    public apjs E;
    public aopu F;
    public aunb G;
    public apyo H;
    public aowh I;

    /* renamed from: J  reason: collision with root package name */
    public asak f106J;
    public arbf K;
    private aoux M;
    private avdu N;
    public int b;
    public int c;
    public arpa d;
    public atzv e;
    public asaa f;
    public asap g;
    public asan h;
    public arzt i;
    public asab j;
    public atse k;
    public appu n;
    public aopu o;
    public asam p;
    public aunb q;
    public arja r;
    public arzp s;
    public asaq t;
    public aopu u;
    public aoob v;
    public String w;
    public String x;
    public aqvf y;
    public aopu z;
    private byte O = 2;
    public aopu m = emptyProtobufList();

    static {
        asaj asajVar = new asaj();
        a = asajVar;
        aopi.registerDefaultInstance(asaj.class, asajVar);
    }

    private asaj() {
        emptyProtobufList();
        this.o = emptyProtobufList();
        this.u = emptyProtobufList();
        this.v = aoob.b;
        this.w = "";
        this.x = "";
        this.z = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.F = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.O);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.O = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001#\u0000\u0002\u0001̉#\u0000\u0005\u001c\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0004\u0006ဉ\u0005\u0007Л\tဉ\u0006\nᐉ\b\u000bᐉ\u0003\rЛ\u000eᐉ\u0007\u000fᐉ\u0001\u0010ဉ\t\u0011ᐉ\n\u0014ᐉ\r\u0015ည\u0011\u0016ဉ\u000e\u0017ဈ\u0012\u0019ဈ\u0013\u001aᐉ\u000f\u001dᐉ\u0010\u001eЛ ᐉ\u0015#ᐉ\u0017$Л&ᐉ\u0018)ᐉ\u001b*ᐉ\u001c,ᐉ\u001d.ᐉ\u001e3Л6ᐉ!8ᐉ#:ᐉ$;ᐉ%̉ᐉ&", new Object[]{"b", "c", "d", "f", "h", "i", "m", asac.class, "j", "n", "g", "o", apgz.class, "k", "e", "p", "q", "r", "v", "s", "w", "x", "t", "M", "u", asaf.class, "y", "N", "z", apzg.class, "A", "B", "C", "D", "E", "F", askq.class, "G", "H", "I", "J", "K"});
            case 3:
                return new asaj();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = L;
                if (aorbVar == null) {
                    synchronized (asaj.class) {
                        aorbVar = L;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            L = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
