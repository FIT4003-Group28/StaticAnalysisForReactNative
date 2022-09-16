package defpackage;
/* compiled from: PG */
/* renamed from: anrr  reason: default package */
/* loaded from: classes.dex */
public final class anrr extends aopi implements aoqv {
    public static final anrr a;
    private static volatile aorb e;
    public anrs b;
    public int c;
    public aoob d = aoob.b;

    static {
        anrr anrrVar = new anrr();
        a = anrrVar;
        aopi.registerDefaultInstance(anrr.class, anrrVar);
    }

    private anrr() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"b", "c", "d"});
            case 3:
                return new anrr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anrr.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
