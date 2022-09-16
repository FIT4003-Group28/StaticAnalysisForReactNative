package defpackage;
/* compiled from: PG */
/* renamed from: aphx  reason: default package */
/* loaded from: classes.dex */
public final class aphx extends aopi implements aoqv {
    public static final aphx a;
    public static final aopg b;
    private static volatile aorb e;
    public arln c;
    public String d = "";
    private int f;

    static {
        aphx aphxVar = new aphx();
        a = aphxVar;
        aopi.registerDefaultInstance(aphx.class, aphxVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aphxVar, aphxVar, null, 303917309, aosj.MESSAGE, aphx.class);
    }

    private aphx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new aphx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aphx.class) {
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
