package defpackage;
/* compiled from: PG */
/* renamed from: apoy  reason: default package */
/* loaded from: classes2.dex */
public final class apoy extends aopi implements aoqv {
    public static final apoy a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        apoy apoyVar = new apoy();
        a = apoyVar;
        aopi.registerDefaultInstance(apoy.class, apoyVar);
    }

    private apoy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uec16㡿\uf20f㺁\u0002\u0000\u0000\u0000\uec16㡿ြ\u0000\uf20f㺁ြ\u0000", new Object[]{"c", "b", apmy.class, asos.class});
            case 3:
                return new apoy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apoy.class) {
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
