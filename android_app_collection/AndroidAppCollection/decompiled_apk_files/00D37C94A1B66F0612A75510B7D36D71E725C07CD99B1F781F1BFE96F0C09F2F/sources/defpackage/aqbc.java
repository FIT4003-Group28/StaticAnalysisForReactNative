package defpackage;
/* compiled from: PG */
/* renamed from: aqbc  reason: default package */
/* loaded from: classes2.dex */
public final class aqbc extends aopi implements aoqv {
    public static final aqbc a;
    private static volatile aorb n;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public apok f;
    public apok g;
    public arag h;
    public apok i;
    public aunb j;
    public aunb l;
    public boolean m;
    private apok o;
    private aqbb p;
    private aqba q;
    private arag r;
    private arag s;
    private apzg t;
    private byte u = 2;
    public String k = "";

    static {
        aqbc aqbcVar = new aqbc();
        a = aqbcVar;
        aopi.registerDefaultInstance(aqbc.class, aqbcVar);
    }

    private aqbc() {
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0015\u0011\u0000\u0000\u000f\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0007\bᐉ\n\tᐉ\b\nᐉ\t\u000bᐉ\u000b\rᐉ\f\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\u000f\u0013ဈ\u0010\u0014ᐉ\u0011\u0015ဇ\u0012", new Object[]{"b", "f", "o", "c", "d", "e", "g", "r", "p", "q", "s", "h", "t", "i", "j", "k", "l", "m"});
            case 3:
                return new aqbc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aqbc.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
