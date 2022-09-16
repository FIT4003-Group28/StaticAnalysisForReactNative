package defpackage;
/* compiled from: PG */
/* renamed from: appd  reason: default package */
/* loaded from: classes2.dex */
public final class appd extends aopi implements aoqv {
    public static final appd a;
    private static volatile aorb w;
    private aoux A;
    private apzg B;
    private apzg C;
    private aunb D;
    private apzg E;
    private apzg F;
    private appf G;
    private appg H;
    private apzg I;

    /* renamed from: J  reason: collision with root package name */
    private apzg f92J;
    private apzg K;
    private apok L;
    private apzg M;
    private aunb N;
    public int b;
    public int c;
    public Object e;
    public apoy g;
    public avhn h;
    public apzg i;
    public arag k;
    public appa l;
    public boolean m;
    public appe n;
    public apph p;
    public arag q;
    public apzg s;
    public appb t;
    public aunb u;
    public aunb v;
    private arag x;
    private apzg y;
    private appc z;
    public int d = 0;
    private byte O = 2;
    public String f = "";
    public aopu j = emptyProtobufList();
    public aopu o = emptyProtobufList();
    public aoob r = aoob.b;

    static {
        appd appdVar = new appd();
        a = appdVar;
        aopi.registerDefaultInstance(appd.class, appdVar);
    }

    private appd() {
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
                return newMessageInfo(a, "\u0001$\u0001\u0002\u0006;$\u0000\u0002\u001f\u0006ဈ\u0001\u0007ᐉ\u0003\tᐼ\u0000\rЛ\u000fᐉ\r\u0012ᐉ\u0010\u0014ဉ\u0012\u0015ᐉ\u0011\u0016ᐉ\u0013\u0019ᐉ\t\u001aᐉ\u0014\u001bည\u0015\u001cᐉ\u0016\u001dᐉ\u0019\u001eᐉ\u001b ᐉ\u001d!ᐉ\u001e\"ᐉ\u001f#ᐉ $ᐉ!%ᐉ\f&ဇ\u000f'ᐉ\"(ᐉ#)ᐉ$.ဉ\u0004/ᐉ'0Л2ᐉ\u00174ᐉ\u00185ᐉ\u000b6ᐉ(7ᐼ\u00008ᐉ)9ᐉ*;ᐉ\u0002", new Object[]{"e", "d", "b", "c", "f", "y", avhn.class, "j", aplw.class, "l", "n", "p", "z", "q", "h", "A", "r", "B", "E", "F", "G", "H", "I", "J", "K", "k", "m", "s", "L", "M", "g", "t", "o", apoz.class, "C", "D", "i", "u", aunb.class, "v", "N", "x"});
            case 3:
                return new appd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (appd.class) {
                        aorbVar = w;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            w = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
