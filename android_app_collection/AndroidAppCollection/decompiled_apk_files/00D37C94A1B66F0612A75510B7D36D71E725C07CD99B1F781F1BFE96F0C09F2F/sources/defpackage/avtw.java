package defpackage;
/* compiled from: PG */
/* renamed from: avtw  reason: default package */
/* loaded from: classes2.dex */
public final class avtw extends aopi implements aoqv {
    public static final avtw a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        avtw avtwVar = new avtw();
        a = avtwVar;
        aopi.registerDefaultInstance(avtw.class, avtwVar);
    }

    private avtw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", avge.t, "e", avge.s});
            case 3:
                return new avtw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avtw.class) {
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
