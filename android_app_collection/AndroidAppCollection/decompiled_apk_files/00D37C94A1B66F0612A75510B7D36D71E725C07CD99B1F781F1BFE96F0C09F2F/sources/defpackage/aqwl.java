package defpackage;
/* compiled from: PG */
/* renamed from: aqwl  reason: default package */
/* loaded from: classes2.dex */
public final class aqwl extends aopi implements aoqv {
    public static final aqwl a;
    private static volatile aorb h;
    public int b;
    public boolean c;
    public aopu d = emptyProtobufList();
    public boolean e;
    public aqwm f;
    public boolean g;

    static {
        aqwl aqwlVar = new aqwl();
        a = aqwlVar;
        aopi.registerDefaultInstance(aqwl.class, aqwlVar);
    }

    private aqwl() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0004ဇ\u0002\u0006ဉ\u0004\nဇ\b", new Object[]{"b", "c", "d", aqwn.class, "e", "f", "g"});
            case 3:
                return new aqwl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqwl.class) {
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
