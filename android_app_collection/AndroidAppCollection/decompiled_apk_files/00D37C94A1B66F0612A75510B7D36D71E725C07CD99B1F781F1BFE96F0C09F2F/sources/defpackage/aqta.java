package defpackage;
/* compiled from: PG */
/* renamed from: aqta  reason: default package */
/* loaded from: classes2.dex */
public final class aqta extends aopi implements aoqv {
    public static final aqta a;
    public static final aopg b;
    private static volatile aorb d;
    public int c;
    private int e;

    static {
        aqta aqtaVar = new aqta();
        a = aqtaVar;
        aopi.registerDefaultInstance(aqta.class, aqtaVar);
        b = aopi.newSingularGeneratedExtension(aqtc.a, aqtaVar, aqtaVar, null, 259430334, aosj.MESSAGE, aqta.class);
    }

    private aqta() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"e", "c", apvq.n});
            case 3:
                return new aqta();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqta.class) {
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
