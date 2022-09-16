package defpackage;
/* compiled from: PG */
/* renamed from: amdr  reason: default package */
/* loaded from: classes.dex */
public final class amdr extends aopi implements aoqv {
    public static final amdr a;
    private static volatile aorb c;
    public aoqp b = aoqp.a;

    static {
        amdr amdrVar = new amdr();
        a = amdrVar;
        aopi.registerDefaultInstance(amdr.class, amdrVar);
    }

    private amdr() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", amdq.a});
            case 3:
                return new amdr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (amdr.class) {
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
