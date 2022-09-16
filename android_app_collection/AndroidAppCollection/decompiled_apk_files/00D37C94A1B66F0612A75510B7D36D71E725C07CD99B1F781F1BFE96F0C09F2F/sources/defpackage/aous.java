package defpackage;
/* compiled from: PG */
/* renamed from: aous  reason: default package */
/* loaded from: classes.dex */
public final class aous extends aopi implements aoqv {
    public static final aous a;
    private static volatile aorb c;
    public aoqp b = aoqp.a;

    static {
        aous aousVar = new aous();
        a = aousVar;
        aopi.registerDefaultInstance(aous.class, aousVar);
    }

    private aous() {
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aour.a});
            case 3:
                return new aous();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aous.class) {
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
