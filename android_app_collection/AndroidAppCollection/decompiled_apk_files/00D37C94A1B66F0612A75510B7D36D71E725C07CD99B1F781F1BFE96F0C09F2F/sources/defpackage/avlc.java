package defpackage;
/* compiled from: PG */
/* renamed from: avlc  reason: default package */
/* loaded from: classes2.dex */
public final class avlc extends aopi implements aoqv {
    public static final avlc a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private avle g;
    private avld h;
    private arag i;
    private aoux j;
    private byte k = 2;

    static {
        avlc avlcVar = new avlc();
        a = avlcVar;
        aopi.registerDefaultInstance(avlc.class, avlcVar);
    }

    private avlc() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\f\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\u0005\nᐉ\u000b\u000bᐉ\u0007\fᐉ\f", new Object[]{"c", "d", "f", "h", "e", "i", "g", "j"});
            case 3:
                return new avlc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avlc.class) {
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
