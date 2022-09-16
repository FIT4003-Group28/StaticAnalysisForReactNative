package defpackage;
/* compiled from: PG */
/* renamed from: avgq  reason: default package */
/* loaded from: classes2.dex */
public final class avgq extends aopi implements aoqv {
    public static final avgq a;
    private static volatile aorb v;
    public int b;
    public int c;
    public float d;
    public int e;
    public boolean f;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public String g = "";
    public aopq p = emptyIntList();
    public String u = "";

    static {
        avgq avgqVar = new avgq();
        a = avgqVar;
        aopi.registerDefaultInstance(avgq.class, avgqVar);
    }

    private avgq() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0002$\u0013\u0000\u0001\u0000\u0002င\u0001\u0007ခ\u0006\tင\b\nဇ\t\rဈ\n\u000eင\u000b\u000fင\f\u0010င\r\u0011င\u000e\u0012င\u000f\u0013င\u0010\u0014ဌ\u0011\u0015ဌ\u0012\u0017\u001e\u0018င\u0013\u0019င\u0014\u001cဇ\u0017#ဌ\u001d$ဈ\u001e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", aulk.p, "o", aqfh.o, "p", avge.e, "q", "r", "s", "t", atnw.a(), "u"});
            case 3:
                return new avgq();
            case 4:
                return new aopa((char[]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (avgq.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
