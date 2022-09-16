package defpackage;
/* compiled from: PG */
/* renamed from: arhd  reason: default package */
/* loaded from: classes2.dex */
public final class arhd extends aopi implements aoqv {
    private static volatile aorb C;
    public static final arhd a;
    public aqxe A;
    public auom B;
    private int D;
    private asmr E;
    private atkp F;
    private avtk G;
    private aslf H;
    private byte I = 2;
    public int b;
    public asuw c;
    public asqt d;
    public asxp e;
    public athe f;
    public atqv g;
    public avvf h;
    public atdy i;
    public auaf j;
    public aunh k;
    public atdn l;
    public asvx m;
    public aupg n;
    public apdq o;
    public atps p;
    public avbb q;
    public aqdb r;
    public avyk s;
    public auks t;
    public auld u;
    public aqtp v;
    public atve w;
    public aowa x;
    public avfg y;
    public auuw z;

    static {
        arhd arhdVar = new arhd();
        a = arhdVar;
        aopi.registerDefaultInstance(arhd.class, arhdVar);
    }

    private arhd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.I = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001e\u0000\u0002︿Ḗ\ufaf1ꕋ\u001e\u0000\u0000\u0004︿Ḗᐉ\u0012\ue647㸷ᐉ\u0002\uef2e㻝ဉ\u0007\uee04㻱ဉ\t\ue698㼮ဉ\u0006\ue621㽲ᐉ\b\uf0fb㿓ဉ\f\ue518䃘ဉ\u0004\ue61a䈏ᐉ\u000e\ue973䈱ဉ\u000f\ue40d䓘ဉ\u0010\ue58c䘐ဉ\u0011\ue8dd䘱ဉ\u0013\uf40d䝠ဉ\u0014\ue29c䪉ဉ\u0015\uf45e䴰ဉ\u0016\ue1ad侷ဉ\u0019\ue722俫ဉ\u0005\ue124八ဉ\u001a\ue662君ဉ\u001c\ued51弐ဉ\u001d\uea48摧ဉ\u001e\ue435撄ဉ\u001f\ue46e炂ဉ!\ue475爜ဉ\"\uf199疺ဉ$\ue954趱ဉ\u0017ﴌ蹎ဉ%\uefebꕋဉ'\ufaf1ꕋဉ(", new Object[]{"b", "D", "G", "E", "f", "g", "e", "F", "h", "c", "i", "j", "k", "l", "m", "n", "o", "p", "r", "d", "H", "s", "t", "u", "v", "w", "x", "y", "q", "z", "A", "B"});
            case 3:
                return new arhd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = C;
                if (aorbVar == null) {
                    synchronized (arhd.class) {
                        aorbVar = C;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            C = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
