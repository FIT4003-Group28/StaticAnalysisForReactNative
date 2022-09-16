package defpackage;
/* compiled from: PG */
/* renamed from: oqu  reason: default package */
/* loaded from: classes4.dex */
public final class oqu extends aopi implements aoqv {
    private static volatile aorb A;
    public static final oqu a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public int j;
    public boolean k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public boolean s;
    public int t;
    public int u;
    public long v;
    public boolean w;
    public orb x;
    public long y;
    public int z;

    static {
        oqu oquVar = new oqu();
        a = oquVar;
        aopi.registerDefaultInstance(oqu.class, oquVar);
    }

    private oqu() {
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\r+\u0018\u0000\u0000\u0000\rဂ\u0000\u000eဏ\u0001\u0010င\u0002\u0011ဌ\u0003\u0012င\u0004\u0013င\u0005\u0014ဂ\u0006\u0015င\u0007\u0016ဇ\b\u0017ဂ\t\u0018ဌ\n\u0019ဌ\u000b\u001aဌ\f\u001bဌ\r\u001cဂ\u000e\u001dဂ\u000f\u001eဇ\u0010 ဌ\u0011\"င\u0013$ဂ\u0015%ဇ\u0016&ဉ\u0017'ဂ\u0018+င\u001c", new Object[]{"b", "c", "d", "e", "f", aqlv.a(), "g", "h", "i", "j", "k", "l", "m", apfa.u, "n", apfa.u, "o", awan.a(), "p", atyc.a(), "q", "r", "s", "t", atdq.o, "u", "v", "w", "x", "y", "z"});
            case 3:
                return new oqu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (oqu.class) {
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
