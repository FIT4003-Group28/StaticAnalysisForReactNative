package defpackage;
/* compiled from: PG */
/* renamed from: axbk  reason: default package */
/* loaded from: classes2.dex */
public final class axbk extends aopi implements aoqv {
    public static final axbk a;
    private static volatile aorb g;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;
    public boolean f;

    static {
        axbk axbkVar = new axbk();
        a = axbkVar;
        aopi.registerDefaultInstance(axbk.class, axbkVar);
    }

    private axbk() {
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
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဇ\f\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bဇ\r\fြ\u0000\rြ\u0000\u000eြ\u0000", new Object[]{"d", "c", "b", axca.class, axby.class, axba.class, awzy.class, "e", awzu.class, axcg.class, axcb.class, axab.class, axck.class, "f", axac.class, axay.class, axah.class});
            case 3:
                return new axbk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (axbk.class) {
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
