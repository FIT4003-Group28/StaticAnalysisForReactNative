package defpackage;
/* compiled from: PG */
/* renamed from: aqmp  reason: default package */
/* loaded from: classes2.dex */
public final class aqmp extends aopi implements aoqv {
    public static final aqmp a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        aqmp aqmpVar = new aqmp();
        a = aqmpVar;
        aopi.registerDefaultInstance(aqmp.class, aqmpVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqmpVar, aqmpVar, null, 221166232, aosj.MESSAGE, aqmp.class);
    }

    private aqmp() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new aqmp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqmp.class) {
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
