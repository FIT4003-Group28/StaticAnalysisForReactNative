package defpackage;
/* compiled from: PG */
/* renamed from: axcd */
/* loaded from: classes2.dex */
public final class axcd extends aopi implements aoqv {
    private static final axcd a;
    private static volatile aorb b;
    private int c;
    private int d;
    private aotl e;
    private int f;
    private boolean g;

    static {
        axcd axcdVar = new axcd();
        a = axcdVar;
        aopi.registerDefaultInstance(axcd.class, axcdVar);
    }

    private axcd() {
    }

    public static axcc a() {
        return (axcc) a.createBuilder();
    }

    public static /* synthetic */ axcd b() {
        return a;
    }

    public void g(int i) {
        this.c |= 1;
        this.d = i;
    }

    public void h(boolean z) {
        this.c |= 8;
        this.g = z;
    }

    public void i(aotl aotlVar) {
        aotlVar.getClass();
        this.e = aotlVar;
        this.c |= 2;
    }

    public void j(axcf axcfVar) {
        this.f = axcfVar.f;
        this.c |= 4;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", axcf.a(), "g"});
            case 3:
                return new axcd();
            case 4:
                return new axcc();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axcd.class) {
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
