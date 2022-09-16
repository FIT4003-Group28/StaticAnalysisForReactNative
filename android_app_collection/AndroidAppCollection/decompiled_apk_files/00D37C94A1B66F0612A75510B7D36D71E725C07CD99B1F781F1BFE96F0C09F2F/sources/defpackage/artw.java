package defpackage;
/* compiled from: PG */
/* renamed from: artw  reason: default package */
/* loaded from: classes2.dex */
public final class artw extends aopi implements aoqv {
    public static final artw a;
    private static volatile aorb e;
    public int b;
    public apzg c;
    private aoux f;
    private byte g = 2;
    public aoob d = aoob.b;

    static {
        artw artwVar = new artw();
        a = artwVar;
        aopi.registerDefaultInstance(artw.class, artwVar);
    }

    private artw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002", new Object[]{"b", "c", "f", "d"});
            case 3:
                return new artw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (artw.class) {
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
