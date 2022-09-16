package defpackage;
/* compiled from: PG */
/* renamed from: asbc  reason: default package */
/* loaded from: classes2.dex */
public final class asbc extends aopi implements aoqv {
    public static final asbc a;
    private static volatile aorb d;
    public arpa b;
    private int e;
    private aoux f;
    private arbf g;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        asbc asbcVar = new asbc();
        a = asbcVar;
        aopi.registerDefaultInstance(asbc.class, asbcVar);
    }

    private asbc() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0004ᐉ\u0001̉ᐉ\u0003", new Object[]{"e", "b", "c", asbd.class, "f", "g"});
            case 3:
                return new asbc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asbc.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
