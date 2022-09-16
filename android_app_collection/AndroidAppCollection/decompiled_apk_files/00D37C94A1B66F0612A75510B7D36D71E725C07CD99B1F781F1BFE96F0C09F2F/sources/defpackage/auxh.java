package defpackage;
/* compiled from: PG */
/* renamed from: auxh  reason: default package */
/* loaded from: classes2.dex */
public final class auxh extends aopi implements aoqv {
    public static final auxh a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        auxh auxhVar = new auxh();
        a = auxhVar;
        aopi.registerDefaultInstance(auxh.class, auxhVar);
        b = aopi.newSingularGeneratedExtension(auxn.a, false, null, null, 239610506, aosj.BOOL, Boolean.class);
    }

    private auxh() {
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
                return new auxh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (auxh.class) {
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
