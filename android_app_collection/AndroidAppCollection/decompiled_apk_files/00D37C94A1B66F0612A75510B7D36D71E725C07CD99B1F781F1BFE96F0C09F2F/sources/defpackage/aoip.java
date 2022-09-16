package defpackage;
/* compiled from: PG */
/* renamed from: aoip  reason: default package */
/* loaded from: classes.dex */
public final class aoip extends aopi implements aoqv {
    public static final aoip a;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        aoip aoipVar = new aoip();
        a = aoipVar;
        aopi.registerDefaultInstance(aoip.class, aoipVar);
    }

    private aoip() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000bဈ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoip();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aoip.class) {
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
