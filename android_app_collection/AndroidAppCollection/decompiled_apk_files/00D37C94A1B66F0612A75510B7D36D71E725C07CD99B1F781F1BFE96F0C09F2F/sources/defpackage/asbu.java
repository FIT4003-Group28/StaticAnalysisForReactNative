package defpackage;
/* compiled from: PG */
/* renamed from: asbu  reason: default package */
/* loaded from: classes2.dex */
public final class asbu extends aopi implements aoqv {
    public static final asbu a;
    private static volatile aorb e;
    public arpa b;
    private int f;
    private aunb g;
    private aoux h;
    private arbf i;
    private byte j = 2;
    public aopu c = emptyProtobufList();
    public aoob d = aoob.b;

    static {
        asbu asbuVar = new asbu();
        a = asbuVar;
        aopi.registerDefaultInstance(asbu.class, asbuVar);
    }

    private asbu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0001̉ᐉ\u0004", new Object[]{"f", "b", "c", ascb.class, "h", "d", "g", "i"});
            case 3:
                return new asbu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asbu.class) {
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
