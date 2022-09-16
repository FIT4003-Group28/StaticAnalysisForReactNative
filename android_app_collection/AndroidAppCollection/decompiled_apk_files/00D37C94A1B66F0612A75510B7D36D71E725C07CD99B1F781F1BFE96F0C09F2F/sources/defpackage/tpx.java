package defpackage;
/* compiled from: PG */
/* renamed from: tpx  reason: default package */
/* loaded from: classes4.dex */
public final class tpx extends aopi implements aoqv {
    public static final tpx a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        tpx tpxVar = new tpx();
        a = tpxVar;
        aopi.registerDefaultInstance(tpx.class, tpxVar);
    }

    private tpx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", sml.j, "d", sml.i});
            case 3:
                return new tpx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (tpx.class) {
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
