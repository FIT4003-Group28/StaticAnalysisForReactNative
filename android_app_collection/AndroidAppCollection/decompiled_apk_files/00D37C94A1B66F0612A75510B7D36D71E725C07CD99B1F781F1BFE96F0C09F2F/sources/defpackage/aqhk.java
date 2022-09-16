package defpackage;
/* compiled from: PG */
/* renamed from: aqhk  reason: default package */
/* loaded from: classes2.dex */
public final class aqhk extends aopi implements aoqv {
    public static final aqhk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apzg g;
    private apzg h;
    private aqhj i;
    private aoux j;
    private byte k = 2;

    static {
        aqhk aqhkVar = new aqhk();
        a = aqhkVar;
        aopi.registerDefaultInstance(aqhk.class, aqhkVar);
    }

    private aqhk() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\u0003\u0005ᐉ\t\u0006ᐉ\u0004\bᐉ\u0005\tᐉ\u0007\fᐉ\u0001\rᐉ\u0002", new Object[]{"c", "f", "j", "g", "h", "i", "d", "e"});
            case 3:
                return new aqhk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhk.class) {
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
