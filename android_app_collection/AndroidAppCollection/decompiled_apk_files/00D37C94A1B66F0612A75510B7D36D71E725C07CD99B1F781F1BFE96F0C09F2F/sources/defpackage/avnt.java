package defpackage;
/* compiled from: PG */
/* renamed from: avnt  reason: default package */
/* loaded from: classes2.dex */
public final class avnt extends aopi implements aoqv {
    public static final avnt a;
    private static volatile aorb l;
    public int b;
    public avhn c;
    public arag e;
    public arag f;
    public apok g;
    public arag h;
    public arag i;
    public apok j;
    public apok k;
    private aoux m;
    private byte n = 2;
    public aopu d = emptyProtobufList();

    static {
        avnt avntVar = new avnt();
        a = avntVar;
        aopi.registerDefaultInstance(avnt.class, avntVar);
    }

    private avnt() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b", new Object[]{"b", "c", "d", avhn.class, "e", "f", "g", "h", "i", "j", "k", "m"});
            case 3:
                return new avnt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avnt.class) {
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
