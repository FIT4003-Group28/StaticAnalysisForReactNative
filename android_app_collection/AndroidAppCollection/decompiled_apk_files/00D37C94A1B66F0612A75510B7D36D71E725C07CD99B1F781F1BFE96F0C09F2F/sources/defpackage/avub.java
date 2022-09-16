package defpackage;
/* compiled from: PG */
/* renamed from: avub  reason: default package */
/* loaded from: classes2.dex */
public final class avub extends aopi implements aoqv {
    public static final avub a;
    private static volatile aorb f;
    public int b;
    public avtw c;
    public int d;
    public int e;

    static {
        avub avubVar = new avub();
        a = avubVar;
        aopi.registerDefaultInstance(avub.class, avubVar);
    }

    private avub() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဌ\u0003", new Object[]{"b", "c", "d", avuo.a(), "e", avuh.i});
            case 3:
                return new avub();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avub.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
