package defpackage;
/* compiled from: PG */
/* renamed from: aubx  reason: default package */
/* loaded from: classes2.dex */
public final class aubx extends aopi implements aoqv {
    public static final aubx a;
    private static volatile aorb e;
    public String b = "";
    public int c;
    public int d;
    private int f;

    static {
        aubx aubxVar = new aubx();
        a = aubxVar;
        aopi.registerDefaultInstance(aubx.class, aubxVar);
    }

    private aubx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0002\u0004င\u0003", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new aubx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aubx.class) {
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
