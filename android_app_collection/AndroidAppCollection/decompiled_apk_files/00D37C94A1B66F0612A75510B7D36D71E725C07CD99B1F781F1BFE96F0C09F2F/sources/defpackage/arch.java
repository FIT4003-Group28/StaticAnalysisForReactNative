package defpackage;
/* compiled from: PG */
/* renamed from: arch  reason: default package */
/* loaded from: classes2.dex */
public final class arch extends aopi implements aoqv {
    public static final arch a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private arag e;
    private arag f;
    private arcs g;
    private ateb h;
    private aunb i;
    private byte j = 2;

    static {
        arch archVar = new arch();
        a = archVar;
        aopi.registerDefaultInstance(arch.class, archVar);
    }

    private arch() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u0013\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\rᐉ\b\u0013ᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new arch();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arch.class) {
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
