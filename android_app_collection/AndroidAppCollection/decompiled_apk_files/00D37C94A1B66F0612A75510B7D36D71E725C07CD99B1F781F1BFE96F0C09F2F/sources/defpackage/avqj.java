package defpackage;
/* compiled from: PG */
/* renamed from: avqj  reason: default package */
/* loaded from: classes2.dex */
public final class avqj extends aopi implements aoqv {
    public static final avqj a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aunb e;
    private aunb f;
    private apzg g;
    private aoux h;
    private byte i = 2;

    static {
        avqj avqjVar = new avqj();
        a = avqjVar;
        aopi.registerDefaultInstance(avqj.class, avqjVar);
    }

    private avqj() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0005\n\u0005\u0000\u0000\u0005\u0005ᐉ\u0007\u0006ᐉ\b\bᐉ\n\tᐉ\u0002\nᐉ\u0003", new Object[]{"c", "f", "g", "h", "d", "e"});
            case 3:
                return new avqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqj.class) {
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
