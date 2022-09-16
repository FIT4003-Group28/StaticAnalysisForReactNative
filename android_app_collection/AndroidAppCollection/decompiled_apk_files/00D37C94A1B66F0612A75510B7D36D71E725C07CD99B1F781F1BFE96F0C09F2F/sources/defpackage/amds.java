package defpackage;
/* compiled from: PG */
/* renamed from: amds  reason: default package */
/* loaded from: classes.dex */
public final class amds extends aopi implements aoqv {
    public static final amds a;
    private static volatile aorb f;
    public int b;
    public int c;
    public ambp d;
    public int e;
    private byte g = 2;

    static {
        amds amdsVar = new amds();
        a = amdsVar;
        aopi.registerDefaultInstance(amds.class, amdsVar);
    }

    private amds() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e", adzd.l});
            case 3:
                return new amds();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (amds.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
