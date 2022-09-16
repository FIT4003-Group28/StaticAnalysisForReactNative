package defpackage;
/* compiled from: PG */
/* renamed from: anqe  reason: default package */
/* loaded from: classes.dex */
public final class anqe extends aopi implements aoqv {
    public static final anqe a;
    private static volatile aorb d;
    public int b;
    public aoob c = aoob.b;

    static {
        anqe anqeVar = new anqe();
        a = anqeVar;
        aopi.registerDefaultInstance(anqe.class, anqeVar);
    }

    private anqe() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"b", "c"});
            case 3:
                return new anqe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anqe.class) {
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
