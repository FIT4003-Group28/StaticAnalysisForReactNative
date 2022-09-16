package defpackage;
/* compiled from: PG */
/* renamed from: asuq  reason: default package */
/* loaded from: classes2.dex */
public final class asuq extends aopi implements aoqv {
    public static final asuq a;
    private static volatile aorb d;
    public boolean b;
    public long c;
    private int e;
    private aunb f;
    private byte g = 2;

    static {
        asuq asuqVar = new asuq();
        a = asuqVar;
        aopi.registerDefaultInstance(asuq.class, asuqVar);
    }

    private asuq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဃ\u0002", new Object[]{"e", "b", "f", "c"});
            case 3:
                return new asuq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asuq.class) {
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
