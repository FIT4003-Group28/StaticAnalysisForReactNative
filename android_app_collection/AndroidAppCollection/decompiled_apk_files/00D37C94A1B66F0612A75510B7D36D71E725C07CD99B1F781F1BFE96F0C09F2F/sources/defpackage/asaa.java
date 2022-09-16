package defpackage;
/* compiled from: PG */
/* renamed from: asaa  reason: default package */
/* loaded from: classes2.dex */
public final class asaa extends aopi implements aoqv {
    public static final asaa a;
    private static volatile aorb q;
    public int b;
    public int c;
    public arzy f;
    public arzz g;
    public arzx h;
    public aunb i;
    public arzr j;
    public arzq k;
    public arzv l;
    public asar m;
    public arzu n;
    public aoob o;
    public aoob p;
    private asao r;
    private aunb s;
    private avkx t;
    private byte u = 2;
    public String d = "";
    public String e = "";

    static {
        asaa asaaVar = new asaa();
        a = asaaVar;
        aopi.registerDefaultInstance(asaa.class, asaaVar);
    }

    private asaa() {
        emptyProtobufList();
        aopi.emptyProtobufList();
        this.o = aoob.b;
        this.p = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001!\u0011\u0000\u0000\n\u0001ဌ\u0000\u0002ဈ\u0001\bᐉ\u0005\nᐉ\u000e\u000bᐉ\n\rᐉ\u0010\u0010ᐉ\u000b\u0011ဉ\u0003\u0012ᐉ\u0011\u0013ᐉ\u0012\u0015ဉ\b\u0016ဈ\u0002\u0018ᐉ\t\u0019ᐉ\u0014\u001fည\u0016 ည\u0017!ᐉ\u0018", new Object[]{"b", "c", atti.m, "d", "g", "l", "j", "m", "k", "f", "n", "r", "h", "e", "i", "s", "o", "p", "t"});
            case 3:
                return new asaa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (asaa.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
