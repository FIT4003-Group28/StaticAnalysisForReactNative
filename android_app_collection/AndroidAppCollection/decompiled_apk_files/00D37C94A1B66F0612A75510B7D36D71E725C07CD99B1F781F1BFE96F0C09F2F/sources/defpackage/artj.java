package defpackage;
/* compiled from: PG */
/* renamed from: artj  reason: default package */
/* loaded from: classes2.dex */
public final class artj extends aopi implements aoqv {
    public static final artj a;
    private static volatile aorb f;
    public Object c;
    public arpa d;
    public aoob e;
    private int g;
    private aoux h;
    private arbf i;
    public int b = 0;
    private byte j = 2;

    static {
        artj artjVar = new artj();
        a = artjVar;
        aopi.registerDefaultInstance(artj.class, artjVar);
    }

    private artj() {
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        this.e = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001̉\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐉ\u0005\u0005ည\u0006\u0006ᐼ\u0000̉ᐉ\u0007", new Object[]{"c", "b", "g", "d", aunb.class, aqvm.class, "h", "e", apzg.class, "i"});
            case 3:
                return new artj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (artj.class) {
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
