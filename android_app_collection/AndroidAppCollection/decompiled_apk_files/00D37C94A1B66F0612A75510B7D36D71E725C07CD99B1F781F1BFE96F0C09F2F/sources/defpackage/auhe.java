package defpackage;
/* compiled from: PG */
/* renamed from: auhe  reason: default package */
/* loaded from: classes2.dex */
public final class auhe extends aopi implements aoqv {
    public static final auhe a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public String d = "";

    static {
        auhe auheVar = new auhe();
        a = auheVar;
        aopi.registerDefaultInstance(auhe.class, auheVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, auheVar, auheVar, null, 314223858, aosj.MESSAGE, auhe.class);
    }

    private auhe() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case 3:
                return new auhe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auhe.class) {
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
