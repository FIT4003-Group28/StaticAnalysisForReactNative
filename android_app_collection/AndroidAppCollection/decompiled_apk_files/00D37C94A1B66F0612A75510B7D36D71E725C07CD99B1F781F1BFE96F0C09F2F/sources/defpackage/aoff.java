package defpackage;
/* compiled from: PG */
/* renamed from: aoff  reason: default package */
/* loaded from: classes.dex */
public final class aoff extends aopi implements aoqv {
    public static final aoff a;
    private static volatile aorb f;
    public aofx b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        aoff aoffVar = new aoff();
        a = aoffVar;
        aopi.registerDefaultInstance(aoff.class, aoffVar);
    }

    private aoff() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aoff();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aoff.class) {
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
