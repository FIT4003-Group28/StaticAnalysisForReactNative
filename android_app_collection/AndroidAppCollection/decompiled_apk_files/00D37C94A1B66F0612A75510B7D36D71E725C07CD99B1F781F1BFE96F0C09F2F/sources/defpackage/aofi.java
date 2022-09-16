package defpackage;
/* compiled from: PG */
/* renamed from: aofi  reason: default package */
/* loaded from: classes.dex */
public final class aofi extends aopi implements aoqv {
    public static final aofi a;
    private static volatile aorb e;
    public aofz c;
    public String b = "";
    public String d = "";

    static {
        aofi aofiVar = new aofi();
        a = aofiVar;
        aopi.registerDefaultInstance(aofi.class, aofiVar);
    }

    private aofi() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ", new Object[]{"b", "c", "d"});
            case 3:
                return new aofi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aofi.class) {
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
