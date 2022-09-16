package defpackage;
/* compiled from: PG */
/* renamed from: awbb  reason: default package */
/* loaded from: classes2.dex */
public final class awbb extends aopi implements aoqv {
    public static final awbb a;
    private static volatile aorb f;
    public int b;
    public awba c;
    public avxl d;
    public aqss e;

    static {
        awbb awbbVar = new awbb();
        a = awbbVar;
        aopi.registerDefaultInstance(awbb.class, awbbVar);
    }

    private awbb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new awbb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awbb.class) {
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
