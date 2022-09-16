package defpackage;
/* compiled from: PG */
/* renamed from: aqyy  reason: default package */
/* loaded from: classes2.dex */
public final class aqyy extends aopi implements aoqv {
    public static final aqyy a;
    private static volatile aorb d;
    public boolean b;
    public boolean c;
    private int e;

    static {
        aqyy aqyyVar = new aqyy();
        a = aqyyVar;
        aopi.registerDefaultInstance(aqyy.class, aqyyVar);
    }

    private aqyy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new aqyy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqyy.class) {
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
