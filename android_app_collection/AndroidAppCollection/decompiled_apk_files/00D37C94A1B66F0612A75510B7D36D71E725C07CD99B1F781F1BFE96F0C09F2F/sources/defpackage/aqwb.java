package defpackage;
/* compiled from: PG */
/* renamed from: aqwb  reason: default package */
/* loaded from: classes2.dex */
public final class aqwb extends aopi implements aoqv {
    public static final aqwb a;
    private static volatile aorb c;
    public aoqp b = aoqp.a;

    static {
        aqwb aqwbVar = new aqwb();
        a = aqwbVar;
        aopi.registerDefaultInstance(aqwb.class, aqwbVar);
    }

    private aqwb() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aqwa.a});
            case 3:
                return new aqwb();
            case 4:
                return new aopa((char[]) null, (float[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqwb.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
