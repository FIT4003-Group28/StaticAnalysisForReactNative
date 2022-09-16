package defpackage;
/* compiled from: PG */
/* renamed from: anrc  reason: default package */
/* loaded from: classes.dex */
public final class anrc extends aopi implements aoqv {
    public static final anrc a;
    private static volatile aorb e;
    public String b = "";
    public aoob c = aoob.b;
    public int d;

    static {
        anrc anrcVar = new anrc();
        a = anrcVar;
        aopi.registerDefaultInstance(anrc.class, anrcVar);
    }

    private anrc() {
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
                return new anrc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anrc.class) {
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
