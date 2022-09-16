package defpackage;
/* compiled from: PG */
/* renamed from: avrk  reason: default package */
/* loaded from: classes2.dex */
public final class avrk extends aopi implements aoqv {
    public static final avrk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private aoux h;
    private byte i = 2;

    static {
        avrk avrkVar = new avrk();
        a = avrkVar;
        aopi.registerDefaultInstance(avrk.class, avrkVar);
    }

    private avrk() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002ᐉ\u0002\u0005ᐉ\b\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"c", "d", "h", "e", "f", "g"});
            case 3:
                return new avrk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrk.class) {
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
