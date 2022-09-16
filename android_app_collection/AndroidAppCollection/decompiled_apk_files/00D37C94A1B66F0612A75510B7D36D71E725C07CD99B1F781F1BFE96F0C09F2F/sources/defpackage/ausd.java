package defpackage;
/* compiled from: PG */
/* renamed from: ausd  reason: default package */
/* loaded from: classes2.dex */
public final class ausd extends aopi implements aoqv {
    public static final ausd a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private arag h;
    private apzg i;
    private aoux j;
    private byte k = 2;

    static {
        ausd ausdVar = new ausd();
        a = ausdVar;
        aopi.registerDefaultInstance(ausd.class, ausdVar);
    }

    private ausd() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0007\u0001ᐉ\u0002\u0002ᐉ\u0007\u0003ᐉ\b\u0006ᐉ\u0005\bᐉ\u0006\nᐉ\t\fᐉ\u0003", new Object[]{"c", "d", "h", "i", "f", "g", "j", "e"});
            case 3:
                return new ausd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ausd.class) {
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
