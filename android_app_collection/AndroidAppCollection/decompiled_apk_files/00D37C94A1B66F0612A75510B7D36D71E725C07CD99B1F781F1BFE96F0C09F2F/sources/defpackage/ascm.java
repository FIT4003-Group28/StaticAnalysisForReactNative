package defpackage;
/* compiled from: PG */
/* renamed from: ascm  reason: default package */
/* loaded from: classes2.dex */
public final class ascm extends aopi implements aoqv {
    public static final ascm a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public asck e;
    private arbf g;
    private byte h = 2;
    public aopu d = emptyProtobufList();

    static {
        ascm ascmVar = new ascm();
        a = ascmVar;
        aopi.registerDefaultInstance(ascm.class, ascmVar);
    }

    private ascm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0003Л\u0005ᐉ\u0002̉ᐉ\u0003", new Object[]{"b", "c", "d", apzg.class, "e", "g"});
            case 3:
                return new ascm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ascm.class) {
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
