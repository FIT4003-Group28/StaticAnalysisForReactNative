package defpackage;
/* compiled from: PG */
/* renamed from: arav  reason: default package */
/* loaded from: classes2.dex */
public final class arav extends aopi implements aoqv {
    public static final arav a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public boolean f;
    public int c = 0;
    public String e = "";

    static {
        arav aravVar = new arav();
        a = aravVar;
        aopi.registerDefaultInstance(arav.class, aravVar);
    }

    private arav() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003ဇ\u0001\u0004ြ\u0000\u0006ဈ\u0000", new Object[]{"d", "c", "b", "f", araw.class, "e"});
            case 3:
                return new arav();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arav.class) {
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
