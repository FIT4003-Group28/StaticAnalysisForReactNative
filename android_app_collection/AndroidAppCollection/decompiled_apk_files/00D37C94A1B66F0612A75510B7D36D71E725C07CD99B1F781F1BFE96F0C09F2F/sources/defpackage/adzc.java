package defpackage;
/* compiled from: PG */
/* renamed from: adzc  reason: default package */
/* loaded from: classes.dex */
public final class adzc extends aopi implements aoqv {
    public static final adzc a;
    private static volatile aorb f;
    public int b;
    public boolean d;
    public aoqp e = aoqp.a;
    public String c = "";

    static {
        adzc adzcVar = new adzc();
        a = adzcVar;
        aopi.registerDefaultInstance(adzc.class, adzcVar);
    }

    private adzc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u00032", new Object[]{"b", "c", "d", "e", adzb.a});
            case 3:
                return new adzc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (adzc.class) {
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
