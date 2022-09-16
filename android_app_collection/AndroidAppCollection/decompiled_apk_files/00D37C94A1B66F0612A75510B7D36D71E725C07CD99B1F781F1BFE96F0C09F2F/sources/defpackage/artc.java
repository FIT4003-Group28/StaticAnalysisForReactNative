package defpackage;
/* compiled from: PG */
/* renamed from: artc  reason: default package */
/* loaded from: classes2.dex */
public final class artc extends aopi implements aoqv {
    public static final artc a;
    private static volatile aorb e;
    public arpa b;
    public apzg c;
    private int f;
    private aoux g;
    private arbf h;
    private byte i = 2;
    public aoob d = aoob.b;

    static {
        artc artcVar = new artc();
        a = artcVar;
        aopi.registerDefaultInstance(artc.class, artcVar);
    }

    private artc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003̉ᐉ\u0004", new Object[]{"f", "b", "c", "g", "d", "h"});
            case 3:
                return new artc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (artc.class) {
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
