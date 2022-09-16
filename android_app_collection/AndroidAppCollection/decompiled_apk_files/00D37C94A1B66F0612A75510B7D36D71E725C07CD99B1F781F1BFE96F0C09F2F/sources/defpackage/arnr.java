package defpackage;
/* compiled from: PG */
/* renamed from: arnr  reason: default package */
/* loaded from: classes2.dex */
public final class arnr extends aopi implements aoqv {
    public static final arnr a;
    private static volatile aorb e;
    public arpa b;
    private int f;
    private arbf g;
    private byte h = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();

    static {
        arnr arnrVar = new arnr();
        a = arnrVar;
        aopi.registerDefaultInstance(arnr.class, arnrVar);
    }

    private arnr() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0002\u0004\u0001ᐉ\u0000\u0002Л\u0005Л̉ᐉ\u0001", new Object[]{"f", "b", "c", arnh.class, "d", apzg.class, "g"});
            case 3:
                return new arnr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arnr.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
