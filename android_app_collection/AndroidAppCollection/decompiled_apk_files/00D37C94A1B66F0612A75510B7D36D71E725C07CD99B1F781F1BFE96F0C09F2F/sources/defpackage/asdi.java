package defpackage;
/* compiled from: PG */
/* renamed from: asdi  reason: default package */
/* loaded from: classes2.dex */
public final class asdi extends aopi implements aoqv {
    public static final asdi a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public long g;
    private aoux i;
    private arbf j;
    private byte k = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        asdi asdiVar = new asdi();
        a = asdiVar;
        aopi.registerDefaultInstance(asdi.class, asdiVar);
    }

    private asdi() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0002\u0004\u0001ᐉ\u0000\u0003\u001b\u0005Л\u0006ᐉ\u0001\u0007ည\u0002\bဂ\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", aswg.class, "e", apzg.class, "i", "f", "g", "j"});
            case 3:
                return new asdi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asdi.class) {
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
