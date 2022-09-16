package defpackage;
/* compiled from: PG */
/* renamed from: apxd  reason: default package */
/* loaded from: classes2.dex */
public final class apxd extends aopi implements aoqv {
    public static final apxd a;
    private static volatile aorb m;
    public int b;
    public double c;
    public int d;
    public int e;
    public boolean f;
    public int g = 1;
    public int h = 1;
    public int i = 1;
    public double j;
    public int k;
    public int l;

    static {
        apxd apxdVar = new apxd();
        a = apxdVar;
        aopi.registerDefaultInstance(apxd.class, apxdVar);
    }

    private apxd() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bက\u0007\tဌ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", arpt.u, "h", arpt.t, "i", arpt.t, "j", "k", asev.b, "l"});
            case 3:
                return new apxd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (apxd.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
