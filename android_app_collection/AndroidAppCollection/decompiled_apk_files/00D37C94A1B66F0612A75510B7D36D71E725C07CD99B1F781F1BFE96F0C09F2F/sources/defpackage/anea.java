package defpackage;
/* compiled from: PG */
/* renamed from: anea  reason: default package */
/* loaded from: classes.dex */
public final class anea extends aopi implements aoqv {
    public static final anea a;
    private static volatile aorb c;
    public String b = "";
    private int d;

    static {
        anea aneaVar = new anea();
        a = aneaVar;
        aopi.registerDefaultInstance(anea.class, aneaVar);
    }

    private anea() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0000", new Object[]{"d", "b"});
            case 3:
                return new anea();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (anea.class) {
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
