package defpackage;
/* compiled from: PG */
/* renamed from: atzv  reason: default package */
/* loaded from: classes2.dex */
public final class atzv extends aopi implements aoqv {
    private static volatile aorb L;
    public static final atzv a;
    public apgg A;
    public auzl B;
    public apgf C;
    public aunv D;
    public apap E;
    public aubr F;
    public asun G;
    public apyx H;
    public aqjw I;

    /* renamed from: J  reason: collision with root package name */
    public aszz f114J;
    public auae K;
    private awgo M;
    private byte N = 2;
    public int b;
    public int c;
    public aqfn d;
    public aqwu e;
    public apim f;
    public atzg g;
    public atyr h;
    public apak i;
    public apfm j;
    public apfz k;
    public atnv l;
    public atzw m;
    public asop n;
    public apav o;
    public auzz p;
    public apam q;
    public auwr r;
    public atcx s;
    public avwb t;
    public aqkp u;
    public awbw v;
    public apdz w;
    public aubt x;
    public aujw y;
    public aqke z;

    static {
        atzv atzvVar = new atzv();
        a = atzvVar;
        aopi.registerDefaultInstance(atzv.class, atzvVar);
    }

    private atzv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.N);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.N = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001#\u0000\u0002\uecf6ᩫﶝ紅#\u0000\u0000\u0002\uecf6ᩫဉ\u0006\uf6f3ᮒဉ\u0001\uf5b9\u1ca8ဉ\u0007\ue901₱ဉ\f\uf166₴ဉ\u000f\ue0e9™ဉ\u000e\uf5f4⎗ဉ\u0014ﱡ┤ဉ\u0015\uef6c▦ဉ\r\uf390⢵ဉ\u0016\uf53f⪙ဉ\u0018\ue5c0ⱈဉ\u001a鬒Ⳮဉ\u0011\uf29e⺷ᐉ\u001e\ue173⼗ဉ\u001d\ufd43らဉ\u001f\ue1abㄞဉ \ue2cc㓖ဉ#ﲬ㟵ဉ$\ueef5㠘ဉ&﹊㡎ဉ%\ue912㤁ဉ'\ue5b5㥳ဉ(\ue9ae㮀ဉ*ﭑ㯕ဉ,\ue2d6㹳ဉ.\uf66d䉪ဉ/\ue4e9䉴ဉ+\uf463䧻ဉ0\uea9b䪟ဉ\b\ue708圭ဉ2\ue9c0曣ဉ\u0000\uf010癝ဉ7珞皍ᐉ6ﶝ紅ဉ9", new Object[]{"b", "c", "f", "e", "g", "i", "l", "k", "n", "o", "j", "p", "q", "r", "m", "t", "s", "u", "v", "w", "x", "z", "y", "A", "B", "C", "E", "F", "G", "D", "H", "h", "I", "d", "J", "M", "K"});
            case 3:
                return new atzv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = L;
                if (aorbVar == null) {
                    synchronized (atzv.class) {
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
