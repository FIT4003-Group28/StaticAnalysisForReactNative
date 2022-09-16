package defpackage;
/* compiled from: PG */
/* renamed from: avbs  reason: default package */
/* loaded from: classes2.dex */
public final class avbs extends aopi implements aoqv {
    public static final avbs a;
    private static volatile aorb l;
    public int b;
    public Object d;
    public aunb e;
    public arag h;
    public aunb i;
    public aunb j;
    private aoux m;
    public int c = 0;
    private byte n = 2;
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();
    public aoob k = aoob.b;

    static {
        avbs avbsVar = new avbs();
        a = avbsVar;
        aopi.registerDefaultInstance(avbs.class, avbsVar);
    }

    private avbs() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0002\t\u0001ᐼ\u0000\u0002ᐉ\u0003\u0003Л\u0004Л\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ည\b\bᐼ\u0000\tᐉ\u0004\nᐉ\u0006", new Object[]{"d", "c", "b", avhn.class, "e", "f", arag.class, "g", arag.class, "i", "m", "k", arhs.class, "h", "j"});
            case 3:
                return new avbs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avbs.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
