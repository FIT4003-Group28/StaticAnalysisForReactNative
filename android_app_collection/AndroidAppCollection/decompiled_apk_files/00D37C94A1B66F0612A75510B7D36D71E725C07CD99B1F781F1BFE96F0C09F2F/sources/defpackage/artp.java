package defpackage;
/* compiled from: PG */
/* renamed from: artp  reason: default package */
/* loaded from: classes2.dex */
public final class artp extends aopi implements aoqv {
    public static final artp a;
    private static volatile aorb f;
    public arpa b;
    public apzg c;
    private int g;
    private aoux h;
    private arbf i;
    private byte j = 2;
    public aoob d = aoob.b;
    public aopu e = emptyProtobufList();

    static {
        artp artpVar = new artp();
        a = artpVar;
        aopi.registerDefaultInstance(artp.class, artpVar);
    }

    private artp() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005Л̉ᐉ\u0005", new Object[]{"g", "b", "c", "h", "d", "e", avhn.class, "i"});
            case 3:
                return new artp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (artp.class) {
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
