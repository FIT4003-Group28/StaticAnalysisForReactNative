package defpackage;
/* compiled from: PG */
/* renamed from: avsq  reason: default package */
/* loaded from: classes2.dex */
public final class avsq extends aopi implements aoqv {
    public static final avsq a;
    private static volatile aorb b;
    private int c;
    private aqft d;
    private byte e = 2;

    static {
        avsq avsqVar = new avsq();
        a = avsqVar;
        aopi.registerDefaultInstance(avsq.class, avsqVar);
    }

    private avsq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf321Ẑ\uf321Ẑ\u0001\u0000\u0000\u0001\uf321Ẑᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new avsq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avsq.class) {
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
