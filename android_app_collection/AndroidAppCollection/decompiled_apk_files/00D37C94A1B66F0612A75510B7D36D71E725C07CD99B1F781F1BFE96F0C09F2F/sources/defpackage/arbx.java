package defpackage;
/* compiled from: PG */
/* renamed from: arbx  reason: default package */
/* loaded from: classes2.dex */
public final class arbx extends aopi implements aoqv {
    public static final arbx a;
    private static volatile aorb l;
    public int b;
    public avhn c;
    public avhn d;
    public apok e;
    public arag f;
    public avhn i;
    public arhs j;
    public apok k;
    private arag m;
    private arag n;
    private apok o;
    private arag p;
    private aunb q;
    private aunb r;
    private arag s;
    private apzg t;
    private apzg u;
    private aoux v;
    private byte w = 2;
    public aopu g = emptyProtobufList();
    public String h = "";

    static {
        arbx arbxVar = new arbx();
        a = arbxVar;
        aopi.registerDefaultInstance(arbx.class, arbxVar);
    }

    private arbx() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0002\u0015\u0013\u0000\u0001\u0012\u0002ᐉ\u0014\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bЛ\fᐉ\t\rဈ\n\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\r\u0011ᐉ\u000e\u0012ᐉ\u000f\u0013ᐉ\u0010\u0014ᐉ\u0011\u0015ᐉ\u0012", new Object[]{"b", "v", "c", "d", "m", "n", "e", "o", "f", "g", arag.class, "p", "h", "q", "r", "s", "i", "j", "k", "t", "u"});
            case 3:
                return new arbx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arbx.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
