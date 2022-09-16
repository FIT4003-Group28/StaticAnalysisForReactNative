package defpackage;
/* compiled from: PG */
/* renamed from: aqyf  reason: default package */
/* loaded from: classes2.dex */
public final class aqyf extends aopi implements aoqv {
    public static final aqyf a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private arag f;
    private apzg g;
    private apok h;
    private aoux i;
    private byte j = 2;

    static {
        aqyf aqyfVar = new aqyf();
        a = aqyfVar;
        aopi.registerDefaultInstance(aqyf.class, aqyfVar);
    }

    private aqyf() {
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
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0004ᐉ\u0000\u0005ᐉ\b\u0007ᐉ\u0007\bᐉ\u0002\nᐉ\u0005", new Object[]{"c", "e", "d", "i", "h", "f", "g"});
            case 3:
                return new aqyf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqyf.class) {
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
