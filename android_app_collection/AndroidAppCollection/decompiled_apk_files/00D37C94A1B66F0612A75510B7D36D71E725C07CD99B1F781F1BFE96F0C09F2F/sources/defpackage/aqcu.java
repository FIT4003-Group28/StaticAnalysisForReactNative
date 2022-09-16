package defpackage;
/* compiled from: PG */
/* renamed from: aqcu  reason: default package */
/* loaded from: classes2.dex */
public final class aqcu extends aopi implements aoqv {
    public static final aqcu a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aqcu aqcuVar = new aqcu();
        a = aqcuVar;
        aopi.registerDefaultInstance(aqcu.class, aqcuVar);
    }

    private aqcu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"c", "b", aqcw.class});
            case 3:
                return new aqcu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqcu.class) {
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
