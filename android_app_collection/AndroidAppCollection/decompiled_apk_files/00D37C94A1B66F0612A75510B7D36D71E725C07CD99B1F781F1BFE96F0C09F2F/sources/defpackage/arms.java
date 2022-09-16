package defpackage;
/* compiled from: PG */
/* renamed from: arms  reason: default package */
/* loaded from: classes2.dex */
public final class arms extends aopi implements aoqv {
    public static final arms a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public apzg d;
    public aoxo e;
    public armr f;
    private arbf i;
    private byte j = 2;
    public aopu g = emptyProtobufList();

    static {
        arms armsVar = new arms();
        a = armsVar;
        aopi.registerDefaultInstance(arms.class, armsVar);
    }

    private arms() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006Л̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", apzg.class, "i"});
            case 3:
                return new arms();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arms.class) {
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
