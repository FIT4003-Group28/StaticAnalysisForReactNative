package defpackage;
/* compiled from: PG */
/* renamed from: anrs  reason: default package */
/* loaded from: classes.dex */
public final class anrs extends aopi implements aoqv {
    public static final anrs a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        anrs anrsVar = new anrs();
        a = anrsVar;
        aopi.registerDefaultInstance(anrs.class, anrsVar);
    }

    private anrs() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new anrs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anrs.class) {
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
