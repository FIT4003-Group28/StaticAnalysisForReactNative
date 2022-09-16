package defpackage;
/* compiled from: PG */
/* renamed from: avpu  reason: default package */
/* loaded from: classes2.dex */
public final class avpu extends aopi implements aoqv {
    public static final avpu a;
    private static volatile aorb b;
    private int c;
    private aqzs d;
    private byte e = 2;

    static {
        avpu avpuVar = new avpu();
        a = avpuVar;
        aopi.registerDefaultInstance(avpu.class, avpuVar);
    }

    private avpu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf52d\u2bbe\uf52d\u2bbe\u0001\u0000\u0000\u0001\uf52d\u2bbeᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new avpu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpu.class) {
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
