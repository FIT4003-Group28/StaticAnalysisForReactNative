package defpackage;
/* compiled from: PG */
/* renamed from: amkh  reason: default package */
/* loaded from: classes.dex */
public final class amkh extends aopi implements aoqv {
    public static final amkh a;
    private static volatile aorb g;
    public int b;
    public long e;
    public long c = -1;
    public aopu d = emptyProtobufList();
    public aopq f = emptyIntList();

    static {
        amkh amkhVar = new amkh();
        a = amkhVar;
        aopi.registerDefaultInstance(amkh.class, amkhVar);
    }

    private amkh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", amkg.class, "e", "f"});
            case 3:
                return new amkh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (amkh.class) {
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
