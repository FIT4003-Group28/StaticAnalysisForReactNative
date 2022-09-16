package defpackage;
/* compiled from: PG */
/* renamed from: uik  reason: default package */
/* loaded from: classes4.dex */
public final class uik extends aopi implements aoqv {
    public static final aopr a = new uil(1);
    public static final uik b;
    private static volatile aorb d;
    public aopq c = emptyIntList();

    static {
        uik uikVar = new uik();
        b = uikVar;
        aopi.registerDefaultInstance(uik.class, uikVar);
    }

    private uik() {
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
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"c", aomb.b()});
            case 3:
                return new uik();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (uik.class) {
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
