package defpackage;
/* compiled from: PG */
/* renamed from: atqj  reason: default package */
/* loaded from: classes2.dex */
public final class atqj extends aopi implements aoqv {
    public static final atqj a;
    private static volatile aorb f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        atqj atqjVar = new atqj();
        a = atqjVar;
        aopi.registerDefaultInstance(atqj.class, atqjVar);
    }

    private atqj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new atqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atqj.class) {
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
