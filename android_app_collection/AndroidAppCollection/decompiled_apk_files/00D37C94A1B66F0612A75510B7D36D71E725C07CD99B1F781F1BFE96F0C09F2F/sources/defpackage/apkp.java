package defpackage;
/* compiled from: PG */
/* renamed from: apkp  reason: default package */
/* loaded from: classes.dex */
public final class apkp extends aopi implements aoqv {
    public static final apkp a;
    private static volatile aorb b;
    private int c;
    private apok d;
    private arag e;
    private arag f;
    private arag g;
    private apok h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private arag n;
    private arag o;
    private apkq p;
    private arag q;
    private apok r;
    private aoux s;
    private byte t = 2;

    static {
        apkp apkpVar = new apkp();
        a = apkpVar;
        aopi.registerDefaultInstance(apkp.class, apkpVar);
    }

    private apkp() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.t = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0013\u0010\u0000\u0000\u0010\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\f\nᐉ\r\u000bᐉ\u000e\fᐉ\u0001\rᐉ\b\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u000b\u0012ᐉ\u0011\u0013ᐉ\u000f", new Object[]{"c", "e", "f", "g", "h", "i", "j", "o", "p", "q", "d", "k", "l", "m", "n", "s", "r"});
            case 3:
                return new apkp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apkp.class) {
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
