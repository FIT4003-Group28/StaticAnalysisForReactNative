package defpackage;
/* compiled from: PG */
/* renamed from: avpt  reason: default package */
/* loaded from: classes2.dex */
public final class avpt extends aopi implements aoqv {
    public static final avpt a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apok e;
    private arag f;
    private arag g;
    private arag h;
    private apok i;
    private apok j;
    private avps k;
    private aoux l;
    private byte m = 2;

    static {
        avpt avptVar = new avpt();
        a = avptVar;
        aopi.registerDefaultInstance(avpt.class, avptVar);
    }

    private avpt() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.m = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0003\u000b\t\u0000\u0000\t\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new avpt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpt.class) {
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
