package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: anrm  reason: default package */
/* loaded from: classes.dex */
public final class anrm extends aopi implements aoqv {
    public static final anrm a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        anrm anrmVar = new anrm();
        a = anrmVar;
        aopi.registerDefaultInstance(anrm.class, anrmVar);
    }

    private anrm() {
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", anrd.class});
            case 3:
                return new anrm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (anrm.class) {
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
