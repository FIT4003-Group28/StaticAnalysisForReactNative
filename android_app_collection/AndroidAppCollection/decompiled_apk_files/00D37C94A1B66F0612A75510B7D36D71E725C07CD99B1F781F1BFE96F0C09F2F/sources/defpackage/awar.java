package defpackage;
/* compiled from: PG */
/* renamed from: awar  reason: default package */
/* loaded from: classes2.dex */
public final class awar extends aopd implements aope {
    private static volatile aorb E;
    public static final awar a;
    public awao A;
    public awao B;
    public avxe C;
    public aoob D;
    private int F;
    private arag G;
    private arag H;
    private arag I;

    /* renamed from: J  reason: collision with root package name */
    private apdy f130J;
    private aslz K;
    private apzg L;
    private awap M;
    private apzg N;
    private aoux O;
    public int b;
    public Object d;
    public avhn f;
    public arag g;
    public arag h;
    public arag i;
    public arag j;
    public arag k;
    public arag m;
    public apzg n;
    public aopu o;
    public apmg p;
    public apmg q;
    public apmg r;
    public avss s;
    public awaq t;
    public ates u;
    public boolean v;
    public aopu w;
    public awas x;
    public awao y;
    public awao z;
    public int c = 0;
    private byte P = 2;
    public String e = "";

    static {
        awar awarVar = new awar();
        a = awarVar;
        aopi.registerDefaultInstance(awar.class, awarVar);
    }

    private awar() {
        emptyProtobufList();
        this.o = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.w = emptyProtobufList();
        this.D = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.P);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.P = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001$\u0001\u0002\u00012$\u0000\u0002\u001f\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u000b\u0007ᐉ\f\bᐉ\r\tᐉ\u000f\nЛ\rᐉ\u0013\u000fᐉ\t\u0010ᐉ%\u0011ᐉ\u0015\u0012ᐉ\n\u0013ᐼ\u0000\u0014ᐉ\u0016\u0015ည&\u0016ᐉ\u0014\u001aᐉ\u000e\u001bဇ\u001a\u001cᐉ\u0018\u001dᐉ\u001c ᐉ\u0011!ᐼ\u0000\"Л#ᐉ\u0010$ᐉ\u0012&ဉ\u001d'ᐉ\u001e(ᐉ\u001f)ᐉ *ᐉ!-ဉ#.ᐉ\u00172ᐉ$", new Object[]{"d", "c", "b", "F", "e", "f", "g", "G", "H", "i", "j", "k", "n", "o", aplw.class, "J", "I", "O", "s", "h", avhn.class, "t", "D", "K", "m", "v", "u", "M", "q", apuq.class, "w", avhc.class, "p", "r", "x", "y", "z", "A", "B", "C", "L", "N"});
            case 3:
                return new awar();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = E;
                if (aorbVar == null) {
                    synchronized (awar.class) {
                        aorbVar = E;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            E = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
