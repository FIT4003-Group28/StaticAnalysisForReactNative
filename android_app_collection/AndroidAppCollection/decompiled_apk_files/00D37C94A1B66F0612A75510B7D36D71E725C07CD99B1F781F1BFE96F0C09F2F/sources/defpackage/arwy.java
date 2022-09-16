package defpackage;
/* compiled from: PG */
/* renamed from: arwy  reason: default package */
/* loaded from: classes2.dex */
public final class arwy extends aopi implements aoqv {
    public static final arwy a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public int d = 1;

    static {
        arwy arwyVar = new arwy();
        a = arwyVar;
        aopi.registerDefaultInstance(arwy.class, arwyVar);
    }

    private arwy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", asev.g});
            case 3:
                return new arwy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arwy.class) {
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
