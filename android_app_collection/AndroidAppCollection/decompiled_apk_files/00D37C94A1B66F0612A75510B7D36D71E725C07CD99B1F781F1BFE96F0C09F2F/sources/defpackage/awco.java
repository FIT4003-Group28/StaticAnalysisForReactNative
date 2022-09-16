package defpackage;
/* compiled from: PG */
/* renamed from: awco  reason: default package */
/* loaded from: classes2.dex */
public final class awco extends aopi implements aoqv {
    public static final awco a;
    public static final aopg b;
    public static final aopg c;
    private static volatile aorb d;

    static {
        awco awcoVar = new awco();
        a = awcoVar;
        aopi.registerDefaultInstance(awco.class, awcoVar);
        b = aopi.newSingularGeneratedExtension(awda.a, 0, null, null, 162410900, aosj.INT32, Integer.class);
        c = aopi.newSingularGeneratedExtension(awda.a, false, null, null, 162000138, aosj.BOOL, Boolean.class);
    }

    private awco() {
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
                return new awco();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awco.class) {
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
