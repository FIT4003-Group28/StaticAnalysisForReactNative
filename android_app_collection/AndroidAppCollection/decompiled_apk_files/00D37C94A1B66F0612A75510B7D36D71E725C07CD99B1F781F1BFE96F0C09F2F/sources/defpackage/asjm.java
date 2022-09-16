package defpackage;
/* compiled from: PG */
/* renamed from: asjm  reason: default package */
/* loaded from: classes2.dex */
public final class asjm extends aopi implements aoqv {
    public static final asjm a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        asjm asjmVar = new asjm();
        a = asjmVar;
        aopi.registerDefaultInstance(asjm.class, asjmVar);
    }

    private asjm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", asjl.class});
            case 3:
                return new asjm();
            case 4:
                return new aopa((byte[][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (asjm.class) {
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
