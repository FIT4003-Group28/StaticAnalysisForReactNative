package defpackage;
/* compiled from: PG */
/* renamed from: awbs  reason: default package */
/* loaded from: classes2.dex */
public final class awbs extends aopi implements aoqv {
    public static final awbs a;
    private static volatile aorb i;
    public int b;
    public int d;
    public int f;
    public awbs g;
    public apxg h;
    public aoob c = aoob.b;
    public int e = -1;

    static {
        awbs awbsVar = new awbs();
        a = awbsVar;
        aopi.registerDefaultInstance(awbs.class, awbsVar);
    }

    private awbs() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003င\u0002\u0006င\u0003\u0007ဉ\u0004\bဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new awbs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awbs.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
