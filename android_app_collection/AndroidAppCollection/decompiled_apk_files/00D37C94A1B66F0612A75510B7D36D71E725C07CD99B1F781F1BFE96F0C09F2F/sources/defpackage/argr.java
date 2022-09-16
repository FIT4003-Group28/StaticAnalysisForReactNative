package defpackage;
/* compiled from: PG */
/* renamed from: argr  reason: default package */
/* loaded from: classes2.dex */
public final class argr extends aopi implements aoqv {
    public static final argr a;
    public static final aopg b;
    public static final aopg c;
    private static volatile aorb d;

    static {
        argr argrVar = new argr();
        a = argrVar;
        aopi.registerDefaultInstance(argr.class, argrVar);
        b = aopi.newSingularGeneratedExtension(argv.a, false, null, null, 177622921, aosj.BOOL, Boolean.class);
        c = aopi.newSingularGeneratedExtension(argv.a, 0, null, null, 274703452, aosj.INT32, Integer.class);
    }

    private argr() {
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
                return new argr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (argr.class) {
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
