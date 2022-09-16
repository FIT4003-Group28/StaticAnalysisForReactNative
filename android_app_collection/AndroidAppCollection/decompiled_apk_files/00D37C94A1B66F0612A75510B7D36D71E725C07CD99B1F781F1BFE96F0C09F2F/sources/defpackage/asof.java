package defpackage;
/* compiled from: PG */
/* renamed from: asof  reason: default package */
/* loaded from: classes2.dex */
public final class asof extends aopi implements aoqv {
    public static final asof a;
    private static volatile aorb o;
    public int b;
    public arag c;
    public arag d;
    public int f;
    public arag g;
    public arag h;
    public arag i;
    public aunb j;
    public aunb k;
    public arag l;
    public arag m;
    public apok n;
    private arag p;
    private arag q;
    private apok r;
    private byte s = 2;
    public String e = "";

    static {
        asof asofVar = new asof();
        a = asofVar;
        aopi.registerDefaultInstance(asof.class, asofVar);
    }

    private asof() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0005\u0003ᐉ\u0006\u0005ᐉ\u0007\u0007ᐉ\b\tᐉ\t\nᐉ\n\fᐉ\u0001\rᐉ\u000b\u000eᐉ\f\u000fᐉ\u000e\u0010ᐉ\u0002\u0011ᐉ\u000f\u0012င\u0004\u0014ဈ\u0003", new Object[]{"b", "c", "g", "h", "i", "j", "k", "q", "d", "l", "m", "n", "p", "r", "f", "e"});
            case 3:
                return new asof();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (asof.class) {
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
