package defpackage;
/* compiled from: PG */
/* renamed from: aovs  reason: default package */
/* loaded from: classes.dex */
public final class aovs extends aopi implements aoqv {
    public static final aovs a;
    private static volatile aorb d;
    public int b;
    public aovr c;

    static {
        aovs aovsVar = new aovs();
        a = aovsVar;
        aopi.registerDefaultInstance(aovs.class, aovsVar);
    }

    private aovs() {
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
                return new aovs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aovs.class) {
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
