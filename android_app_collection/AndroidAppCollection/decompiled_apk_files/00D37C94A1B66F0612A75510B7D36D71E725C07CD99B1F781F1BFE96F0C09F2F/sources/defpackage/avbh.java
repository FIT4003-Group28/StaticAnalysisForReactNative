package defpackage;
/* compiled from: PG */
/* renamed from: avbh  reason: default package */
/* loaded from: classes2.dex */
public final class avbh extends aopi implements aoqv {
    public static final avbh a;
    private static volatile aorb j;
    public int b;
    public int d;
    public int e;
    public argl g;
    public int h;
    private apzg k;
    private aoux l;
    private byte m = 2;
    public aopu c = emptyProtobufList();
    public aopu f = aopi.emptyProtobufList();
    public aoob i = aoob.b;

    static {
        avbh avbhVar = new avbh();
        a = avbhVar;
        aopi.registerDefaultInstance(avbh.class, avbhVar);
    }

    private avbh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0004\u0001Л\u0002င\u0000\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ည\u0007\u0007င\u0001\bဌ\u0005\t\u001a\nᐉ\u0003", new Object[]{"b", "c", avbi.class, "d", "g", "l", "i", "e", "h", atov.a, "f", "k"});
            case 3:
                return new avbh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (avbh.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
