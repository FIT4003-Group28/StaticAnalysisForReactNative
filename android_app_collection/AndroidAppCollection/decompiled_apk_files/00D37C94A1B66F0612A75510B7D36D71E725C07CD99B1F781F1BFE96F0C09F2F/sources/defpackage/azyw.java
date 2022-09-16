package defpackage;
/* compiled from: PG */
/* renamed from: azyw  reason: default package */
/* loaded from: classes2.dex */
public final class azyw extends aopi implements aoqv {
    public static final azyw a;
    private static volatile aorb k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public boolean j;

    static {
        azyw azywVar = new azyw();
        a = azywVar;
        aopi.registerDefaultInstance(azyw.class, azywVar);
    }

    private azyw() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"b", "c", "d", axce.i, "e", "f", axce.h, "g", "h", "i", "j"});
            case 3:
                return new azyw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (azyw.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
