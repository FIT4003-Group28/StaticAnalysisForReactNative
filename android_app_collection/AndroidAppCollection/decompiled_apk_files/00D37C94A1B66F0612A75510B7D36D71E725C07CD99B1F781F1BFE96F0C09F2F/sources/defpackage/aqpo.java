package defpackage;
/* compiled from: PG */
/* renamed from: aqpo  reason: default package */
/* loaded from: classes2.dex */
public final class aqpo extends aopi implements aoqv {
    public static final aqpo a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public int d;

    static {
        aqpo aqpoVar = new aqpo();
        a = aqpoVar;
        aopi.registerDefaultInstance(aqpo.class, aqpoVar);
        b = aopi.newSingularGeneratedExtension(awbp.a, aqpoVar, aqpoVar, null, 337527695, aosj.MESSAGE, aqpo.class);
    }

    private aqpo() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", awkj.a()});
            case 3:
                return new aqpo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqpo.class) {
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
