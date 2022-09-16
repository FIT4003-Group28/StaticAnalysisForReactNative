package defpackage;
/* compiled from: PG */
/* renamed from: aojm  reason: default package */
/* loaded from: classes.dex */
public final class aojm extends aopi implements aoqv {
    public static final aojm a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        aojm aojmVar = new aojm();
        a = aojmVar;
        aopi.registerDefaultInstance(aojm.class, aojmVar);
    }

    private aojm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဌ\u0003", new Object[]{"b", "c", aoix.j});
            case 3:
                return new aojm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aojm.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
