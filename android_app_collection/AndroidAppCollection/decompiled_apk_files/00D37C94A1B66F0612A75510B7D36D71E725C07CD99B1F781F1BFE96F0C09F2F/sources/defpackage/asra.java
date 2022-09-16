package defpackage;
/* compiled from: PG */
/* renamed from: asra  reason: default package */
/* loaded from: classes2.dex */
public final class asra extends aopi implements aoqv {
    public static final asra a;
    private static volatile aorb o;
    public int b;
    public Object d;
    public arag g;
    public arag h;
    public arag i;
    public avhn j;
    public arag l;
    public apzg m;
    public aoob n;
    private arag p;
    private arag q;
    private aoux r;
    public int c = 0;
    private byte s = 2;
    public String e = "";
    public String f = "";
    public aopu k = emptyProtobufList();

    static {
        asra asraVar = new asra();
        a = asraVar;
        aopi.registerDefaultInstance(asra.class, asraVar);
    }

    private asra() {
        emptyProtobufList();
        this.n = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0001\u0013\u0010\u0000\u0001\f\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007်\u0000\bᐼ\u0000\tᐼ\u0000\nᐉ\t\u000bᐉ\n\fЛ\rᐉ\u000b\u000eᐉ\f\u000fᐉ\r\u0012ᐉ\u000f\u0013ည\u0010", new Object[]{"d", "c", "b", "e", "p", "f", "g", "h", arag.class, asru.class, "i", "j", "k", asqe.class, "l", "q", "m", "r", "n"});
            case 3:
                return new asra();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (asra.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
