package defpackage;
/* compiled from: PG */
/* renamed from: avoy  reason: default package */
/* loaded from: classes2.dex */
public final class avoy extends aopi implements aoqv {
    public static final avoy a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private apzg f;
    private apzg g;
    private aoux h;
    private byte i = 2;

    static {
        avoy avoyVar = new avoy();
        a = avoyVar;
        aopi.registerDefaultInstance(avoy.class, avoyVar);
    }

    private avoy() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0003\u0006ᐉ\t\bᐉ\u0004\tᐉ\u0005", new Object[]{"c", "d", "e", "h", "f", "g"});
            case 3:
                return new avoy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avoy.class) {
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
