package defpackage;
/* compiled from: PG */
/* renamed from: arrb  reason: default package */
/* loaded from: classes2.dex */
public final class arrb extends aopi implements aoqv {
    public static final arrb a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public aqtm d;
    public asaa f;
    public aqtv g;
    private aoux i;
    private aqtu j;
    private byte k = 2;
    public aoob e = aoob.b;

    static {
        arrb arrbVar = new arrb();
        a = arrbVar;
        aopi.registerDefaultInstance(arrb.class, arrbVar);
    }

    private arrb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003\u0006ᐉ\u0004\u0007ဉ\u0006\nᐉ\u0005", new Object[]{"b", "c", "d", "i", "e", "j", "g", "f"});
            case 3:
                return new arrb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arrb.class) {
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
