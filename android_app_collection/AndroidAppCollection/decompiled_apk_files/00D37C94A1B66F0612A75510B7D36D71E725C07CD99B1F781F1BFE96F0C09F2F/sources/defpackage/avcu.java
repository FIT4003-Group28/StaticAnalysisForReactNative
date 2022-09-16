package defpackage;
/* compiled from: PG */
/* renamed from: avcu  reason: default package */
/* loaded from: classes2.dex */
public final class avcu extends aopi implements aoqv {
    public static final avcu a;
    private static volatile aorb m;
    public int b;
    public apzg d;
    public aunb e;
    public apzg f;
    public boolean g;
    public apaj h;
    public aoyz i;
    public int k;
    public boolean l;
    private aoux n;
    private byte o = 2;
    public aopu c = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        avcu avcuVar = new avcu();
        a = avcuVar;
        aopi.registerDefaultInstance(avcu.class, avcuVar);
    }

    private avcu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0006\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ဇ\u0003\u0006ᐉ\u0004\u0007ဉ\u0005\bᐉ\u0006\tည\u0007\nဌ\b\u000bဇ\t", new Object[]{"b", "c", avcw.class, "d", "e", "f", "g", "h", "i", "n", "j", "k", avcd.c, "l"});
            case 3:
                return new avcu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (avcu.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
