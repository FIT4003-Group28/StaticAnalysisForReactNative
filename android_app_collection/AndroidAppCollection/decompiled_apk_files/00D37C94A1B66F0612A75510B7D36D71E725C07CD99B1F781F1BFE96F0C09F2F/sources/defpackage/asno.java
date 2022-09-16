package defpackage;
/* compiled from: PG */
/* renamed from: asno  reason: default package */
/* loaded from: classes2.dex */
public final class asno extends aopi implements aoqv {
    public static final asno a;
    private static volatile aorb y;
    public int b;
    public int c;
    public int d;
    public boolean h;
    public boolean i;
    public boolean l;
    public boolean m;
    public int n;
    public boolean r;
    public int s;
    public int u;
    public asnq v;
    public asnt w;
    public asnu x;
    public String e = "";
    public String f = "";
    public String g = "";
    public String j = "";
    public String k = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String t = "";

    static {
        asno asnoVar = new asno();
        a = asnoVar;
        aopi.registerDefaultInstance(asno.class, asnoVar);
    }

    private asno() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0002\u0001N\u0015\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0002\u0006ဇ\b\bဈ\n\tဇ\u000e\u000fင\u0016\u0011ဇ\u0010\u0013ဈ\u0018\u0016ဉ2\u0018ဉ4\u001fဈ! ဇ\"+င',ဈ(6ဉ>7ဇ\u0004Gဌ-Lဈ\rNဈ\u001a", new Object[]{"b", "c", "d", asny.a(), "e", "g", "f", "i", "j", "l", "n", "m", "o", "v", "w", "q", "r", "s", "t", "x", "h", "u", asev.r, "k", "p"});
            case 3:
                return new asno();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = y;
                if (aorbVar == null) {
                    synchronized (asno.class) {
                        aorbVar = y;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            y = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
