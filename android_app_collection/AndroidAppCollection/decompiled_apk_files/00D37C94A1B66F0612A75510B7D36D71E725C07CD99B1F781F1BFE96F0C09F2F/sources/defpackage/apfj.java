package defpackage;
/* compiled from: PG */
/* renamed from: apfj  reason: default package */
/* loaded from: classes.dex */
public final class apfj extends aopi implements aoqv {
    public static final apfj a;
    private static volatile aorb d;
    public boolean b;
    public int c;
    private int e;

    static {
        apfj apfjVar = new apfj();
        a = apfjVar;
        aopi.registerDefaultInstance(apfj.class, apfjVar);
    }

    private apfj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဌ\u0002", new Object[]{"e", "b", "c", apfa.f});
            case 3:
                return new apfj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apfj.class) {
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
