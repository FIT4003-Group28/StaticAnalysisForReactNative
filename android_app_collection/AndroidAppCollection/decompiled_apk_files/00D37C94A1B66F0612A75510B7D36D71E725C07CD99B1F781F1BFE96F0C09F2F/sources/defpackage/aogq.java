package defpackage;
/* compiled from: PG */
/* renamed from: aogq  reason: default package */
/* loaded from: classes.dex */
public final class aogq extends aopi implements aoqv {
    public static final aogq a;
    private static volatile aorb c;
    public alzc b;
    private byte d = 2;

    static {
        aogq aogqVar = new aogq();
        a = aogqVar;
        aopi.registerDefaultInstance(aogq.class, aogqVar);
    }

    private aogq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"b"});
            case 3:
                return new aogq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aogq.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
