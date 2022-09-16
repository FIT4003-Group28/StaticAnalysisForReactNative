package defpackage;
/* compiled from: PG */
/* renamed from: aqdn  reason: default package */
/* loaded from: classes2.dex */
public final class aqdn extends aopi implements aoqv {
    public static final aqdn a;
    private static volatile aorb b;
    private int c;
    private arcq d;
    private arag e;
    private arag f;
    private aoux g;
    private arcs h;
    private arag i;
    private apzg j;
    private byte k = 2;

    static {
        aqdn aqdnVar = new aqdn();
        a = aqdnVar;
        aopi.registerDefaultInstance(aqdn.class, aqdnVar);
    }

    private aqdn() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002ᐉ\u0007\u0003ᐉ\u0003\u0004ᐉ\n\u0005ᐉ\u0004\bᐉ\u0002\tᐉ\u0006\nᐉ\u0000", new Object[]{"c", "i", "f", "j", "g", "e", "h", "d"});
            case 3:
                return new aqdn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqdn.class) {
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
