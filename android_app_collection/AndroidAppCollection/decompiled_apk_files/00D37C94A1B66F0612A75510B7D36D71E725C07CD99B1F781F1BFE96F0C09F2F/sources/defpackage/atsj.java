package defpackage;
/* compiled from: PG */
/* renamed from: atsj  reason: default package */
/* loaded from: classes2.dex */
public final class atsj extends aopi implements aoqv {
    private static volatile aorb B;
    public static final atsj a;
    public boolean A;
    public int b;
    public int c;
    public int g;
    public int h;
    public int i;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public int r;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public boolean y;
    public aoob z;
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String s = "";

    static {
        atsj atsjVar = new atsj();
        a = atsjVar;
        aopi.registerDefaultInstance(atsj.class, atsjVar);
    }

    private atsj() {
        emptyProtobufList();
        this.z = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0002\u0001(\u0018\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0004\u0003ဌ\u0005\u0004ဂ\b\u0005ဂ\t\u0007ဌ\u000e\bဇ\u000f\tဌ\u0010\nဈ\u0013\u000bဌ\u0014\rဋ\u0017\u000fဇ\u0019\u0014ဈ\u0001\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u001dဌ\u0015\u001eဈ\u0002!ဌ!$ဇ$%ဈ\u0007&ဌ\u0003'ည%(ဇ&", new Object[]{"b", "c", "d", "h", atqy.s, "i", atsg.a(), "k", "l", "p", aqlv.a(), "q", "r", atqy.d, "s", "t", attl.a(), "v", "w", "e", "m", "n", "o", "u", atov.f, "f", "x", atqy.q, "y", "j", "g", atqy.t, "z", "A"});
            case 3:
                return new atsj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = B;
                if (aorbVar == null) {
                    synchronized (atsj.class) {
                        aorbVar = B;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            B = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
