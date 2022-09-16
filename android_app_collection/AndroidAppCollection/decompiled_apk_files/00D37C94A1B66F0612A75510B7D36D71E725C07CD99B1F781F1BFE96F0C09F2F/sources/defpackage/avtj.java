package defpackage;
/* compiled from: PG */
/* renamed from: avtj  reason: default package */
/* loaded from: classes2.dex */
public final class avtj extends aopi implements aoqv {
    public static final avtj a;
    public static final aopg b;
    private static volatile aorb f;
    public String c = "";
    public int d = 1;
    public String e = "";
    private int g;

    static {
        avtj avtjVar = new avtj();
        a = avtjVar;
        aopi.registerDefaultInstance(avtj.class, avtjVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, avtjVar, avtjVar, null, 387863284, aosj.MESSAGE, avtj.class);
    }

    private avtj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"g", "c", "d", aupm.p, "e"});
            case 3:
                return new avtj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avtj.class) {
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
