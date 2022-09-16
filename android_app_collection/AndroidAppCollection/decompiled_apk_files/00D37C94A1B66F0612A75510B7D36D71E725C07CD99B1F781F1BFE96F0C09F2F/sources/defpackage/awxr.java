package defpackage;
/* compiled from: PG */
/* renamed from: awxr  reason: default package */
/* loaded from: classes2.dex */
public final class awxr extends aopi implements aoqv {
    public static final awxr a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        awxr awxrVar = new awxr();
        a = awxrVar;
        aopi.registerDefaultInstance(awxr.class, awxrVar);
    }

    private awxr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"c", "b", awxm.class, awxp.class, awxq.class, awxt.class, awxo.class});
            case 3:
                return new awxr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awxr.class) {
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
