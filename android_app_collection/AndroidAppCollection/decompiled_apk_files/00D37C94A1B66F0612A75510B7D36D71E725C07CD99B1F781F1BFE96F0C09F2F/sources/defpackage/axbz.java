package defpackage;
/* compiled from: PG */
/* renamed from: axbz  reason: default package */
/* loaded from: classes2.dex */
public final class axbz extends aopi implements aoqv {
    public static final axbz a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        axbz axbzVar = new axbz();
        a = axbzVar;
        aopi.registerDefaultInstance(axbz.class, axbzVar);
    }

    private axbz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0002\u0003င\u0003\u0004ဈ\u0001", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new axbz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (axbz.class) {
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
