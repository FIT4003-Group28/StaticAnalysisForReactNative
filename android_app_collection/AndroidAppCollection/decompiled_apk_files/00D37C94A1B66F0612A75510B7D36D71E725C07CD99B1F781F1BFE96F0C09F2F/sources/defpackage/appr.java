package defpackage;
/* compiled from: PG */
/* renamed from: appr  reason: default package */
/* loaded from: classes2.dex */
public final class appr extends aopi implements aoqv {
    public static final appr a;
    private static volatile aorb e;
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        appr apprVar = new appr();
        a = apprVar;
        aopi.registerDefaultInstance(appr.class, apprVar);
    }

    private appr() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new appr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (appr.class) {
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
