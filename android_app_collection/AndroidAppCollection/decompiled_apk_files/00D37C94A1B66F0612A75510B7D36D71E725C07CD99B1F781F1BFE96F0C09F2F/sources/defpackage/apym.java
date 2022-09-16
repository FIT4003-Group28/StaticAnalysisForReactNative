package defpackage;
/* compiled from: PG */
/* renamed from: apym  reason: default package */
/* loaded from: classes2.dex */
public final class apym extends aopi implements aoqv {
    public static final apym a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public String d = "";
    public long e;
    public long f;

    static {
        apym apymVar = new apym();
        a = apymVar;
        aopi.registerDefaultInstance(apym.class, apymVar);
    }

    private apym() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apym();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apym.class) {
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
