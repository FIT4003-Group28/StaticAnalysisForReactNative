package defpackage;
/* compiled from: PG */
/* renamed from: asth  reason: default package */
/* loaded from: classes2.dex */
public final class asth extends aopi implements aoqv {
    public static final asth a;
    private static volatile aorb g;
    public int b;
    public asti c;
    public int d;
    public int e;
    public aopu f = emptyProtobufList();

    static {
        asth asthVar = new asth();
        a = asthVar;
        aopi.registerDefaultInstance(asth.class, asthVar);
    }

    private asth() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004\u001b", new Object[]{"b", "c", "d", asnz.q, "e", asnz.q, "f", astg.class});
            case 3:
                return new asth();
            case 4:
                return new astf();
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asth.class) {
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
