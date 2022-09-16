package defpackage;
/* compiled from: PG */
/* renamed from: aovg  reason: default package */
/* loaded from: classes.dex */
public final class aovg extends aopi implements aoqv {
    public static final aopr a = new uil(6);
    public static final aovg b;
    private static volatile aorb d;
    public aopq c = emptyIntList();

    static {
        aovg aovgVar = new aovg();
        b = aovgVar;
        aopi.registerDefaultInstance(aovg.class, aovgVar);
    }

    private aovg() {
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
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"c", aovh.a()});
            case 3:
                return new aovg();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aovg.class) {
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
