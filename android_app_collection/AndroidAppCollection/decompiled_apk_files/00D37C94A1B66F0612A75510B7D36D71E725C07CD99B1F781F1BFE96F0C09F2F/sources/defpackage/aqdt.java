package defpackage;
/* compiled from: PG */
/* renamed from: aqdt  reason: default package */
/* loaded from: classes2.dex */
public final class aqdt extends aopi implements aoqv {
    public static final aqdt a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aqdt aqdtVar = new aqdt();
        a = aqdtVar;
        aopi.registerDefaultInstance(aqdt.class, aqdtVar);
    }

    private aqdt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uec6a䂺\uec6a䂺\u0001\u0000\u0000\u0000\uec6a䂺ြ\u0000", new Object[]{"c", "b", aqdy.class});
            case 3:
                return new aqdt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqdt.class) {
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
