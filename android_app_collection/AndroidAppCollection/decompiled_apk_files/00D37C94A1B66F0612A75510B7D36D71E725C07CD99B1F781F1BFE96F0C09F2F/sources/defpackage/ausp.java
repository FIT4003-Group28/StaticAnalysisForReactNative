package defpackage;
/* compiled from: PG */
/* renamed from: ausp  reason: default package */
/* loaded from: classes2.dex */
public final class ausp extends aopi implements aoqv {
    public static final ausp a;
    private static volatile aorb g;
    public int b;
    public int e;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        ausp auspVar = new ausp();
        a = auspVar;
        aopi.registerDefaultInstance(ausp.class, auspVar);
    }

    private ausp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", ausr.a(), "f"});
            case 3:
                return new ausp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (ausp.class) {
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
