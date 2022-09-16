package defpackage;
/* compiled from: PG */
/* renamed from: azzv  reason: default package */
/* loaded from: classes2.dex */
public final class azzv extends aopi implements aoqv {
    private static volatile aorb A;
    public static final azzv a;
    public int b;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public baaf l;
    public int m;
    public azzt n;
    public int o;
    public azzk p;
    public long q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public aopt w;
    public String x;
    public azzz y;
    public azzr z;
    private byte B = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        azzv azzvVar = new azzv();
        a = azzvVar;
        aopi.registerDefaultInstance(azzv.class, azzvVar);
    }

    private azzv() {
        emptyProtobufList();
        this.v = "";
        this.w = emptyLongList();
        this.x = "";
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဌ\b\nဉ\t\u000bဉ\u000b\fᐉ\r\rဂ\u000e\u000eဌ\u000f\u000fဌ\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018ဌ\n\u0019ဈ\u0002\u001aဉ\u0017\u001bဌ\f", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", axce.q, "l", "n", "p", "q", "r", azzy.a(), "s", axce.p, "u", "v", "t", "x", "w", "y", "m", azzu.a(), "e", "z", "o", azzx.a()});
            case 3:
                return new azzv();
            case 4:
                return new aopa((float[][][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (azzv.class) {
                        aorbVar = A;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            A = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
