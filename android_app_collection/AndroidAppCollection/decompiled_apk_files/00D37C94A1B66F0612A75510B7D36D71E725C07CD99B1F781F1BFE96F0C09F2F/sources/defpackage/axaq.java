package defpackage;
/* compiled from: PG */
/* renamed from: axaq */
/* loaded from: classes2.dex */
public final class axaq extends aopi implements aoqv {
    private static final axaq a;
    private static volatile aorb b;
    private int c;
    private boolean d;

    static {
        axaq axaqVar = new axaq();
        a = axaqVar;
        aopi.registerDefaultInstance(axaq.class, axaqVar);
    }

    private axaq() {
    }

    public static axap a() {
        return (axap) a.createBuilder();
    }

    public static /* synthetic */ axaq b() {
        return a;
    }

    public void d(boolean z) {
        this.c |= 1;
        this.d = z;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case 3:
                return new axaq();
            case 4:
                return new axap();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axaq.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
