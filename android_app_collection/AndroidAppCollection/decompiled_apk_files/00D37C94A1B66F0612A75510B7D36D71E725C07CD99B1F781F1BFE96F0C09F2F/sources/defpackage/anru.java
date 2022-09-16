package defpackage;
/* compiled from: PG */
/* renamed from: anru  reason: default package */
/* loaded from: classes.dex */
public final class anru extends aopi implements aoqv {
    public static final anru a;
    private static volatile aorb f;
    public int b;
    public anrs c;
    public aoob d = aoob.b;
    public aoob e = aoob.b;

    static {
        anru anruVar = new anru();
        a = anruVar;
        aopi.registerDefaultInstance(anru.class, anruVar);
    }

    private anru() {
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
                return new anru();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anru.class) {
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
