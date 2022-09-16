package defpackage;
/* compiled from: PG */
/* renamed from: avgf  reason: default package */
/* loaded from: classes2.dex */
public final class avgf extends aopi implements aoqv {
    public static final avgf a;
    private static volatile aorb f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        avgf avgfVar = new avgf();
        a = avgfVar;
        aopi.registerDefaultInstance(avgf.class, avgfVar);
    }

    private avgf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", avge.a, "d", avge.b, "e"});
            case 3:
                return new avgf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avgf.class) {
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
