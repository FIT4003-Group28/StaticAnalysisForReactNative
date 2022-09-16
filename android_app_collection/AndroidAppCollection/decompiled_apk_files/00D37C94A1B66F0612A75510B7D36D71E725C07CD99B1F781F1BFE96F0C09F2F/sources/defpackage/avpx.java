package defpackage;
/* compiled from: PG */
/* renamed from: avpx  reason: default package */
/* loaded from: classes2.dex */
public final class avpx extends aopi implements aoqv {
    public static final avpx a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private arag e;
    private aunb f;
    private arag g;
    private arag h;
    private apzg i;
    private aplw j;
    private aoux k;
    private byte l = 2;

    static {
        avpx avpxVar = new avpx();
        a = avpxVar;
        aopi.registerDefaultInstance(avpx.class, avpxVar);
    }

    private avpx() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\b\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "k", "j"});
            case 3:
                return new avpx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpx.class) {
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
