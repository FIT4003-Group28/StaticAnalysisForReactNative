package defpackage;
/* compiled from: PG */
/* renamed from: avdq  reason: default package */
/* loaded from: classes2.dex */
public final class avdq extends aopi implements aoqv {
    public static final avdq a;
    private static volatile aorb p;
    public int b;
    public avds c;
    public arag f;
    public apzg g;
    public apok h;
    public apok i;
    public int m;
    public avdt n;
    public int o;
    private arag q;
    private apzg r;
    private aoux s;
    private byte t = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aopu j = emptyProtobufList();
    public aoob k = aoob.b;
    public aopu l = emptyProtobufList();

    static {
        avdq avdqVar = new avdq();
        a = avdqVar;
        aopi.registerDefaultInstance(avdq.class, avdqVar);
    }

    private avdq() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0004\n\u0001ᐉ\u0001\u0002Л\u0003ᐉ\t\u0004ည\n\u0005ᐉ\u0002\u0006ᐉ\u0003\tဌ\r\nЛ\u000bဉ\u0000\rᐉ\u0006\u000fᐉ\u0004\u0010ᐉ\u0005\u0011ဉ\u000e\u0012င\u000f\u0013Л\u0014\u001b", new Object[]{"b", "f", "j", avdr.class, "s", "k", "q", "g", "m", avcd.j, "d", avdo.class, "c", "r", "h", "i", "n", "o", "e", apzg.class, "l", avcz.class});
            case 3:
                return new avdq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (avdq.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
