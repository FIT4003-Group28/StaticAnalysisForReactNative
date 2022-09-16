package defpackage;
/* compiled from: PG */
/* renamed from: avbl  reason: default package */
/* loaded from: classes2.dex */
public final class avbl extends aopi implements aoqv {
    public static final avbl a;
    private static volatile aorb l;
    public int b;
    public arag f;
    public arhs g;
    public apok h;
    public apok i;
    public avbk j;
    public aovs k;
    private aoux m;
    private byte n = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        avbl avblVar = new avbl();
        a = avblVar;
        aopi.registerDefaultInstance(avbl.class, avblVar);
    }

    private avbl() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0002\b\u0001Л\u0002Л\u0003ᐉ\u0001\u0004ည\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဉ\b\fᐉ\u0007", new Object[]{"b", "c", avbm.class, "d", avbn.class, "m", "e", "f", "g", "h", "i", "k", "j"});
            case 3:
                return new avbl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avbl.class) {
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
