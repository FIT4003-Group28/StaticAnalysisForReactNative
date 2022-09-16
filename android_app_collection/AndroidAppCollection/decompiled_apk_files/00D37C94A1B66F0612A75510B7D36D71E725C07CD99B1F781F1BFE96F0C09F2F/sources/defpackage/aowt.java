package defpackage;
/* compiled from: PG */
/* renamed from: aowt  reason: default package */
/* loaded from: classes.dex */
public final class aowt extends aopi implements aoqv {
    public static final aowt a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        aowt aowtVar = new aowt();
        a = aowtVar;
        aopi.registerDefaultInstance(aowt.class, aowtVar);
    }

    private aowt() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", aotr.s, "d", aotr.r});
            case 3:
                return new aowt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aowt.class) {
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
