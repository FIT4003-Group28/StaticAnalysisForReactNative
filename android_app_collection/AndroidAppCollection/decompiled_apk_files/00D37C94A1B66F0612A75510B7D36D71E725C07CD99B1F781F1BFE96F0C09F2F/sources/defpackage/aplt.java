package defpackage;
/* compiled from: PG */
/* renamed from: aplt  reason: default package */
/* loaded from: classes.dex */
public final class aplt extends aopi implements aoqv {
    public static final aplt a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        aplt apltVar = new aplt();
        a = apltVar;
        aopi.registerDefaultInstance(aplt.class, apltVar);
    }

    private aplt() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aplt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aplt.class) {
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
