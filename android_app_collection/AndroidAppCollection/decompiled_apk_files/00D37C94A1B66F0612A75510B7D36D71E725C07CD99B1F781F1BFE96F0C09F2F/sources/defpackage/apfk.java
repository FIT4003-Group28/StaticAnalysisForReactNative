package defpackage;
/* compiled from: PG */
/* renamed from: apfk  reason: default package */
/* loaded from: classes.dex */
public final class apfk extends aopi implements aoqv {
    private static volatile aorb O;
    public static final apfk a;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f90J;
    public boolean K;
    public boolean L;
    public aopu M;
    public boolean N;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public float n;
    public boolean o;
    public boolean p;
    public aopu q = aopi.emptyProtobufList();
    public boolean r;
    public boolean s;
    public apfv t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public aqwu y;
    public auzl z;

    static {
        apfk apfkVar = new apfk();
        a = apfkVar;
        aopi.registerDefaultInstance(apfk.class, apfkVar);
    }

    private apfk() {
        emptyIntList();
        emptyIntList();
        this.M = aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001%\u0000\u0002\u0004>%\u0000\u0002\u0000\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဇ\u0005\u0007ဇ\u0007\bဇ\b\tဇ\t\u000bင\u000b\fင\f\rဇ\r\u000eင\u000e\u0013ခ\u0013\u0014ဇ\u0014\u0015ဇ\u0015\u0016\u001a\u0018ဇ\u0016\u0019ဇ\u0017\u001aဉ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b ဇ !ဉ!\"ဉ\"#ဇ#+ဇ),ဇ*-ဇ+.ဇ,0ဇ.5င27ဇ48ဇ59ဇ6;ဇ7<ဇ8=\u001a>ဇ9", new Object[]{"b", "c", "d", aqvj.n, "e", apfa.f, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"});
            case 3:
                return new apfk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = O;
                if (aorbVar == null) {
                    synchronized (apfk.class) {
                        aorbVar = O;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            O = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
