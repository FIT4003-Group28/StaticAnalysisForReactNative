package defpackage;
/* compiled from: PG */
/* renamed from: arah  reason: default package */
/* loaded from: classes2.dex */
public final class arah extends aopi implements aoqv {
    public static final arah a;
    private static volatile aorb d;
    public int b;
    public aovr c;

    static {
        arah arahVar = new arah();
        a = arahVar;
        aopi.registerDefaultInstance(arah.class, arahVar);
    }

    private arah() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uecfa␜\uecfa␜\u0001\u0000\u0000\u0000\uecfa␜ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arah();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arah.class) {
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
