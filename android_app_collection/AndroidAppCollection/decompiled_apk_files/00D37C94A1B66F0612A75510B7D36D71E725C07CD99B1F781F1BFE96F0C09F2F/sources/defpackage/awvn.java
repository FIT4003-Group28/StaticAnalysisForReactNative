package defpackage;
/* compiled from: PG */
/* renamed from: awvn  reason: default package */
/* loaded from: classes2.dex */
public final class awvn extends aopi implements aoqv {
    public static final awvn a;
    private static volatile aorb e;
    public int b;
    public boolean c;
    public aorw d;

    static {
        awvn awvnVar = new awvn();
        a = awvnVar;
        aopi.registerDefaultInstance(awvn.class, awvnVar);
    }

    private awvn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new awvn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awvn.class) {
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
