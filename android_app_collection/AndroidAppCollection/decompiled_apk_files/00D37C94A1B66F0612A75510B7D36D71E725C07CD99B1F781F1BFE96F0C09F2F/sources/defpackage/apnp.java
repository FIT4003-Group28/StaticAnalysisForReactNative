package defpackage;
/* compiled from: PG */
/* renamed from: apnp  reason: default package */
/* loaded from: classes.dex */
public final class apnp extends aopi implements aoqv {
    public static final apnp a;
    private static volatile aorb f;
    public apno b;
    public apno c;
    public apno d;
    public apno e;
    private int g;

    static {
        apnp apnpVar = new apnp();
        a = apnpVar;
        aopi.registerDefaultInstance(apnp.class, apnpVar);
    }

    private apnp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new apnp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apnp.class) {
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
