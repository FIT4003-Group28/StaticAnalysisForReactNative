package defpackage;
/* compiled from: PG */
/* renamed from: awba  reason: default package */
/* loaded from: classes2.dex */
public final class awba extends aopi implements aoqv {
    public static final awba a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        awba awbaVar = new awba();
        a = awbaVar;
        aopi.registerDefaultInstance(awba.class, awbaVar);
    }

    private awba() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", awaz.class});
            case 3:
                return new awba();
            case 4:
                return new aopa((int[]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awba.class) {
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
