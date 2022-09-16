package defpackage;
/* compiled from: PG */
/* renamed from: arxm  reason: default package */
/* loaded from: classes2.dex */
public final class arxm extends aopi implements aoqv {
    public static final arxm a;
    private static volatile aorb e;
    private arxq A;
    private arxq B;
    private arxq C;
    private arxq D;
    private arxq E;
    private arxq F;
    private arxq G;
    private arxq H;
    private arxq I;

    /* renamed from: J  reason: collision with root package name */
    private arxq f105J;
    private arxq K;
    private arxq L;
    private arxq M;
    private arxq N;
    private arxq O;
    private arxq P;
    private arxq Q;
    private arxq R;
    private arxq S;
    private arxq T;
    private arxq U;
    private arxq V;
    private arxq W;
    private arxq X;
    private arxq Y;
    private arxq Z;
    private arxq aa;
    private arxq ab;
    private arxq ac;
    private arxq ad;
    private arxq ae;
    private arxq af;
    private arxq ag;
    private arxq ah;
    private arxq ai;
    private arxq aj;
    private arxq ak;
    private arxq al;
    private arxq am;
    private arxq an;
    private arxq ao;
    private arxq ap;
    private arxq aq;
    private arxo ar;
    private arxn as;
    private aqje at;
    private arbf au;
    private byte av = 2;
    public int b;
    public arpa c;
    public arxp d;
    private int f;
    private int g;
    private apzg h;
    private arxq i;
    private arxq j;
    private arxq k;
    private arxq l;
    private arxq m;
    private arxq n;
    private arxq o;
    private arxq p;
    private arxq q;
    private arxq r;
    private arxq s;
    private arxq t;
    private arxq u;
    private arxq v;
    private arxq w;
    private arxq x;
    private arxq y;
    private arxq z;

    static {
        arxm arxmVar = new arxm();
        a = arxmVar;
        aopi.registerDefaultInstance(arxm.class, arxmVar);
    }

    private arxm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.av);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.av = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001D\u0000\u0003\u0001̉D\u0000\u0000D\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000b\fᐉ\f\rᐉ\r\u000fᐉ@\u0010ᐉA\u0011ᐉ\u000e\u0012ᐉ\u000f\u0013ᐉ\u0010\u0014ᐉ\u0011\u0015ᐉ\u0016\u0016ᐉ\u0017\u0017ᐉ\u0018\u0018ᐉ\u0019\u0019ᐉ\u001b\u001aᐉ\u001c\u001bᐉ\u001d\u001cᐉB\u001dᐉ\u001e\u001eᐉ\u001f\u001fᐉ  ᐉ!!ᐉ\"\"ᐉ#$ᐉ%%ᐉ&(ᐉ')ᐉ(*ᐉ)+ᐉ*,ᐉ,-ᐉ..ᐉ//ᐉ00ᐉ11ᐉ\u00062ᐉ+3ᐉ45ᐉ26ᐉ37ᐉ-8ᐉ59ᐉ6:ᐉ7;ᐉ\u0012<ᐉ\u0013=ᐉ\u0014>ᐉ\u0015?ᐉ$@ᐉ8Aᐉ9Bᐉ:Cᐉ;Dᐉ<Eᐉ=Fᐉ>Gᐉ?Hᐉ\u001ảᐉC", new Object[]{"b", "f", "g", "c", "h", "d", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "ar", "as", "t", "u", "v", "w", "B", "C", "D", "E", "G", "H", "I", "at", "J", "K", "L", "M", "N", "O", "Q", "R", "S", "T", "U", "V", "X", "Z", "aa", "ab", "ac", "l", "W", "af", "ad", "ae", "Y", "ag", "ah", "ai", "x", "y", "z", "A", "P", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "F", "au"});
            case 3:
                return new arxm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arxm.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
