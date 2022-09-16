package defpackage;
/* compiled from: PG */
/* renamed from: apjm  reason: default package */
/* loaded from: classes.dex */
public final class apjm extends aopi implements aoqv {
    public static final apjm a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private apzg h;
    private asaj i;
    private arag j;
    private aoux k;
    private asow l;
    private apoq m;
    private ates n;
    private byte o = 2;

    static {
        apjm apjmVar = new apjm();
        a = apjmVar;
        aopi.registerDefaultInstance(apjm.class, apjmVar);
    }

    private apjm() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u0010\u000b\u0000\u0000\u000b\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\n\nᐉ\u000b\fᐉ\r\u000eᐉ\u000f\u000fᐉ\u0007\u0010ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "i", "j", "k", "l", "n", "h", "m"});
            case 3:
                return new apjm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apjm.class) {
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
