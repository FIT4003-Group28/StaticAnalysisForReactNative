package defpackage;
/* compiled from: PG */
/* renamed from: adzm  reason: default package */
/* loaded from: classes.dex */
public final class adzm extends aopi implements aoqv {
    public static final adzm a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        adzm adzmVar = new adzm();
        a = adzmVar;
        aopi.registerDefaultInstance(adzm.class, adzmVar);
    }

    private adzm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", adyw.class});
            case 3:
                return new adzm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (adzm.class) {
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
