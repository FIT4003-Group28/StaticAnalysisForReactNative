package defpackage;
/* compiled from: PG */
/* renamed from: atpo  reason: default package */
/* loaded from: classes2.dex */
public final class atpo extends aopi implements aoqv {
    private static volatile aorb A;
    public static final atpo a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public aopq i = emptyIntList();
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    static {
        atpo atpoVar = new atpo();
        a = atpoVar;
        aopi.registerDefaultInstance(atpo.class, atpoVar);
    }

    private atpo() {
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001e\u0018\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0005ဇ\u0004\u0006ဇ\u0005\u0007\u0016\bဇ\u0006\tင\u0007\nဇ\b\fဇ\t\rင\n\u000fဇ\u000e\u0010ဇ\u000f\u0014ဇ\u0013\u0015င\u0014\u0016င\u0015\u0017ဇ\u0016\u0018င\u0017\u0019င\u0018\u001aဇ\u000b\u001bဇ\f\u001cဇ\u0003\u001dဇ\u0019\u001eဇ\u001a", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "n", "q", "r", "s", "t", "u", "v", "w", "x", "o", "p", "f", "y", "z"});
            case 3:
                return new atpo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (atpo.class) {
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
