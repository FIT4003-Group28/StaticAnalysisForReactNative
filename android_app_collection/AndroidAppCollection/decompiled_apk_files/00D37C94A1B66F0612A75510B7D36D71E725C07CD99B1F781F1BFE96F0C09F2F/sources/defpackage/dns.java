package defpackage;
/* compiled from: PG */
/* renamed from: dns  reason: default package */
/* loaded from: classes3.dex */
public final class dns extends aopi implements aoqv {
    public static final dns a;
    private static volatile aorb d;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dns dnsVar = new dns();
        a = dnsVar;
        aopi.registerDefaultInstance(dns.class, dnsVar);
    }

    private dns() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0006ဈ\u0005", new Object[]{"e", "b", "c"});
            case 3:
                return new dns();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (dns.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
