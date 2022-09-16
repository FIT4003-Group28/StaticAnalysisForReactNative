package defpackage;
/* compiled from: PG */
/* renamed from: arsj  reason: default package */
/* loaded from: classes2.dex */
public final class arsj extends aopi implements aoqv {
    public static final arsj a;
    private static volatile aorb e;
    public arpa b;
    public arsh c;
    private int f;
    private aoux g;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        arsj arsjVar = new arsj();
        a = arsjVar;
        aopi.registerDefaultInstance(arsj.class, arsjVar);
    }

    private arsj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003", new Object[]{"f", "b", "c", "g", "d"});
            case 3:
                return new arsj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arsj.class) {
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
