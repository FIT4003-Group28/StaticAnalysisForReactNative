package defpackage;
/* compiled from: PG */
/* renamed from: athy  reason: default package */
/* loaded from: classes2.dex */
public final class athy extends aopi implements aoqv {
    public static final athy a;
    private static volatile aorb e;
    public int b = 0;
    public Object c;
    public int d;
    private int f;

    static {
        athy athyVar = new athy();
        a = athyVar;
        aopi.registerDefaultInstance(athy.class, athyVar);
    }

    private athy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002်\u0000", new Object[]{"c", "b", "f", "d", atdq.k});
            case 3:
                return new athy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (athy.class) {
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
