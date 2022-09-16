package defpackage;
/* compiled from: PG */
/* renamed from: aqcc  reason: default package */
/* loaded from: classes2.dex */
public final class aqcc extends aopi implements aoqv {
    public static final aqcc a;
    private static volatile aorb f;
    public aopu b = emptyProtobufList();
    public String c = "";
    public String d = "";
    public boolean e;
    private int g;

    static {
        aqcc aqccVar = new aqcc();
        a = aqccVar;
        aopi.registerDefaultInstance(aqcc.class, aqccVar);
    }

    private aqcc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0005ဇ\u0003", new Object[]{"g", "c", "b", avvn.class, "d", "e"});
            case 3:
                return new aqcc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqcc.class) {
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
