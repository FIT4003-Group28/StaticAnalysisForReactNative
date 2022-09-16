package defpackage;
/* compiled from: PG */
/* renamed from: asvl  reason: default package */
/* loaded from: classes2.dex */
public final class asvl extends aopi implements aoqv {
    public static final asvl a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        asvl asvlVar = new asvl();
        a = asvlVar;
        aopi.registerDefaultInstance(asvl.class, asvlVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, asvlVar, asvlVar, null, 260591906, aosj.MESSAGE, asvl.class);
    }

    private asvl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new asvl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asvl.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
