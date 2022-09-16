package defpackage;
/* compiled from: PG */
/* renamed from: axba  reason: default package */
/* loaded from: classes2.dex */
public final class axba extends aopi implements aoqv {
    public static final axba a;
    private static volatile aorb g;
    public int b;
    public awzs c;
    public String d = "";
    public String e = "";
    public axaz f;

    static {
        axba axbaVar = new axba();
        a = axbaVar;
        aopi.registerDefaultInstance(axba.class, axbaVar);
    }

    private axba() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new axba();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (axba.class) {
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
