package defpackage;
/* compiled from: PG */
/* renamed from: auuf  reason: default package */
/* loaded from: classes2.dex */
public final class auuf extends aopd implements aope {
    public static final auuf a;
    private static volatile aorb w;
    private aunb A;
    private avaq B;
    private auug C;
    private aqyg D;
    private apzg E;
    private aoux F;
    private auue G;
    private arcq H;
    public int b;
    public int c;
    public Object e;
    public arag f;
    public arag g;
    public auub h;
    public aunb i;
    public arag j;
    public avhn k;
    public boolean m;
    public autw n;
    public apzg o;
    public auuc p;
    public auuh r;
    public int s;
    public aopu t;
    public aoob u;
    public aqtd v;
    private arag x;
    private apzg y;
    private auud z;
    public int d = 0;
    private byte I = 2;
    public aopu q = emptyProtobufList();

    static {
        auuf auufVar = new auuf();
        a = auufVar;
        aopi.registerDefaultInstance(auuf.class, auufVar);
    }

    private auuf() {
        emptyProtobufList();
        this.t = emptyProtobufList();
        this.u = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.I = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001d\u0001\u0002\u0001.\u001d\u0000\u0002\u0016\u0001ᐉ\u0000\u0002ᐉ\u0006\u0003ᐉ\r\u0004ᐉ\u000e\u0005ᐉ\u0016\u0006ᐉ\u0011\tᐉ\u0005\u000bᐉ\u001a\fᐉ\u0001\u000eᐉ\u0004\u000fည\u001b\u0011ᐉ\u0019\u0013ᐉ\u0015\u0015ᐉ\u0014\u0017ဇ\n\u0018ᐉ\u001e\u0019ᐉ\u001f\u001aЛ\u001bဉ\u0002\u001cЛ\u001dᐉ\u0012\u001eᐉ\f\u001fᐉ\u000f$ᐉ\u0003'ᐉ\u0010)ဉ%+ဌ\u0017-ှ\u0000.ှ\u0000", new Object[]{"e", "d", "b", "c", "f", "k", "o", "y", "r", "B", "j", "F", "g", "x", "u", "E", "p", "D", "m", "G", "H", "q", autx.class, "h", "t", apzg.class, "C", "n", "z", "i", "A", "v", "s", aupm.q});
            case 3:
                return new auuf();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (auuf.class) {
                        aorbVar = w;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            w = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
