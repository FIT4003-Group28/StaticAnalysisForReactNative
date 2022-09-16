package defpackage;
/* compiled from: PG */
/* renamed from: atmw  reason: default package */
/* loaded from: classes2.dex */
public final class atmw extends aopi implements aoqv {
    public static final atmw a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private asow j;
    private apoq k;
    private aoux l;
    private atmv m;
    private arag n;
    private byte o = 2;

    static {
        atmw atmwVar = new atmw();
        a = atmwVar;
        aopi.registerDefaultInstance(atmw.class, atmwVar);
    }

    private atmw() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007\fᐉ\t\rᐉ\n\u000fᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new atmw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmw.class) {
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
