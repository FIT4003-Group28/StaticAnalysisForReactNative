package defpackage;
/* compiled from: PG */
/* renamed from: arbq  reason: default package */
/* loaded from: classes2.dex */
public final class arbq extends aopi implements aoqv {
    public static final arbq a;
    private static volatile aorb d;
    public aunb b;
    private int e;
    private aunb f;
    private aunb g;
    private aoux h;
    private apzg i;
    private byte j = 2;
    public aoob c = aoob.b;

    static {
        arbq arbqVar = new arbq();
        a = arbqVar;
        aopi.registerDefaultInstance(arbq.class, arbqVar);
    }

    private arbq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005", new Object[]{"e", "b", "f", "g", "h", "c", "i"});
            case 3:
                return new arbq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arbq.class) {
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
