package defpackage;
/* compiled from: PG */
/* renamed from: oro  reason: default package */
/* loaded from: classes4.dex */
public final class oro extends aopi implements aoqv {
    public static final oro a;
    private static volatile aorb m;
    public int b;
    public long f;
    public long h;
    public int i;
    public boolean k;
    public int l;
    public String c = "";
    public String d = "";
    public aoob e = aoob.b;
    public String g = "";
    public String j = "";

    static {
        oro oroVar = new oro();
        a = oroVar;
        aopi.registerDefaultInstance(oro.class, oroVar);
    }

    private oro() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007င\u0006\bဈ\u0007\tဇ\b\nဌ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", aqll.a()});
            case 3:
                return new oro();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (oro.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
