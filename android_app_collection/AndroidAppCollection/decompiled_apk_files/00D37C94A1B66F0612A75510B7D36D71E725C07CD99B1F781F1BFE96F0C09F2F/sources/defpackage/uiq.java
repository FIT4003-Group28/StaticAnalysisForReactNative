package defpackage;
/* compiled from: PG */
/* renamed from: uiq  reason: default package */
/* loaded from: classes4.dex */
public final class uiq extends aopi implements aoqv {
    public static final uiq a;
    private static volatile aorb g;
    public int b;
    public aomr d;
    public int e;
    public aopu c = emptyProtobufList();
    public String f = "";

    static {
        uiq uiqVar = new uiq();
        a = uiqVar;
        aopi.registerDefaultInstance(uiq.class, uiqVar);
    }

    private uiq() {
    }

    public final void a() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0002\u0004ဌ\u0001", new Object[]{"b", "c", aolq.class, "d", "f", "e", aoix.r});
            case 3:
                return new uiq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (uiq.class) {
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
