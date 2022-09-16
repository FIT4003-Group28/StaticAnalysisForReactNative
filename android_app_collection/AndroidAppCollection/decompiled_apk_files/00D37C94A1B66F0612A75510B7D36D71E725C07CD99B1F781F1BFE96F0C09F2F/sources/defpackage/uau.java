package defpackage;
/* compiled from: PG */
/* renamed from: uau  reason: default package */
/* loaded from: classes4.dex */
public final class uau extends aopi implements aoqv {
    public static final uau a;
    private static volatile aorb f;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    private int g;

    static {
        uau uauVar = new uau();
        a = uauVar;
        aopi.registerDefaultInstance(uau.class, uauVar);
    }

    private uau() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new uau();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (uau.class) {
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
