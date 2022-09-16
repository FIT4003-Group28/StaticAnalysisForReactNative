package defpackage;
/* compiled from: PG */
/* renamed from: avlh  reason: default package */
/* loaded from: classes2.dex */
public final class avlh extends aopi implements aoqv {
    public static final avlh a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private apzg h;
    private apzg i;
    private aoux j;
    private ates k;
    private byte l = 2;

    static {
        avlh avlhVar = new avlh();
        a = avlhVar;
        aopi.registerDefaultInstance(avlh.class, avlhVar);
    }

    private avlh() {
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
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0003\u000e\b\u0000\u0000\b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\b\u000bᐉ\u0007\fᐉ\u0005\u000eᐉ\n", new Object[]{"c", "d", "e", "f", "h", "j", "i", "g", "k"});
            case 3:
                return new avlh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avlh.class) {
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
