package defpackage;
/* compiled from: PG */
/* renamed from: aphp  reason: default package */
/* loaded from: classes.dex */
public final class aphp extends aopi implements aoqv {
    public static final aphp a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        aphp aphpVar = new aphp();
        a = aphpVar;
        aopi.registerDefaultInstance(aphp.class, aphpVar);
        b = aopi.newSingularGeneratedExtension(apba.a, false, null, null, 120958174, aosj.BOOL, Boolean.class);
    }

    private aphp() {
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
                return new aphp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aphp.class) {
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
