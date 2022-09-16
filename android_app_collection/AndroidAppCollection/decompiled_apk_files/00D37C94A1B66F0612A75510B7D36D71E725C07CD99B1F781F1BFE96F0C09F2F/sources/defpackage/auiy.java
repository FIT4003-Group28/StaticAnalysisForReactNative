package defpackage;
/* compiled from: PG */
/* renamed from: auiy  reason: default package */
/* loaded from: classes2.dex */
public final class auiy extends aopi implements aoqv {
    public static final auiy a;
    private static volatile aorb v;
    public int b;
    public avhn c;
    public aunb d;
    public arhs e;
    public arag f;
    public arag g;
    public arag h;
    public arag i;
    public arag j;
    public aunb k;
    public apzg l;
    public aunb n;
    public long o;
    public apnp p;
    public boolean r;
    public auhy s;
    public auij t;
    public boolean u;
    private byte w = 2;
    public aopu m = emptyProtobufList();
    public aopu q = emptyProtobufList();

    static {
        auiy auiyVar = new auiy();
        a = auiyVar;
        aopi.registerDefaultInstance(auiy.class, auiyVar);
    }

    private auiy() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0002\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nЛ\u000bᐉ\n\fဂ\u000b\rဉ\f\u000eЛ\u000fဇ\r\u0011ဉ\u000f\u0012ဉ\u0010\u0014ᐉ\u0006\u0015ဇ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", apzg.class, "n", "o", "p", "q", apzg.class, "r", "s", "t", "i", "u"});
            case 3:
                return new auiy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (auiy.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
