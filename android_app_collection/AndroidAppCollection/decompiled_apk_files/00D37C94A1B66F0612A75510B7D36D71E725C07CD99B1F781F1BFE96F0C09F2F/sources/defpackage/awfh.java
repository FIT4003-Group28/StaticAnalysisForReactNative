package defpackage;
/* compiled from: PG */
/* renamed from: awfh  reason: default package */
/* loaded from: classes2.dex */
public final class awfh extends aopi implements aoqv {
    public static final awfh a;
    private static volatile aorb e;
    public int b;
    public float c = 1.0f;
    public awgf d;

    static {
        awfh awfhVar = new awfh();
        a = awfhVar;
        aopi.registerDefaultInstance(awfh.class, awfhVar);
    }

    private awfh() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\b\u0002\u0000\u0000\u0000\u0003ခ\u0002\bဉ\u0006", new Object[]{"b", "c", "d"});
            case 3:
                return new awfh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awfh.class) {
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
