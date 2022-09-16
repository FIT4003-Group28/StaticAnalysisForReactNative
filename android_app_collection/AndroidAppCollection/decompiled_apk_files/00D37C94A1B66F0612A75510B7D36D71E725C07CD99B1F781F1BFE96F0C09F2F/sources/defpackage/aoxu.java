package defpackage;
/* compiled from: PG */
/* renamed from: aoxu  reason: default package */
/* loaded from: classes.dex */
public final class aoxu extends aopi implements aoqv {
    public static final aoxu a;
    private static volatile aorb c;
    public boolean b;
    private int d;

    static {
        aoxu aoxuVar = new aoxu();
        a = aoxuVar;
        aopi.registerDefaultInstance(aoxu.class, aoxuVar);
    }

    private aoxu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
            case 3:
                return new aoxu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aoxu.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
