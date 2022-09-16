package defpackage;
/* compiled from: PG */
/* renamed from: avrh  reason: default package */
/* loaded from: classes2.dex */
public final class avrh extends aopi implements aoqv {
    public static final avrh a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apok g;
    private apok h;
    private apok i;
    private apok j;
    private apzg k;
    private apzg l;
    private aoux m;
    private byte n = 2;

    static {
        avrh avrhVar = new avrh();
        a = avrhVar;
        aopi.registerDefaultInstance(avrh.class, avrhVar);
    }

    private avrh() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u000b\tᐉ\r\u000bᐉ\u0007\rᐉ\t\u000eᐉ\b", new Object[]{"c", "d", "e", "f", "g", "h", "l", "m", "i", "k", "j"});
            case 3:
                return new avrh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrh.class) {
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
