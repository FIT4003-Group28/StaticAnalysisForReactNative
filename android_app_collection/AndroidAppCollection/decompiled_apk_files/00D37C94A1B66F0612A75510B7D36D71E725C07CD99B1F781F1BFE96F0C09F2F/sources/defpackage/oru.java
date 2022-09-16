package defpackage;
/* compiled from: PG */
/* renamed from: oru  reason: default package */
/* loaded from: classes4.dex */
public final class oru extends aopi implements aoqv {
    public static final oru a;
    private static volatile aorb f;
    public int b;
    public long d;
    public String c = "";
    public aoob e = aoob.b;

    static {
        oru oruVar = new oru();
        a = oruVar;
        aopi.registerDefaultInstance(oru.class, oruVar);
    }

    private oru() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new oru();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (oru.class) {
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
