package defpackage;
/* compiled from: PG */
/* renamed from: avpm  reason: default package */
/* loaded from: classes2.dex */
public final class avpm extends aopi implements aoqv {
    public static final avpm a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private apzg g;
    private aoux h;
    private byte i = 2;

    static {
        avpm avpmVar = new avpm();
        a = avpmVar;
        aopi.registerDefaultInstance(avpm.class, avpmVar);
    }

    private avpm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\f\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\n\fᐉ\u0002", new Object[]{"c", "d", "f", "g", "h", "e"});
            case 3:
                return new avpm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpm.class) {
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
