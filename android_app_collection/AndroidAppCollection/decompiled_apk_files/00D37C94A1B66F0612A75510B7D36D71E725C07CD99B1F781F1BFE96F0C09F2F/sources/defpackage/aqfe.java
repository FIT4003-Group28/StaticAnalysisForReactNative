package defpackage;
/* compiled from: PG */
/* renamed from: aqfe  reason: default package */
/* loaded from: classes2.dex */
public final class aqfe extends aopi implements aoqv {
    public static final aqfe a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public boolean d;

    static {
        aqfe aqfeVar = new aqfe();
        a = aqfeVar;
        aopi.registerDefaultInstance(aqfe.class, aqfeVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aqfeVar, aqfeVar, null, 116, aosj.MESSAGE, aqfe.class);
    }

    private aqfe() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqfe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqfe.class) {
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
