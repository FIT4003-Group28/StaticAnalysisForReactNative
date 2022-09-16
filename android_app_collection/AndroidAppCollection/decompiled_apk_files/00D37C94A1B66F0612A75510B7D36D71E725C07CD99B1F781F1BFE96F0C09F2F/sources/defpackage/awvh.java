package defpackage;
/* compiled from: PG */
/* renamed from: awvh  reason: default package */
/* loaded from: classes2.dex */
public final class awvh extends aopi implements aoqv {
    public static final awvh a;
    private static volatile aorb f;
    public int b;
    public int c;
    public aoqp d = aoqp.a;
    public aoqp e = aoqp.a;

    static {
        awvh awvhVar = new awvh();
        a = awvhVar;
        aopi.registerDefaultInstance(awvh.class, awvhVar);
    }

    private awvh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u0001င\u0000\u00022\u00032", new Object[]{"b", "c", "d", awvf.a, "e", awvg.a});
            case 3:
                return new awvh();
            case 4:
                return new aopa((int[][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awvh.class) {
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
