package defpackage;
/* compiled from: PG */
/* renamed from: avhc  reason: default package */
/* loaded from: classes2.dex */
public final class avhc extends aopi implements aoqv {
    public static final avhc a;
    private static volatile aorb n;
    public int b;
    public avgr c;
    public avgs d;
    public avhd e;
    public avha f;
    public avhb g;
    public avgw h;
    public aplz i;
    public apme j;
    public avhe k;
    public avgz l;
    public avhg m;
    private avgu o;
    private avgv p;
    private avhf q;
    private avgt r;
    private auek s;
    private avgy t;
    private avgx u;
    private avls v;
    private byte w = 2;

    static {
        avhc avhcVar = new avhc();
        a = avhcVar;
        aopi.registerDefaultInstance(avhc.class, avhcVar);
    }

    private avhc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001ￆᡇ\ue299뤞\u0013\u0000\u0000\u0010ￆᡇᐉ\u000b\uefe2ㅃဉ\u0003\uf2ff㌙ᐉ\b\ue25a㌤ᐉ\u0004\ue7fe㑇ᐉ\u0001\ue6ed㒖ဉ\u0007ﷁ㔾ᐉ\t\ue678㛸ᐉ\u0000\uefc0㨊ᐉ\u000e\ue95e㴥ᐉ\u0005\ufe27䷧ဉ\u000f\ue4f3乴ᐉ\n\ueb7a僅ᐉ\u0010\ue923幥ᐉ\u0006\ue0bf波ᐉ\u0011\ue8eb鑡ᐉ\u0002\uf23c飏ᐉ\f\uf497꽐ᐉ\u0014\ue299뤞ᐉ\u0016", new Object[]{"b", "i", "e", "g", "p", "d", "f", "s", "c", "k", "q", "l", "h", "m", "r", "t", "o", "j", "u", "v"});
            case 3:
                return new avhc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (avhc.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
