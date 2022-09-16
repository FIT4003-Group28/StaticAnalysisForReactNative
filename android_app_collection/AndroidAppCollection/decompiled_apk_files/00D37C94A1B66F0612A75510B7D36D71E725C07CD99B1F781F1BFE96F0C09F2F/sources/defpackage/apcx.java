package defpackage;
/* compiled from: PG */
/* renamed from: apcx  reason: default package */
/* loaded from: classes.dex */
public final class apcx extends aopi implements aoqv {
    public static final apcx a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();

    static {
        apcx apcxVar = new apcx();
        a = apcxVar;
        aopi.registerDefaultInstance(apcx.class, apcxVar);
    }

    private apcx() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", apdi.class, "e", apdi.class, "f", apdi.class});
            case 3:
                return new apcx();
            case 4:
                return new aopa((short[]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apcx.class) {
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
