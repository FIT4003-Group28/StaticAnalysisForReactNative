package defpackage;
/* compiled from: PG */
/* renamed from: apqu  reason: default package */
/* loaded from: classes2.dex */
public final class apqu extends aopi implements aoqv {
    public static final apqu a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public aopu d;
    public arag e;
    public arag f;
    public arag g;
    private arag i;
    private arag j;
    private arag k;
    private apqw l;
    private arag m;
    private apqz n;
    private apqx o;
    private apqy p;
    private apqt q;
    private apzg r;
    private apqv s;
    private apzg t;
    private byte u = 2;

    static {
        apqu apquVar = new apqu();
        a = apquVar;
        aopi.registerDefaultInstance(apqu.class, apquVar);
    }

    private apqu() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u001e\u0011\u0000\u0001\u0011\u0001ᐉ\u0002\u0002Л\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\n\u0007ᐉ\u000b\bᐉ\f\tᐉ\r\nᐉ\u000e\fᐉ\u000f\u0012ᐉ\u0014\u0013ᐉ\u0000\u0015ᐉ\u0005\u0016ᐉ\u0006\u0018ᐉ\u0003\u001cᐉ\t\u001eᐉ\u0015", new Object[]{"b", "c", "d", apqo.class, "e", "f", "g", "n", "o", "p", "q", "r", "s", "i", "k", "l", "j", "m", "t"});
            case 3:
                return new apqu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apqu.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
