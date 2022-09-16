package defpackage;
/* compiled from: PG */
/* renamed from: dpn  reason: default package */
/* loaded from: classes3.dex */
public final class dpn extends aopi implements aoqv {
    public static final dpn a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public boolean f;
    public int c = 0;
    public String e = "";

    static {
        dpn dpnVar = new dpn();
        a = dpnVar;
        aopi.registerDefaultInstance(dpn.class, dpnVar);
    }

    private dpn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003ဇ\u0001\u0004ြ\u0000\u0006ဈ\u0000", new Object[]{"d", "c", "b", "f", dpp.class, "e"});
            case 3:
                return new dpn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (dpn.class) {
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
