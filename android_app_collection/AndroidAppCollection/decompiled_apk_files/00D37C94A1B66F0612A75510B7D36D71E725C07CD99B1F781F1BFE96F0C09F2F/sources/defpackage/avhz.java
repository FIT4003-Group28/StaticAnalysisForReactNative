package defpackage;
/* compiled from: PG */
/* renamed from: avhz  reason: default package */
/* loaded from: classes2.dex */
public final class avhz extends aopi implements aoqv {
    public static final avhz a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private apzg f;
    private apzg g;
    private apzg h;
    private apzg i;
    private aoux j;
    private aunb k;
    private byte l = 2;

    static {
        avhz avhzVar = new avhz();
        a = avhzVar;
        aopi.registerDefaultInstance(avhz.class, avhzVar);
    }

    private avhz() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0007\nᐉ\f\rᐉ\u0004\u000eᐉ\u0006", new Object[]{"c", "d", "e", "f", "h", "j", "k", "g", "i"});
            case 3:
                return new avhz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avhz.class) {
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
