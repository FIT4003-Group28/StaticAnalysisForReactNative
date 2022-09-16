package defpackage;
/* compiled from: PG */
/* renamed from: apda  reason: default package */
/* loaded from: classes.dex */
public final class apda extends aopi implements aoqv {
    public static final apda a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        apda apdaVar = new apda();
        a = apdaVar;
        aopi.registerDefaultInstance(apda.class, apdaVar);
    }

    private apda() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", apdh.class});
            case 3:
                return new apda();
            case 4:
                return new aopa((float[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apda.class) {
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
