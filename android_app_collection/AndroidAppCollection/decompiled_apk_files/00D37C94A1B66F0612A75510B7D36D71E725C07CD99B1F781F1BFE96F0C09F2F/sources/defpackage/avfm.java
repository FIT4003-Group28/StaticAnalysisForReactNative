package defpackage;
/* compiled from: PG */
/* renamed from: avfm  reason: default package */
/* loaded from: classes2.dex */
public final class avfm extends aopi implements aoqv {
    public static final avfm a;
    private static volatile aorb f;
    public int b;
    public aoxh c;
    public auvy d;
    public avfh e;
    private apvj g;
    private auvz h;
    private avll i;
    private aqyd j;
    private byte k = 2;

    static {
        avfm avfmVar = new avfm();
        a = avfmVar;
        aopi.registerDefaultInstance(avfm.class, avfmVar);
    }

    private avfm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ue9beⓏ﹤냷\u0007\u0000\u0000\u0007\ue9beⓏᐉ\u0000\ue64a⤉ᐉ\u0002履\u2b4eᐉ\u0001\uf223㙻ᐉ\u0003\ue057䫂ᐉ\u0004\uecd7斿ᐉ\u0005﹤냷ᐉ\u0006", new Object[]{"b", "c", "d", "g", "h", "i", "j", "e"});
            case 3:
                return new avfm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avfm.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
