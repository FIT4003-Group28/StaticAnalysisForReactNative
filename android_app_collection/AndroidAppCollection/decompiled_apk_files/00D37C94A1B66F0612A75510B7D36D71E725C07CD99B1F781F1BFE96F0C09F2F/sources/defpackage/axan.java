package defpackage;
/* compiled from: PG */
/* renamed from: axan  reason: default package */
/* loaded from: classes2.dex */
public final class axan extends aopi implements aoqv {
    public static final axan a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        axan axanVar = new axan();
        a = axanVar;
        aopi.registerDefaultInstance(axan.class, axanVar);
    }

    private axan() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", axal.class});
            case 3:
                return new axan();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (axan.class) {
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
