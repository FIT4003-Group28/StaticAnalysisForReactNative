package defpackage;
/* compiled from: PG */
/* renamed from: aqfa  reason: default package */
/* loaded from: classes2.dex */
public final class aqfa extends aopd implements aope {
    private static volatile aorb A;
    public static final aqfa a;
    private int B;
    private arag C;
    private arag D;
    private apzg E;
    private apmg F;
    private apzg G;
    private aqey H;
    private arcq I;

    /* renamed from: J  reason: collision with root package name */
    private aoux f94J;
    private aunb K;
    public int b;
    public avhn d;
    public arag e;
    public arag f;
    public arab g;
    public avhn h;
    public arag i;
    public arag j;
    public arag k;
    public apzg m;
    public apzg n;
    public avss o;
    public aopu p;
    public apmg q;
    public apmg r;
    public apmg s;
    public aqez t;
    public avxe u;
    public ates v;
    public boolean w;
    public aopu x;
    public aoob y;
    public aopu z;
    private byte L = 2;
    public String c = "";

    static {
        aqfa aqfaVar = new aqfa();
        a = aqfaVar;
        aopi.registerDefaultInstance(aqfa.class, aqfaVar);
    }

    private aqfa() {
        emptyProtobufList();
        emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.y = aoob.b;
        this.z = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.L);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.L = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001 \u0000\u0002\u00013 \u0000\u0003\u001b\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\b\u0006ᐉ\t\u0007ᐉ\u000b\bᐉ\f\nᐉ\u0004\u000bᐉ$\fᐉ\u000f\rЛ\u000eᐉ\u0006\u0011ᐉ\u0014\u0012ည%\u0017ᐉ\n\u0018ᐉ\u001a\u0019ᐉ\u001b\u001aᐉ\u001f\u001bဇ\u001c\u001cᐉ\u0011\u001dᐉ  Л!ᐉ\u0010\"ᐉ\u0012+ᐉ\u000e,ᐉ\u0013-ဉ\u0015.ᐉ'/ဉ\u00050Л3ᐉ\r", new Object[]{"b", "B", "c", "d", "e", "C", "i", "D", "k", "m", "f", "J", "o", "p", aplw.class, "h", "t", "y", "j", "G", "v", "H", "w", "r", "I", "x", avhc.class, "q", "s", "n", "F", "u", "K", "g", "z", aunb.class, "E"});
            case 3:
                return new aqfa();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = A;
                if (aorbVar == null) {
                    synchronized (aqfa.class) {
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
