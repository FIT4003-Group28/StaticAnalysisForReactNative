package defpackage;
/* compiled from: PG */
/* renamed from: aqea  reason: default package */
/* loaded from: classes2.dex */
public final class aqea extends aopi implements aoqv {
    public static final aqea a;
    private static volatile aorb s;
    private apmg A;
    private apmg B;
    private aoux C;
    public int b;
    public avhn c;
    public arag d;
    public arag f;
    public arag g;
    public arag i;
    public apok k;
    public arag m;
    public apzg n;
    public ates o;
    public asxl p;
    public aoob q;
    public boolean r;
    private arag t;
    private arag u;
    private arag v;
    private arag w;
    private arag x;
    private arag y;
    private apmg z;
    private byte D = 2;
    public aopu e = emptyProtobufList();
    public aopu h = emptyProtobufList();
    public aopu j = emptyProtobufList();
    public aopu l = emptyProtobufList();

    static {
        aqea aqeaVar = new aqea();
        a = aqeaVar;
        aopi.registerDefaultInstance(aqea.class, aqeaVar);
    }

    private aqea() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.q = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.D = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0002\"\u001a\u0000\u0004\u0017\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\t\u0005ᐉ\n\u0007ᐉ\f\bᐉ\r\tᐉ\u0010\nᐉ\u0011\u000eᐉ\u0018\u0010ည\u0019\u0012ᐉ\u000e\u0013ᐉ\u0015\u0014ᐉ\u0013\u0015ᐉ\u0012\u0016ᐉ\u0014\u0017ဉ\u0016\u0018Л\u0019ᐉ\u0004\u001aᐉ\u0005\u001bᐉ\u0006\u001cЛ\u001dဇ\u001a\u001eЛ\u001fЛ ᐉ\u000f\"ᐉ\b", new Object[]{"b", "c", "d", "t", "u", "v", "w", "m", "n", "C", "q", "x", "o", "A", "z", "B", "p", "e", apmg.class, "f", "g", "i", "l", apmg.class, "r", "h", arag.class, "j", arag.class, "y", "k"});
            case 3:
                return new aqea();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (aqea.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
