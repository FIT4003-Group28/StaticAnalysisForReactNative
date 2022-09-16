package defpackage;
/* compiled from: PG */
/* renamed from: anrq  reason: default package */
/* loaded from: classes.dex */
public final class anrq extends aopi implements aoqv {
    public static final anrq a;
    private static volatile aorb f;
    public int b;
    public anro c;
    public aoob d = aoob.b;
    public aoob e = aoob.b;

    static {
        anrq anrqVar = new anrq();
        a = anrqVar;
        aopi.registerDefaultInstance(anrq.class, anrqVar);
    }

    private anrq() {
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
                return new anrq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anrq.class) {
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
