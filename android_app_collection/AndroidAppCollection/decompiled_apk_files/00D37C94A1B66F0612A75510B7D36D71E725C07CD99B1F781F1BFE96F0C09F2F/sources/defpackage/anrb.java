package defpackage;
/* compiled from: PG */
/* renamed from: anrb  reason: default package */
/* loaded from: classes.dex */
public final class anrb extends aopi implements aoqv {
    public static final anrb a;
    private static volatile aorb e;
    public String b = "";
    public aoob c = aoob.b;
    public int d;

    static {
        anrb anrbVar = new anrb();
        a = anrbVar;
        aopi.registerDefaultInstance(anrb.class, anrbVar);
    }

    private anrb() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
            case 3:
                return new anrb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anrb.class) {
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
