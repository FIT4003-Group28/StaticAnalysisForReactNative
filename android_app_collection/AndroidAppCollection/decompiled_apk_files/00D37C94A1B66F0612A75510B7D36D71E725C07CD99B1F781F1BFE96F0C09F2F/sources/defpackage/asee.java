package defpackage;
/* compiled from: PG */
/* renamed from: asee  reason: default package */
/* loaded from: classes2.dex */
public final class asee extends aopi implements aoqv {
    public static final asee a;
    private static volatile aorb e;
    public arpa b;
    private int f;
    private aoux g;
    private byte h = 2;
    public aopu c = emptyProtobufList();
    public aoob d = aoob.b;

    static {
        asee aseeVar = new asee();
        a = aseeVar;
        aopi.registerDefaultInstance(asee.class, aseeVar);
    }

    private asee() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0005ᐉ\u0001\u0006ည\u0002", new Object[]{"f", "b", "c", apzg.class, "g", "d"});
            case 3:
                return new asee();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asee.class) {
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
