package defpackage;
/* compiled from: PG */
/* renamed from: avyo  reason: default package */
/* loaded from: classes2.dex */
public final class avyo extends aopi implements aoqv {
    public static final aopr a = new asvu(9);
    public static final avyo b;
    private static volatile aorb d;
    public aopq c = emptyIntList();

    static {
        avyo avyoVar = new avyo();
        b = avyoVar;
        aopi.registerDefaultInstance(avyo.class, avyoVar);
    }

    private avyo() {
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
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"c", avxv.a()});
            case 3:
                return new avyo();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avyo.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
