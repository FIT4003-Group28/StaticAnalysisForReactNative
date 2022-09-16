package defpackage;
/* compiled from: PG */
/* renamed from: arbh  reason: default package */
/* loaded from: classes2.dex */
public final class arbh extends aopi implements aoqv {
    public static final arbh a;
    private static volatile aorb f;
    public int b;
    public aunb c;
    public long d;
    public aoyz e;
    private byte g = 2;

    static {
        arbh arbhVar = new arbh();
        a = arbhVar;
        aopi.registerDefaultInstance(arbh.class, arbhVar);
    }

    private arbh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဂ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new arbh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arbh.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
