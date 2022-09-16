package defpackage;
/* compiled from: PG */
/* renamed from: asuw  reason: default package */
/* loaded from: classes2.dex */
public final class asuw extends aopi implements aoqv {
    private static volatile aorb Q;
    public static final asuw a;
    public aopu A;
    public boolean B;
    public boolean C;
    public aopu D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f109J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    private int R;
    private int S;
    private int T;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public float y;
    public boolean z;

    static {
        asuw asuwVar = new asuw();
        a = asuwVar;
        aopi.registerDefaultInstance(asuw.class, asuwVar);
    }

    private asuw() {
        emptyIntList();
        this.A = aopi.emptyProtobufList();
        this.D = aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001)\u0000\u0003\u0006\\)\u0000\u0002\u0000\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\u0011ဌ\u0010\u0012င\t\u0013ဇ\u0011\u0014ဇ\u0013\u0019ဇ\u0018\u001aဇ\u0019\u001dဇ\u001c\u001eဇ\u001d\u001fဇ\u001e ဇ !င!\"င\"#င#$င$%င%&ဇ&'င1(ခ2,ဇ51\u001a7ဇ;8င\u001f?ဇ@A\u001aCဇEEင0NငIQဇJRဇKSဇMUငOVငPWဇLXဇQYဇRZဇS\\ဇU", new Object[]{"R", "S", "T", "b", "c", "d", "e", "g", asut.c, "f", "h", "i", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z", "A", "B", "o", "C", "D", "E", "w", "F", "G", "H", "J", "K", "L", "I", "M", "N", "O", "P"});
            case 3:
                return new asuw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = Q;
                if (aorbVar == null) {
                    synchronized (asuw.class) {
                        aorbVar = Q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            Q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
