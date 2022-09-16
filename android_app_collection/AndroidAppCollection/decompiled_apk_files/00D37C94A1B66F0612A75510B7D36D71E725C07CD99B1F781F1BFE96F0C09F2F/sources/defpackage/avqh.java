package defpackage;
/* compiled from: PG */
/* renamed from: avqh  reason: default package */
/* loaded from: classes2.dex */
public final class avqh extends aopi implements aoqv {
    public static final avqh a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private apok h;
    private apok i;
    private apok j;
    private aoux k;
    private byte l = 2;

    static {
        avqh avqhVar = new avqh();
        a = avqhVar;
        aopi.registerDefaultInstance(avqh.class, avqhVar);
    }

    private avqh() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\b\u0007ᐉ\u000b\nᐉ\u0003\fᐉ\n\rᐉ\t", new Object[]{"c", "d", "e", "f", "h", "k", "g", "j", "i"});
            case 3:
                return new avqh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqh.class) {
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
