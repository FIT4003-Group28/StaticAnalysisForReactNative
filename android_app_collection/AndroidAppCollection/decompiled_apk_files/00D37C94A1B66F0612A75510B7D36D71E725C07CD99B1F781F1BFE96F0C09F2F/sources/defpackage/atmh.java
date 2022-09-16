package defpackage;
/* compiled from: PG */
/* renamed from: atmh  reason: default package */
/* loaded from: classes2.dex */
public final class atmh extends aopi implements aoqv {
    public static final atmh a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private arag h;
    private apzg i;
    private aunb j;
    private atmg k;
    private aoux l;
    private aunb m;
    private byte n = 2;

    static {
        atmh atmhVar = new atmh();
        a = atmhVar;
        aopi.registerDefaultInstance(atmh.class, atmhVar);
    }

    private atmh() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u001a\n\u0000\u0000\n\u0001ᐉ\u0000\u0005ᐉ\u000e\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bᐉ\u000b\u0011ᐉ\u0002\u0016ᐉ\u0012\u001aᐉ\t", new Object[]{"c", "d", "l", "f", "g", "h", "i", "k", "e", "m", "j"});
            case 3:
                return new atmh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmh.class) {
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
