package defpackage;
/* compiled from: PG */
/* renamed from: anrf  reason: default package */
/* loaded from: classes.dex */
public final class anrf extends aopi implements aoqv {
    public static final anrf a;
    private static volatile aorb d;
    public int b;
    public aopu c = emptyProtobufList();

    static {
        anrf anrfVar = new anrf();
        a = anrfVar;
        aopi.registerDefaultInstance(anrf.class, anrfVar);
    }

    private anrf() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"b", "c", anre.class});
            case 3:
                return new anrf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anrf.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
