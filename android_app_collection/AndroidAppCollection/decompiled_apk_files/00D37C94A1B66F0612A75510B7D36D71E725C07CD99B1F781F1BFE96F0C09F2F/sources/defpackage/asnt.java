package defpackage;
/* compiled from: PG */
/* renamed from: asnt  reason: default package */
/* loaded from: classes2.dex */
public final class asnt extends aopi implements aoqv {
    public static final asnt a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        asnt asntVar = new asnt();
        a = asntVar;
        aopi.registerDefaultInstance(asnt.class, asntVar);
    }

    private asnt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", asev.t, "f", asev.t});
            case 3:
                return new asnt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asnt.class) {
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
