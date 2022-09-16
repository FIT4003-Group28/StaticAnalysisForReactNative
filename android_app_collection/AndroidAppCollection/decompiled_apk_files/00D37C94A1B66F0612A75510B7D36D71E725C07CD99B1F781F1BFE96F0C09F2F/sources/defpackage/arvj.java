package defpackage;
/* compiled from: PG */
/* renamed from: arvj  reason: default package */
/* loaded from: classes2.dex */
public final class arvj extends aopi implements aoqv {
    public static final arvj a;
    private static volatile aorb e;
    public arpa b;
    public aopu c;
    public apzg d;
    private int f;
    private byte g = 2;

    static {
        arvj arvjVar = new arvj();
        a = arvjVar;
        aopi.registerDefaultInstance(arvj.class, arvjVar);
    }

    private arvj() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0004Л\u0005ᐉ\u0001", new Object[]{"f", "b", "c", apzg.class, "d"});
            case 3:
                return new arvj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arvj.class) {
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
