package defpackage;
/* compiled from: PG */
/* renamed from: aqxp  reason: default package */
/* loaded from: classes2.dex */
public final class aqxp extends aopi implements aoqv {
    public static final aqxp a;
    private static volatile aorb n;
    public aunb b;
    public avhn c;
    public arag d;
    public arhs e;
    public apzg f;
    public arag g;
    public arag h;
    public arhs i;
    public arag j;
    public arag k;
    public int l;
    private int o;
    private arag p;
    private apzg q;
    private arag r;
    private aoux s;
    private byte t = 2;
    public aoob m = aoob.b;

    static {
        aqxp aqxpVar = new aqxp();
        a = aqxpVar;
        aopi.registerDefaultInstance(aqxp.class, aqxpVar);
    }

    private aqxp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\n\fᐉ\u000b\rည\u000e\u000eᐉ\u000f\u000fᐉ\u0003\u0010ဌ\r\u0011ᐉ\t\u0012ᐉ\f", new Object[]{"o", "b", "c", "d", "f", "g", "h", "p", "q", "j", "r", "m", "s", "e", "l", aqvj.u, "i", "k"});
            case 3:
                return new aqxp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aqxp.class) {
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
