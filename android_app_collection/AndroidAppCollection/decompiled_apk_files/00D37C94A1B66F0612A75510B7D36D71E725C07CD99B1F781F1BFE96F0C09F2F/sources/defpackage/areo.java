package defpackage;
/* compiled from: PG */
/* renamed from: areo  reason: default package */
/* loaded from: classes2.dex */
public final class areo extends aopi implements aoqv {
    public static final areo a;
    private static volatile aorb m;
    public int b;
    public avhn c;
    public arag e;
    public int f;
    public arag g;
    public arag h;
    public arag i;
    public apzg j;
    public ates k;
    private apzg n;
    private apok o;
    private aoux p;
    private byte q = 2;
    public aopu d = emptyProtobufList();
    public aoob l = aoob.b;

    static {
        areo areoVar = new areo();
        a = areoVar;
        aopi.registerDefaultInstance(areo.class, areoVar);
    }

    private areo() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u000e\r\u0000\u0001\u000b\u0002ᐉ\u0001\u0003Л\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\fည\f\rင\u0003\u000eᐉ\n", new Object[]{"b", "c", "d", avhc.class, "e", "g", "h", "i", "j", "n", "k", "p", "l", "f", "o"});
            case 3:
                return new areo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (areo.class) {
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
