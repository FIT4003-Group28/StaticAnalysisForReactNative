package defpackage;
/* compiled from: PG */
/* renamed from: auvb  reason: default package */
/* loaded from: classes2.dex */
public final class auvb extends aopi implements aoqv {
    public static final auvb a;
    public static final aopg b;
    private static volatile aorb f;
    public String c = "";
    public String d = "";
    public boolean e;
    private int g;

    static {
        auvb auvbVar = new auvb();
        a = auvbVar;
        aopi.registerDefaultInstance(auvb.class, auvbVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, auvbVar, auvbVar, null, 262904603, aosj.MESSAGE, auvb.class);
    }

    private auvb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003", new Object[]{"g", "c", "d", "e"});
            case 3:
                return new auvb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auvb.class) {
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
