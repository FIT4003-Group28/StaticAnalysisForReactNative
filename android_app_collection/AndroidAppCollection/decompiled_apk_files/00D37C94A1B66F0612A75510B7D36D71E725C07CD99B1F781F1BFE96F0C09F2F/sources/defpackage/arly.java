package defpackage;
/* compiled from: PG */
/* renamed from: arly  reason: default package */
/* loaded from: classes2.dex */
public final class arly extends aopi implements aoqv {
    public static final arly a;
    private static volatile aorb c;
    public aopu b = aopi.emptyProtobufList();

    static {
        arly arlyVar = new arly();
        a = arlyVar;
        aopi.registerDefaultInstance(arly.class, arlyVar);
    }

    private arly() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
            case 3:
                return new arly();
            case 4:
                return new aopa((int[][][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arly.class) {
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
