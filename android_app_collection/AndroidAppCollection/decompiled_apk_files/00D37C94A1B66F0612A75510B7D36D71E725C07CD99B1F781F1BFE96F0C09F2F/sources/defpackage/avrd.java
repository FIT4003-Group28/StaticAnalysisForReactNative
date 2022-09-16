package defpackage;
/* compiled from: PG */
/* renamed from: avrd  reason: default package */
/* loaded from: classes2.dex */
public final class avrd extends aopi implements aoqv {
    public static final avrd a;
    private static volatile aorb k;
    public arag b;
    public int e;
    public apok f;
    public apok g;
    private int l;
    private aoux m;
    private arag n;
    private arag o;
    private apzg p;
    private byte q = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aoob h = aoob.b;
    public aopu i = emptyProtobufList();
    public aopu j = emptyProtobufList();

    static {
        avrd avrdVar = new avrd();
        a = avrdVar;
        aopi.registerDefaultInstance(avrd.class, avrdVar);
    }

    private avrd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0004\u000b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0006\u0005ᐉ\b\u0006Л\u0007ᐉ\u0002\bᐉ\u0003\tᐉ\u0004\nည\u0005\u000bင\u0001\fЛ\rЛ\u000eᐉ\t", new Object[]{"l", "b", "c", arag.class, "n", "o", "d", avrc.class, "f", "g", "m", "h", "e", "i", apzg.class, "j", apzg.class, "p"});
            case 3:
                return new avrd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avrd.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
