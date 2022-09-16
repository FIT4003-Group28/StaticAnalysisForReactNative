package defpackage;
/* compiled from: PG */
/* renamed from: arnw  reason: default package */
/* loaded from: classes2.dex */
public final class arnw extends aopi implements aoqv {
    public static final arnw a;
    private static volatile aorb i;
    public int b;
    public arpa c;
    public arnx d;
    public boolean e;
    public aufb f;
    public arnh h;
    private arbf j;
    private byte k = 2;
    public aopu g = emptyProtobufList();

    static {
        arnw arnwVar = new arnw();
        a = arnwVar;
        aopi.registerDefaultInstance(arnw.class, arnwVar);
    }

    private arnw() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0003\u0006Л\u0007ᐉ\u0004\bဇ\u0002̉ᐉ\u0005", new Object[]{"b", "c", "d", "f", "g", apzg.class, "h", "e", "j"});
            case 3:
                return new arnw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arnw.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
