package defpackage;
/* compiled from: PG */
/* renamed from: aeii  reason: default package */
/* loaded from: classes.dex */
public final class aeii extends aopi implements aoqv {
    public static final aeii a;
    private static volatile aorb d;
    public String b = "";
    public String c = "";
    private int e;

    static {
        aeii aeiiVar = new aeii();
        a = aeiiVar;
        aopi.registerDefaultInstance(aeii.class, aeiiVar);
    }

    private aeii() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new aeii();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aeii.class) {
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
