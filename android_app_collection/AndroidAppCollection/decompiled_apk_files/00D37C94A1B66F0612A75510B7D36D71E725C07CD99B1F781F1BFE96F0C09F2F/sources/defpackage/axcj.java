package defpackage;
/* compiled from: PG */
/* renamed from: axcj */
/* loaded from: classes2.dex */
public final class axcj extends aopi implements aoqv {
    private static final axcj a;
    private static volatile aorb b;
    private int c;
    private String d = "";
    private float e;

    static {
        axcj axcjVar = new axcj();
        a = axcjVar;
        aopi.registerDefaultInstance(axcj.class, axcjVar);
    }

    private axcj() {
    }

    public static axci a() {
        return (axci) a.createBuilder();
    }

    public static /* synthetic */ axcj b() {
        return a;
    }

    public void e(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    public void f(float f) {
        this.c |= 2;
        this.e = f;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new axcj();
            case 4:
                return new axci();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (axcj.class) {
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
