package defpackage;
/* compiled from: PG */
/* renamed from: arlt  reason: default package */
/* loaded from: classes2.dex */
public final class arlt extends aopd implements aope {
    public static final arlt a;
    private static volatile aorb x;
    private aunb A;
    private aunb B;
    private apzg C;
    private byte D = 2;
    public int b;
    public arpa c;
    public arlo d;
    public aunb e;
    public arlu f;
    public arlv g;
    public arlq h;
    public auna i;
    public aoob j;
    public arlx k;
    public aopu m;
    public aopu n;
    public aopu o;
    public apzg p;
    public apzg q;
    public apzg r;
    public boolean s;
    public int t;
    public int u;
    public aopu v;
    public arbf w;
    private arlp y;
    private aoux z;

    static {
        arlt arltVar = new arlt();
        a = arltVar;
        aopi.registerDefaultInstance(arlt.class, arltVar);
    }

    private arlt() {
        emptyProtobufList();
        this.j = aoob.b;
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        this.v = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001̉\u0019\u0000\u0004\u0015\u0001ᐉ\u0000\tᐉ\u0006\nᐉ\t\fᐉ\u0005\rᐉ\u0001\u0010ည\f\u0012ᐉ\u0007\u0014ᐉ\b\u0017ᐉ\u000b\u001cᐉ\u0011\u001dЛ\u001eЛ\u001fဇ\u0015\"ဋ\u0016#ဋ\u0017$ᐉ\u0013%ᐉ\u0018&ᐉ\u0012'ᐉ\u0003(Л*ᐉ\u0014+ᐉ\u001a,Л-ᐉ\u001b̉ᐉ\u0019", new Object[]{"b", "c", "f", "i", "y", "d", "j", "g", "h", "z", "k", "n", apzg.class, "o", apzg.class, "s", "t", "u", "q", "A", "p", "e", "m", aunb.class, "r", "B", "v", aunb.class, "C", "w"});
            case 3:
                return new arlt();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = x;
                if (aorbVar == null) {
                    synchronized (arlt.class) {
                        aorbVar = x;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            x = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
