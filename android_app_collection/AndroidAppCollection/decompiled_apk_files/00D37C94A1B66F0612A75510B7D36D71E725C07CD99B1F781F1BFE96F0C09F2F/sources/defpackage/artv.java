package defpackage;
/* compiled from: PG */
/* renamed from: artv  reason: default package */
/* loaded from: classes2.dex */
public final class artv extends aopi implements aoqv {
    public static final artv a;
    private static volatile aorb m;
    public int b;
    public arpa c;
    public auls d;
    public asaj e;
    public apzg f;
    public apzg g;
    public int h;
    public int j;
    public apzg k;
    private aoux n;
    private arbf o;
    private aunb p;
    private byte q = 2;
    public aoob i = aoob.b;
    public String l = "";

    static {
        artv artvVar = new artv();
        a = artvVar;
        aopi.registerDefaultInstance(artv.class, artvVar);
    }

    private artv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001̉\r\u0000\u0000\t\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဌ\u0005\tᐉ\u0007\nည\b\fဌ\n\rᐉ\f\u000eဈ\r\u000fᐉ\u000ẻᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", auii.q, "n", "i", "j", aulb.a(), "k", "l", "p", "o"});
            case 3:
                return new artv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (artv.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
