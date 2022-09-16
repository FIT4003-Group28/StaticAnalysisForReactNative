package defpackage;
/* compiled from: PG */
/* renamed from: aokb  reason: default package */
/* loaded from: classes.dex */
public final class aokb extends aopi implements aoqv {
    public static final aokb a;
    private static volatile aorb f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        aokb aokbVar = new aokb();
        a = aokbVar;
        aopi.registerDefaultInstance(aokb.class, aokbVar);
    }

    private aokb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", aoix.q, "d", "e", aoix.r});
            case 3:
                return new aokb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aokb.class) {
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
