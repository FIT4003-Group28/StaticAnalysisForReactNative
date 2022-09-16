package defpackage;
/* compiled from: PG */
/* renamed from: alcs  reason: default package */
/* loaded from: classes.dex */
public final class alcs extends aopi implements aoqv {
    public static final alcs a;
    private static volatile aorb l;
    public double b;
    public int c;
    public int d;
    public boolean e;
    public int f = 1;
    public int g = 1;
    public int h = 1;
    public double i;
    public int j;
    public int k;
    private int m;

    static {
        alcs alcsVar = new alcs();
        a = alcsVar;
        aopi.registerDefaultInstance(alcs.class, alcsVar);
    }

    private alcs() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bက\u0007\tဌ\b\nင\t", new Object[]{"m", "b", "c", "d", "e", "f", arpt.u, "g", arpt.t, "h", arpt.t, "i", "j", asev.b, "k"});
            case 3:
                return new alcs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (alcs.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
