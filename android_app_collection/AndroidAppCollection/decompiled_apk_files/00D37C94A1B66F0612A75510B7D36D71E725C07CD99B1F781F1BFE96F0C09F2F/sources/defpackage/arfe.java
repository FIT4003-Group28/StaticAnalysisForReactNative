package defpackage;
/* compiled from: PG */
/* renamed from: arfe  reason: default package */
/* loaded from: classes2.dex */
public final class arfe extends aopd implements aope {
    private static volatile aorb A;
    public static final arfe a;
    private arag B;
    private arag C;
    private apzg D;
    private apzg E;
    private arcq F;
    private aoux G;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arab f;
    public avhn g;
    public arag h;
    public arag i;
    public arag j;
    public arag k;
    public apzg m;
    public avss n;
    public apmg q;
    public apmg r;
    public apmg s;
    public arfd t;
    public boolean u;
    public aopu v;
    public ates w;
    public asxo x;
    public avxe y;
    public aoob z;
    private byte H = 2;
    public aopu o = emptyProtobufList();
    public aopu p = emptyProtobufList();

    static {
        arfe arfeVar = new arfe();
        a = arfeVar;
        aopi.registerDefaultInstance(arfe.class, arfeVar);
    }

    private arfe() {
        emptyProtobufList();
        emptyProtobufList();
        this.v = emptyProtobufList();
        emptyProtobufList();
        this.z = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.H);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.H = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001d\u0000\u0001\u0002'\u001d\u0000\u0003\u0018\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\n\bᐉ\f\nᐉ\u0004\u000bᐉ\u001c\fᐉ\u000e\rЛ\u000eᐉ\u0006\u000fЛ\u0011ည\u001e\u0014ᐉ\u0013\u0016ᐉ\t\u0017ဇ\u0015\u0018ᐉ\u0017\u0019ᐉ\u0010\u001aᐉ\u0018\u001cЛ\u001dᐉ\u000f\u001eᐉ\u0011\u001fᐉ\u0012\"ဉ\u001a$ဉ\u0005%ဉ\u001b&ᐉ\r'ᐉ\u000b", new Object[]{"b", "c", "d", "B", "h", "i", "k", "m", "e", "G", "n", "o", aplw.class, "g", "p", aplw.class, "z", "t", "j", "u", "w", "r", "F", "v", avhc.class, "q", "s", "E", "x", "f", "y", "D", "C"});
            case 3:
                return new arfe();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (arfe.class) {
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
