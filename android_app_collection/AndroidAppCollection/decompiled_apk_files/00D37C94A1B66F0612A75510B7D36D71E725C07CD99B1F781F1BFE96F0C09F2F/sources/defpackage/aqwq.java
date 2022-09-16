package defpackage;
/* compiled from: PG */
/* renamed from: aqwq  reason: default package */
/* loaded from: classes2.dex */
public final class aqwq extends aopi implements aoqv {
    public static final aqwq a;
    private static volatile aorb h;
    public long b;
    public int c;
    public aqwp d;
    public aqwp e;
    public boolean f;
    public boolean g;
    private int i;

    static {
        aqwq aqwqVar = new aqwq();
        a = aqwqVar;
        aopi.registerDefaultInstance(aqwq.class, aqwqVar);
    }

    private aqwq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0000\u0003ဃ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"i", "b", "c", aqvj.o, "d", "e", "f", "g"});
            case 3:
                return new aqwq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqwq.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
