package defpackage;
/* compiled from: PG */
/* renamed from: ashr  reason: default package */
/* loaded from: classes2.dex */
public final class ashr extends aopi implements aoqv {
    public static final ashr a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public ashh d;
    public ashu e;
    private aoux i;
    private arbf j;
    private byte k = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        ashr ashrVar = new ashr();
        a = ashrVar;
        aopi.registerDefaultInstance(ashr.class, ashrVar);
    }

    private ashr() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ည\u0003\u0005ᐉ\u0002\u0006Л\u0007ᐉ\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", "g", "e", "f", apzg.class, "i", "j"});
            case 3:
                return new ashr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (ashr.class) {
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
