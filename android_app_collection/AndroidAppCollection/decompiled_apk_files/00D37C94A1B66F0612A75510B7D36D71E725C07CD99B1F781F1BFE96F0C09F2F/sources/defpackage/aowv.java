package defpackage;
/* compiled from: PG */
/* renamed from: aowv  reason: default package */
/* loaded from: classes.dex */
public final class aowv extends aopi implements aoqv {
    public static final aowv a;
    private static volatile aorb f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        aowv aowvVar = new aowv();
        a = aowvVar;
        aopi.registerDefaultInstance(aowv.class, aowvVar);
    }

    private aowv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", aotr.t, "d", aoxm.b, "e", aotr.u});
            case 3:
                return new aowv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aowv.class) {
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
