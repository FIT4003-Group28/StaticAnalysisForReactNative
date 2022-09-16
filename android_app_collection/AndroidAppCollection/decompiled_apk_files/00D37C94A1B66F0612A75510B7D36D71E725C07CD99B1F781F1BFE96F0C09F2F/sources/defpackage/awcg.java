package defpackage;
/* compiled from: PG */
/* renamed from: awcg  reason: default package */
/* loaded from: classes2.dex */
public final class awcg extends aopi implements aoqv {
    public static final awcg a;
    private static volatile aorb e;
    public awch b;
    public aoob c = aoob.b;
    public boolean d;
    private int f;

    static {
        awcg awcgVar = new awcg();
        a = awcgVar;
        aopi.registerDefaultInstance(awcg.class, awcgVar);
    }

    private awcg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new awcg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awcg.class) {
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
