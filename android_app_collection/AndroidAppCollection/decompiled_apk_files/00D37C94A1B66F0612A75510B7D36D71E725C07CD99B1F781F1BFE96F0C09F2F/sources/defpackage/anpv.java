package defpackage;
/* compiled from: PG */
/* renamed from: anpv  reason: default package */
/* loaded from: classes.dex */
public final class anpv extends aopi implements aoqv {
    public static final anpv a;
    private static volatile aorb d;
    public anpx b;
    public anqz c;

    static {
        anpv anpvVar = new anpv();
        a = anpvVar;
        aopi.registerDefaultInstance(anpv.class, anpvVar);
    }

    private anpv() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"b", "c"});
            case 3:
                return new anpv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anpv.class) {
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
