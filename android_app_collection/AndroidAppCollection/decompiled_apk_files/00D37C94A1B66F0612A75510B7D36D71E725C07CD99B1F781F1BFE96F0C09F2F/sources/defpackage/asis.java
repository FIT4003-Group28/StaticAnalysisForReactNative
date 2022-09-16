package defpackage;
/* compiled from: PG */
/* renamed from: asis  reason: default package */
/* loaded from: classes2.dex */
public final class asis extends aopi implements aoqv {
    public static final asis a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        asis asisVar = new asis();
        a = asisVar;
        aopi.registerDefaultInstance(asis.class, asisVar);
    }

    private asis() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", asir.class});
            case 3:
                return new asis();
            case 4:
                return new aopa((byte[]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (asis.class) {
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
