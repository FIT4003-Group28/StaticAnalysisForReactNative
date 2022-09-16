package defpackage;
/* compiled from: PG */
/* renamed from: avrs  reason: default package */
/* loaded from: classes2.dex */
public final class avrs extends aopi implements aoqv {
    public static final avrs a;
    private static volatile aorb d;
    public int b;
    private arag e;
    private arag f;
    private apzg g;
    private aoux h;
    private byte i = 2;
    public aoob c = aoob.b;

    static {
        avrs avrsVar = new avrs();
        a = avrsVar;
        aopi.registerDefaultInstance(avrs.class, avrsVar);
    }

    private avrs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\r\u0005\u0000\u0000\u0004\u0003ᐉ\u0002\u0004ᐉ\u0003\u000bᐉ\t\fည\n\rᐉ\u0006", new Object[]{"b", "e", "f", "h", "c", "g"});
            case 3:
                return new avrs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avrs.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
