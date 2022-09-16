package defpackage;
/* compiled from: PG */
/* renamed from: aull  reason: default package */
/* loaded from: classes2.dex */
public final class aull extends aopi implements aoqv {
    private static volatile aorb K;
    public static final aull a;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f118J;
    private int L;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        aull aullVar = new aull();
        a = aullVar;
        aopi.registerDefaultInstance(aull.class, aullVar);
    }

    private aull() {
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
                return newMessageInfo(a, "\u0001\"\u0000\u0002\u00014\"\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0005ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\u000bဇ\t\rဇ\u000b\u000eဇ\r\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0015\u0016ဇ\u0014\u0017ဇ\f\u0018ဇ\u0016\u0019ဇ\u0017\u001cဇ\u001a\u001dဇ\u001b\u001eဇ\u001c ဇ \"ဇ\u001e$ဇ\"%ဇ#&ဇ$'ဇ%(ဇ&)ဇ',ဇ*-ဇ+.ဇ,0ဇ.1င/4ဇ2", new Object[]{"b", "L", "c", "d", "e", auii.n, "f", "g", "h", "i", "j", "k", "m", "n", "o", "q", "p", "l", "r", "s", "t", "u", "v", "x", "w", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"});
            case 3:
                return new aull();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = K;
                if (aorbVar == null) {
                    synchronized (aull.class) {
                        aorbVar = K;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            K = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
