package defpackage;
/* compiled from: PG */
/* renamed from: anff  reason: default package */
/* loaded from: classes.dex */
public final class anff extends aopi implements aoqv {
    public static final anff a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        anff anffVar = new anff();
        a = anffVar;
        aopi.registerDefaultInstance(anff.class, anffVar);
        b = aopi.newSingularGeneratedExtension(anev.a, anffVar, anffVar, null, 118, aosj.MESSAGE, anff.class);
    }

    private anff() {
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
                return new anff();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (anff.class) {
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
