package defpackage;
/* compiled from: PG */
/* renamed from: alcx  reason: default package */
/* loaded from: classes.dex */
public final class alcx extends aopi implements aoqv {
    public static final alcx a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;

    static {
        alcx alcxVar = new alcx();
        a = alcxVar;
        aopi.registerDefaultInstance(alcx.class, alcxVar);
    }

    private alcx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", avge.q, "d", avuh.l, "e", "f"});
            case 3:
                return new alcx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (alcx.class) {
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
