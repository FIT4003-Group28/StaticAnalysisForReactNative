package defpackage;
/* compiled from: PG */
/* renamed from: orq  reason: default package */
/* loaded from: classes4.dex */
public final class orq extends aopi implements aoqv {
    public static final orq a;
    private static volatile aorb e;
    public long b;
    public int c;
    public int d;
    private int f;
    private byte g = 2;

    static {
        orq orqVar = new orq();
        a = orqVar;
        aopi.registerDefaultInstance(orq.class, orqVar);
    }

    private orq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new orq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (orq.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
