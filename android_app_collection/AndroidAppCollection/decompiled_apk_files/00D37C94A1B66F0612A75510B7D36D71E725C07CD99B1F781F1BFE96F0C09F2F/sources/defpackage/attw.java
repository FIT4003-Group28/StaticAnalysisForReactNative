package defpackage;
/* compiled from: PG */
/* renamed from: attw  reason: default package */
/* loaded from: classes2.dex */
public final class attw extends aopi implements aoqv {
    public static final attw a;
    private static volatile aorb d;
    public boolean b;
    public aoob c = aoob.b;
    private int e;

    static {
        attw attwVar = new attw();
        a = attwVar;
        aopi.registerDefaultInstance(attw.class, attwVar);
    }

    private attw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0004ည\u0003", new Object[]{"e", "b", "c"});
            case 3:
                return new attw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (attw.class) {
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
