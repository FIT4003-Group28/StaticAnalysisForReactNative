package defpackage;
/* compiled from: PG */
/* renamed from: awiy  reason: default package */
/* loaded from: classes2.dex */
public final class awiy extends aopi implements aoqv {
    public static final awiy a;
    public static final aopg b;
    public static final aopg c;
    public static final aopg d;
    private static volatile aorb e;

    static {
        awiy awiyVar = new awiy();
        a = awiyVar;
        aopi.registerDefaultInstance(awiy.class, awiyVar);
        b = aopi.newSingularGeneratedExtension(awix.a, false, null, null, 1000, aosj.BOOL, Boolean.class);
        c = aopi.newSingularGeneratedExtension(awix.a, 0L, null, null, 1001, aosj.INT64, Long.class);
        d = aopi.newSingularGeneratedExtension(awix.a, "", null, null, 1002, aosj.STRING, String.class);
    }

    private awiy() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new awiy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awiy.class) {
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
