package defpackage;
/* compiled from: PG */
/* renamed from: asdb  reason: default package */
/* loaded from: classes2.dex */
public final class asdb extends aopi implements aoqv {
    public static final asdb a;
    private static volatile aorb g;
    public arpa b;
    public ascy c;
    private int h;
    private aunb i;
    private aoux j;
    private byte k = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        asdb asdbVar = new asdb();
        a = asdbVar;
        aopi.registerDefaultInstance(asdb.class, asdbVar);
    }

    private asdb() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0002\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004Л\u0006ᐉ\u0004\u0007ည\u0005\tЛ\nᐉ\u0002", new Object[]{"h", "b", "c", "d", ascz.class, "j", "f", "e", apzg.class, "i"});
            case 3:
                return new asdb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asdb.class) {
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
