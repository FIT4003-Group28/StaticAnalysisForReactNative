package defpackage;
/* compiled from: PG */
/* renamed from: anrp  reason: default package */
/* loaded from: classes.dex */
public final class anrp extends aopi implements aoqv {
    public static final anrp a;
    private static volatile aorb j;
    public int b;
    public anrq c;
    public aoob d = aoob.b;
    public aoob e = aoob.b;
    public aoob f = aoob.b;
    public aoob g = aoob.b;
    public aoob h = aoob.b;
    public aoob i = aoob.b;

    static {
        anrp anrpVar = new anrp();
        a = anrpVar;
        aopi.registerDefaultInstance(anrp.class, anrpVar);
    }

    private anrp() {
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
                return newMessageInfo(a, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new anrp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (anrp.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
