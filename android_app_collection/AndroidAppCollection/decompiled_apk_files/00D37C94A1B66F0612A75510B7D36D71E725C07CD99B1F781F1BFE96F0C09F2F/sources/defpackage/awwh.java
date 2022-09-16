package defpackage;
/* compiled from: PG */
/* renamed from: awwh  reason: default package */
/* loaded from: classes2.dex */
public final class awwh extends aopi implements aoqv {
    public static final awwh a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        awwh awwhVar = new awwh();
        a = awwhVar;
        aopi.registerDefaultInstance(awwh.class, awwhVar);
    }

    private awwh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", awwf.class, awwg.class});
            case 3:
                return new awwh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awwh.class) {
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
