package defpackage;
/* compiled from: PG */
/* renamed from: atwm  reason: default package */
/* loaded from: classes2.dex */
public final class atwm extends aopi implements aoqv {
    public static final atwm a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        atwm atwmVar = new atwm();
        a = atwmVar;
        aopi.registerDefaultInstance(atwm.class, atwmVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atwmVar, atwmVar, null, 377026217, aosj.MESSAGE, atwm.class);
    }

    private atwm() {
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
                return new atwm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atwm.class) {
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
