package defpackage;
/* compiled from: PG */
/* renamed from: artf  reason: default package */
/* loaded from: classes2.dex */
public final class artf extends aopi implements aoqv {
    public static final artf a;
    private static volatile aorb f;
    public arpa b;
    public artd c;
    public avyp d;
    private int g;
    private aoux h;
    private aunb i;
    private byte j = 2;
    public aoob e = aoob.b;

    static {
        artf artfVar = new artf();
        a = artfVar;
        aopi.registerDefaultInstance(artf.class, artfVar);
    }

    private artf() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0006", new Object[]{"g", "b", "c", "d", "h", "e", "i"});
            case 3:
                return new artf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (artf.class) {
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
