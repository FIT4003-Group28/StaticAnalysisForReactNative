package defpackage;
/* compiled from: PG */
/* renamed from: auzu  reason: default package */
/* loaded from: classes2.dex */
public final class auzu extends aopi implements aoqv {
    public static final auzu a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public int d;
    public String e = "";

    static {
        auzu auzuVar = new auzu();
        a = auzuVar;
        aopi.registerDefaultInstance(auzu.class, auzuVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, auzuVar, auzuVar, null, 355549603, aosj.MESSAGE, auzu.class);
    }

    private auzu() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", auwh.n, "e"});
            case 3:
                return new auzu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auzu.class) {
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
