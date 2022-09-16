package defpackage;
/* compiled from: PG */
/* renamed from: awcp  reason: default package */
/* loaded from: classes2.dex */
public final class awcp extends aopi implements aoqv {
    public static final awcp a;
    public static final aopg b;
    public static final aopg c;
    private static volatile aorb d;

    static {
        awcp awcpVar = new awcp();
        a = awcpVar;
        aopi.registerDefaultInstance(awcp.class, awcpVar);
        b = aopi.newSingularGeneratedExtension(awdu.a, 0, null, null, 153514762, aosj.INT32, Integer.class);
        c = aopi.newSingularGeneratedExtension(awdu.a, false, null, null, 167027722, aosj.BOOL, Boolean.class);
    }

    private awcp() {
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
                return new awcp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awcp.class) {
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
