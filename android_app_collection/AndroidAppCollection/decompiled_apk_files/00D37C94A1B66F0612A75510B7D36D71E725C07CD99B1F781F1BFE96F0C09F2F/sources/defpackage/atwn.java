package defpackage;
/* compiled from: PG */
/* renamed from: atwn  reason: default package */
/* loaded from: classes2.dex */
public final class atwn extends aopi implements aoqv {
    public static final atwn a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        atwn atwnVar = new atwn();
        a = atwnVar;
        aopi.registerDefaultInstance(atwn.class, atwnVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atwnVar, atwnVar, null, 377026399, aosj.MESSAGE, atwn.class);
    }

    private atwn() {
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
                return new atwn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atwn.class) {
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
