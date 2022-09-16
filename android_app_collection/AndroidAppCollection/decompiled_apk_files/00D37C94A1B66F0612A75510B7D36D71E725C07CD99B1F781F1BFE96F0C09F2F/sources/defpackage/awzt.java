package defpackage;
/* compiled from: PG */
/* renamed from: awzt  reason: default package */
/* loaded from: classes2.dex */
public final class awzt extends aopi implements aoqv {
    public static final aopr a = new asvu(11);
    public static final awzt b;
    private static volatile aorb f;
    public int c;
    public int d;
    public aopq e = emptyIntList();

    static {
        awzt awztVar = new awzt();
        b = awztVar;
        aopi.registerDefaultInstance(awzt.class, awztVar);
    }

    private awzt() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"c", "d", awzv.a(), "e", awzv.a()});
            case 3:
                return new awzt();
            case 4:
                return new aopa((byte[][]) null, (short[][]) null);
            case 5:
                return b;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awzt.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
