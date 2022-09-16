package defpackage;
/* compiled from: PG */
/* renamed from: atut  reason: default package */
/* loaded from: classes2.dex */
public final class atut extends aopi implements aoqv {
    public static final atut a;
    private static volatile aorb g;
    public arpa b;
    public atuu c;
    public auna d;
    public apzg e;
    private int h;
    private aoux i;
    private arbf j;
    private byte k = 2;
    public aoob f = aoob.b;

    static {
        atut atutVar = new atut();
        a = atutVar;
        aopi.registerDefaultInstance(atut.class, atutVar);
    }

    private atut() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ည\u0005\u0006ᐉ\u0003̉ᐉ\u0006", new Object[]{"h", "b", "c", "d", "i", "f", "e", "j"});
            case 3:
                return new atut();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atut.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
