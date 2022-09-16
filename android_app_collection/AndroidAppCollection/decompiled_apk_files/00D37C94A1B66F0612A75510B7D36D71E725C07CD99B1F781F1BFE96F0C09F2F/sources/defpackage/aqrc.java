package defpackage;
/* compiled from: PG */
/* renamed from: aqrc  reason: default package */
/* loaded from: classes2.dex */
public final class aqrc extends aopi implements aoqv {
    public static final aqrc a;
    private static volatile aorb m;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public boolean h;
    public aovr i;
    public apzg j;
    public arhs k;
    public arag l;
    private arag n;
    private aqgx o;
    private aunb p;
    public int c = 0;
    private byte q = 2;
    public String g = "";

    static {
        aqrc aqrcVar = new aqrc();
        a = aqrcVar;
        aopi.registerDefaultInstance(aqrc.class, aqrcVar);
    }

    private aqrc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000f\r\u0000\u0000\b\u0001ᐉ\u0000\u0002ဈ\u0003\u0003ဇ\u0007\u0004ဉ\b\u0006့\u0000\u0007ျ\u0000\bᐉ\u0001\tᐉ\t\nᐉ\n\fᐉ\f\rᐉ\r\u000eᐉ\u0002\u000fᐉ\u000e", new Object[]{"d", "c", "b", "e", "g", "h", "i", "n", "o", "p", "j", "k", "f", "l"});
            case 3:
                return new aqrc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqrc.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
