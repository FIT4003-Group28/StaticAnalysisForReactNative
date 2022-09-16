package defpackage;
/* compiled from: PG */
/* renamed from: awln  reason: default package */
/* loaded from: classes2.dex */
public final class awln extends aopi implements aoqv {
    public static final awln a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        awln awlnVar = new awln();
        a = awlnVar;
        aopi.registerDefaultInstance(awln.class, awlnVar);
    }

    private awln() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", tpp.class});
            case 3:
                return new awln();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awln.class) {
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
