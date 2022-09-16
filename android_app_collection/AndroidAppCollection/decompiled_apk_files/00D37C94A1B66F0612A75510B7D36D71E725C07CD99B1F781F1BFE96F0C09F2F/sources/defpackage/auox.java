package defpackage;
/* compiled from: PG */
/* renamed from: auox  reason: default package */
/* loaded from: classes2.dex */
public final class auox extends aopi implements aoqv {
    public static final auox a;
    public static final aopg b;
    public static final aopg c;
    public static final aopg d;
    public static final aopg e;
    private static volatile aorb f;

    static {
        auox auoxVar = new auox();
        a = auoxVar;
        aopi.registerDefaultInstance(auox.class, auoxVar);
        b = aopi.newSingularGeneratedExtension(auoy.a, false, null, null, 307091372, aosj.BOOL, Boolean.class);
        c = aopi.newSingularGeneratedExtension(auoy.a, false, null, null, 308140915, aosj.BOOL, Boolean.class);
        d = aopi.newSingularGeneratedExtension(auoy.a, 0, null, null, 320664538, aosj.INT32, Integer.class);
        e = aopi.newSingularGeneratedExtension(auoy.a, 0, null, null, 338678567, aosj.INT32, Integer.class);
    }

    private auox() {
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
                return new auox();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auox.class) {
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
