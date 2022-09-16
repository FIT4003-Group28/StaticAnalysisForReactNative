package defpackage;
/* compiled from: PG */
/* renamed from: awmm  reason: default package */
/* loaded from: classes2.dex */
public final class awmm extends aopi implements aoqv {
    public static final awmm a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public awoj d;
    public int e;

    static {
        awmm awmmVar = new awmm();
        a = awmmVar;
        aopi.registerDefaultInstance(awmm.class, awmmVar);
        b = aopi.newSingularGeneratedExtension(awon.a, awmmVar, awmmVar, null, 198239242, aosj.MESSAGE, awmm.class);
    }

    private awmm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new awmm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awmm.class) {
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
