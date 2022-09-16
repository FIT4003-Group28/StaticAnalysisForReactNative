package defpackage;
/* compiled from: PG */
/* renamed from: auex  reason: default package */
/* loaded from: classes2.dex */
public final class auex extends aopd implements aope {
    private static volatile aorb B;
    public static final auex a;
    public aqml A;
    private aoux C;
    private apzg D;
    private aunb E;
    public int b;
    public avhn d;
    public arag e;
    public arag f;
    public arag g;
    public arag h;
    public apzg i;
    public apmg j;
    public apmg k;
    public apmg m;
    public apok n;
    public String o;
    public ates p;
    public auew q;
    public aoob r;
    public avhn s;
    public arag t;
    public boolean u;
    public aopu v;
    public avss w;
    public auev x;
    public aopu y;
    public aunb z;
    private byte F = 2;
    public String c = "";

    static {
        auex auexVar = new auex();
        a = auexVar;
        aopi.registerDefaultInstance(auex.class, auexVar);
    }

    private auex() {
        emptyProtobufList();
        this.o = "";
        emptyProtobufList();
        this.r = aoob.b;
        this.v = emptyProtobufList();
        this.y = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.F);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.F = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001\u0001#\u001b\u0000\u0002\u0015\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\nဈ\f\u000fᐉ\u0011\u0010ᐉ\u0013\u0011ည\u0014\u0013ᐉ\u0010\u0014ᐉ\u0015\u0015ᐉ\u0016\u0016ဇ\u0018\u0017ᐉ\u0017\u0018ᐉ\t\u0019Л\u001aᐉ\n\u001bᐉ\b\u001cᐉ\u0019\u001dဉ\u001a\u001fЛ ᐉ\u000b!ᐉ\u001c\"ဉ\u001d#ᐉ\u001e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "o", "q", "C", "r", "p", "s", "D", "u", "t", "k", "v", avhc.class, "m", "j", "w", "x", "y", auey.class, "n", "z", "A", "E"});
            case 3:
                return new auex();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = B;
                if (aorbVar == null) {
                    synchronized (auex.class) {
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
