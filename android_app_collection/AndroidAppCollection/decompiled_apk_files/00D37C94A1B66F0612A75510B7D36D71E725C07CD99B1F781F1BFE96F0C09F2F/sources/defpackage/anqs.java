package defpackage;
/* compiled from: PG */
/* renamed from: anqs  reason: default package */
/* loaded from: classes.dex */
public final class anqs extends aopi implements aoqv {
    public static final anqs a;
    private static volatile aorb f;
    public int b;
    public anqq c;
    public aoob d = aoob.b;
    public aoob e = aoob.b;

    static {
        anqs anqsVar = new anqs();
        a = anqsVar;
        aopi.registerDefaultInstance(anqs.class, anqsVar);
    }

    private anqs() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new anqs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anqs.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
