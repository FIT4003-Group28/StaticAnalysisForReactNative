package defpackage;
/* compiled from: PG */
/* renamed from: atts  reason: default package */
/* loaded from: classes2.dex */
public final class atts extends aopi implements aoqv {
    public static final aopr a = new asvu(4);
    public static final atts b;
    private static volatile aorb s;
    public int c;
    public long f;
    public long h;
    public long i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public apfv p;
    public boolean r;
    private int t;
    public aoob d = aoob.b;
    public aoob e = aoob.b;
    public String g = "";
    public aopq q = emptyIntList();

    static {
        atts attsVar = new atts();
        b = attsVar;
        aopi.registerDefaultInstance(atts.class, attsVar);
    }

    private atts() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u000f\u0000\u0002\u0001\"\u000f\u0000\u0001\u0000\u0001ည\u0000\u0002ဂ\u0002\u0003ည\u0001\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\u000bဇ\n\u000eင\r\u000fင\u000e\u0010င\u000f\u0013င\u0012\u0019င\u0018\u001bဉ\u001a ,\"ဇ ", new Object[]{"c", "t", "d", "f", "e", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", apwf.a(), "r"});
            case 3:
                return new atts();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (atts.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
