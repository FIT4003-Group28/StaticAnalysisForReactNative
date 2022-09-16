package defpackage;
/* compiled from: PG */
/* renamed from: apsr  reason: default package */
/* loaded from: classes2.dex */
public final class apsr extends aopi implements aoqv {
    public static final apsr a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        apsr apsrVar = new apsr();
        a = apsrVar;
        aopi.registerDefaultInstance(apsr.class, apsrVar);
        b = aopi.newSingularGeneratedExtension(apst.a, apsu.a, apsu.a, null, 123258328, aosj.MESSAGE, apsu.class);
    }

    private apsr() {
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
                return new apsr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apsr.class) {
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
