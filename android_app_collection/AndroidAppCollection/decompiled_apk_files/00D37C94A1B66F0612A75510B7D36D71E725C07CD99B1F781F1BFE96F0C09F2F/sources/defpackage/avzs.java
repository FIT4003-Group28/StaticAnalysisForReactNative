package defpackage;
/* compiled from: PG */
/* renamed from: avzs  reason: default package */
/* loaded from: classes2.dex */
public final class avzs extends aopd implements aope {
    public static final avzs a;
    private static volatile aorb j;
    private arag A;
    private arag B;
    private apoq C;
    private avzp D;
    private arag E;
    private aoux F;
    private avzu G;
    private avzq H;
    private avzt I;

    /* renamed from: J  reason: collision with root package name */
    private apzg f129J;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public arag h;
    public asow i;
    private int k;
    private apmg m;
    private apmg n;
    private arag o;
    private avzv p;
    private arag q;
    private arag r;
    private avzr s;
    private arag t;
    private arag u;
    private arag v;
    private arag w;
    private arag x;
    private arag y;
    private arag z;
    private byte K = 2;
    public boolean f = true;
    public boolean g = true;

    static {
        avzs avzsVar = new avzs();
        a = avzsVar;
        aopi.registerDefaultInstance(avzs.class, avzsVar);
    }

    private avzs() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.K);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.K = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0002\u00013\u001f\u0000\u0000\u001d\u0001ᐉ\u0002\u0002ᐉ\u0004\u0003ᐉ\u0007\u0004ᐉ\u000b\u0005ᐉ\r\u0006ᐉ\n\u0007ᐉ\f\bဇ\u0017\tဇ\u0018\nᐉ\u0019\rᐉ\u001d\u000fᐉ$\u0011ᐉ#\u0012ᐉ\u0006\u0014ᐉ&\u0015ᐉ'\u0016ᐉ\u0005\u0019ᐉ)\u001eᐉ\u001e\u001fᐉ!!ᐉ\u0003\"ᐉ\u0000#ᐉ\u0001%ᐉ\u000f)ᐉ+*ᐉ\b-ᐉ\u001a.ᐉ\u0010/ᐉ\u00112ᐉ\u00153ᐉ\u0012", new Object[]{"b", "k", "c", "d", "r", "u", "e", "t", "v", "f", "g", "h", "i", "F", "E", "q", "G", "H", "p", "I", "C", "D", "o", "m", "n", "w", "J", "s", "B", "x", "y", "A", "z"});
            case 3:
                return new avzs();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (avzs.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
