package defpackage;
/* compiled from: PG */
/* renamed from: avaq  reason: default package */
/* loaded from: classes2.dex */
public final class avaq extends aopi implements aoqv {
    private static volatile aorb H;
    public static final avaq a;
    public aovs B;
    public aovs C;
    public apzg E;
    public long F;
    public long G;
    private arag I;

    /* renamed from: J  reason: collision with root package name */
    private arag f123J;
    private arag K;
    private arag L;
    private avap M;
    private aoux N;
    public int b;
    public int c;
    public Object e;
    public arag g;
    public arag h;
    public arag i;
    public arag j;
    public arag k;
    public boolean l;
    public boolean n;
    public apok o;
    public avao p;
    public avau q;
    public avaw r;
    public argl t;
    public avan u;
    public int v;
    public arhs w;
    public int d = 0;
    private byte O = 2;
    public String f = "";
    public String m = "";
    public String s = "";
    public aopu x = emptyProtobufList();
    public aopu y = emptyProtobufList();
    public aopu z = emptyProtobufList();
    public aopu A = emptyProtobufList();
    public aoob D = aoob.b;

    static {
        avaq avaqVar = new avaq();
        a = avaqVar;
        aopi.registerDefaultInstance(avaq.class, avaqVar);
    }

    private avaq() {
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
                return newMessageInfo(a, "\u0001$\u0001\u0002\u0001($\u0000\u0004\u0016\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ဇ\n\u0004ဇ\f\u0005ᐉ\u0010\u0006ဌ\u0015\u0007ဈ\u0000\tᐉ\b\nᐉ\t\u000bᐉ\u0011\fᐉ\u0002\rᐉ\u0003\u000eᐉ\u001c\u000fည\u001d\u0010ᐉ\u0007\u0011ᐉ\u0016\u0012Л\u0013ြ\u0000\u0014ᐉ\u0005\u0015ᐉ\r\u0016ᐉ\u000f\u0017ᐉ\u0006\u0018ᐉ\u0013\u0019ဉ\u001a\u001aဉ\u001b\u001bᐉ\u000e\u001cဉ\u0014\u001fဈ\u0012 ᐉ !ဂ!\"Л#ြ\u0000$ဈ\u000b&Л'Л(ဂ\"", new Object[]{"e", "d", "b", "c", "I", "i", "l", "n", "q", "v", auwh.r, "f", "K", "L", "r", "g", "h", "N", "D", "J", "w", "x", apzg.class, avar.class, "j", "o", "M", "k", "t", "B", "C", "p", "u", "s", "E", "F", "y", apzg.class, avas.class, "m", "z", apzg.class, "A", apzg.class, "G"});
            case 3:
                return new avaq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = H;
                if (aorbVar == null) {
                    synchronized (avaq.class) {
                        aorbVar = H;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            H = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
