package defpackage;
/* compiled from: PG */
/* renamed from: avjp  reason: default package */
/* loaded from: classes2.dex */
public final class avjp extends aopi implements aoqv {
    public static final avjp a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public arag d;
    public apok f;
    public apok g;
    public aoob i;
    public boolean j;
    public int k;
    public boolean l;
    private aoux n;
    private byte o = 2;
    public aopu e = emptyProtobufList();
    public aopu h = emptyProtobufList();

    static {
        avjp avjpVar = new avjp();
        a = avjpVar;
        aopi.registerDefaultInstance(avjp.class, avjpVar);
    }

    private avjp() {
        emptyProtobufList();
        this.i = aoob.b;
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0001\bЛ\nဇ\u0006\u000bင\u0007\fဇ\b", new Object[]{"b", "c", "e", avjm.class, "f", "g", "n", "i", "d", "h", avjn.class, "j", "k", "l"});
            case 3:
                return new avjp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (avjp.class) {
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
