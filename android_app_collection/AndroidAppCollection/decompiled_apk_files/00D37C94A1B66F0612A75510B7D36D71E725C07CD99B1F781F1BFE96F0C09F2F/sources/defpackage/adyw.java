package defpackage;
/* compiled from: PG */
/* renamed from: adyw  reason: default package */
/* loaded from: classes.dex */
public final class adyw extends aopi implements aoqv {
    public static final adyw a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aopq d = emptyIntList();

    static {
        adyw adywVar = new adyw();
        a = adywVar;
        aopi.registerDefaultInstance(adyw.class, adywVar);
    }

    private adyw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"b", "c", "d", orl.b()});
            case 3:
                return new adyw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (adyw.class) {
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
