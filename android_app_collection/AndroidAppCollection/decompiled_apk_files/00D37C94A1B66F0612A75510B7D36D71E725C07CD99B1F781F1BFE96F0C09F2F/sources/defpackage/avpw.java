package defpackage;
/* compiled from: PG */
/* renamed from: avpw  reason: default package */
/* loaded from: classes2.dex */
public final class avpw extends aopi implements aoqv {
    public static final avpw a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apok g;
    private apok h;
    private apok i;
    private aoux j;
    private byte k = 2;

    static {
        avpw avpwVar = new avpw();
        a = avpwVar;
        aopi.registerDefaultInstance(avpw.class, avpwVar);
    }

    private avpw() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\r\u0007\u0000\u0000\u0007\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u0006ᐉ\n\u0007ᐉ\u0003\fᐉ\u0007\rᐉ\b", new Object[]{"c", "e", "f", "g", "j", "d", "h", "i"});
            case 3:
                return new avpw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpw.class) {
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
