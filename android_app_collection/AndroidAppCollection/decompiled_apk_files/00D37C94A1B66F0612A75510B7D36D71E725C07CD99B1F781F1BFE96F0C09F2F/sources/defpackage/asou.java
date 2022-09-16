package defpackage;
/* compiled from: PG */
/* renamed from: asou  reason: default package */
/* loaded from: classes2.dex */
public final class asou extends aopi implements aoqv {
    public static final asou a;
    public static final aopg b;
    public static final aopg c;
    private static volatile aorb d;

    static {
        asou asouVar = new asou();
        a = asouVar;
        aopi.registerDefaultInstance(asou.class, asouVar);
        b = aopi.newSingularGeneratedExtension(asov.a, false, null, null, 116410864, aosj.BOOL, Boolean.class);
        c = aopi.newSingularGeneratedExtension(asov.a, aspb.LIKE, null, aspb.d, 116390062, aosj.ENUM, aspb.class);
    }

    private asou() {
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
                return new asou();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asou.class) {
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
