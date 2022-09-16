package defpackage;
/* compiled from: PG */
/* renamed from: asvg  reason: default package */
/* loaded from: classes2.dex */
public final class asvg extends aopi implements aoqv {
    public static final asvg a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private asvf f;
    private arag g;
    private arag h;
    private arag i;
    private asvf j;
    private arag k;
    private arag l;
    private asvf m;
    private arag n;
    private arag o;
    private asvf p;
    private byte q = 2;

    static {
        asvg asvgVar = new asvg();
        a = asvgVar;
        aopi.registerDefaultInstance(asvg.class, asvgVar);
    }

    private asvg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0003\u000f\r\u0000\u0000\r\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\rᐉ\f\u000eᐉ\r\u000fᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case 3:
                return new asvg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asvg.class) {
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
