package defpackage;
/* compiled from: PG */
/* renamed from: aqge  reason: default package */
/* loaded from: classes2.dex */
public final class aqge extends aopi implements aoqv {
    public static final aqge a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apok e;
    private apzg f;
    private apok g;
    private arag h;
    private arag i;
    private apok j;
    private apok k;
    private arag l;
    private arag m;
    private arag n;
    private aqgh o;
    private aqgf p;
    private apok q;
    private aoux r;
    private byte s = 2;

    static {
        aqge aqgeVar = new aqge();
        a = aqgeVar;
        aopi.registerDefaultInstance(aqge.class, aqgeVar);
    }

    private aqge() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.s = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000e\rᐉ\u0003\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\r", new Object[]{"c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "r", "g", "o", "p", "q"});
            case 3:
                return new aqge();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqge.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
