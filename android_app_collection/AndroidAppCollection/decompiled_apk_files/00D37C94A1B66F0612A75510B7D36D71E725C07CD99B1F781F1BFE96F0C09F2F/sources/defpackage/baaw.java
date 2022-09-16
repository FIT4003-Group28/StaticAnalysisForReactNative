package defpackage;
/* compiled from: PG */
/* renamed from: baaw  reason: default package */
/* loaded from: classes2.dex */
public final class baaw extends aopi implements aoqv {
    public static final baaw a;
    private static volatile aorb e;
    public int b;
    public long c;
    public int d;

    static {
        baaw baawVar = new baaw();
        a = baawVar;
        aopi.registerDefaultInstance(baaw.class, baawVar);
    }

    private baaw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", baat.c});
            case 3:
                return new baaw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (baaw.class) {
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
