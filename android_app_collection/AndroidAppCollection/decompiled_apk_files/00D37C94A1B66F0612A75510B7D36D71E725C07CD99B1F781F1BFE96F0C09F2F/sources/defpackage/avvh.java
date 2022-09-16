package defpackage;
/* compiled from: PG */
/* renamed from: avvh  reason: default package */
/* loaded from: classes2.dex */
public final class avvh extends aopi implements aoqv {
    public static final avvh a;
    private static volatile aorb n;
    public int b;
    public avhn c;
    public avhn d;
    public arag e;
    public arag f;
    public apok g;
    public apok h;
    public boolean k;
    public avvi l;
    private aoux o;
    private apzg p;
    private arag q;
    private apzg r;
    private arag s;
    private atpw t;
    private byte u = 2;
    public aoob i = aoob.b;
    public aopu j = emptyProtobufList();
    public aopu m = emptyProtobufList();

    static {
        avvh avvhVar = new avvh();
        a = avvhVar;
        aopi.registerDefaultInstance(avvh.class, avvhVar);
    }

    private avvh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0004\u001a\u0011\u0000\u0002\r\u0004ᐉ\u000f\u0005ᐉ\u0010\u0006ᐉ\u0011\u0007ᐉ\u0007\bည\b\tᐉ\u0001\nᐉ\u0000\u000bᐉ\u0003\fᐉ\u0004\rᐉ\t\u000eᐉ\u0005\u000fᐉ\u0006\u0010Л\u0011ဇ\n\u0013ဉ\u0012\u0014ᐉ\u0013\u001a\u001b", new Object[]{"b", "q", "r", "s", "o", "i", "d", "c", "e", "f", "p", "g", "h", "j", apzg.class, "k", "l", "t", "m", apwb.class});
            case 3:
                return new avvh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (avvh.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
