package defpackage;
/* compiled from: PG */
/* renamed from: apkw  reason: default package */
/* loaded from: classes.dex */
public final class apkw extends aopi implements aoqv {
    public static final apkw a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public aoob d = aoob.b;
    public long e;

    static {
        apkw apkwVar = new apkw();
        a = apkwVar;
        aopi.registerDefaultInstance(apkw.class, apkwVar);
    }

    private apkw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apkw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apkw.class) {
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
