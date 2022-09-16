package defpackage;
/* compiled from: PG */
/* renamed from: awwr  reason: default package */
/* loaded from: classes2.dex */
public final class awwr extends aopi implements aoqv {
    public static final awwr a;
    private static volatile aorb f;
    public int b;
    public float c;
    public float d;
    public float e;

    static {
        awwr awwrVar = new awwr();
        a = awwrVar;
        aopi.registerDefaultInstance(awwr.class, awwrVar);
    }

    private awwr() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new awwr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awwr.class) {
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
