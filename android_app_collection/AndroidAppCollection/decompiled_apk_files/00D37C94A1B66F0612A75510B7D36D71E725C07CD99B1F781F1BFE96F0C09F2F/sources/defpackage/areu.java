package defpackage;
/* compiled from: PG */
/* renamed from: areu  reason: default package */
/* loaded from: classes2.dex */
public final class areu extends aopd implements aope {
    public static final areu a;
    private static volatile aorb r;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public arag g;
    public arag h;
    public apzg i;
    public ates m;
    public asxo n;
    public aozy o;
    public aret p;
    private arag s;
    private apzg t;
    private aoux u;
    private byte v = 2;
    public aoob j = aoob.b;
    public aopu k = aopi.emptyProtobufList();
    public String q = "";

    static {
        areu areuVar = new areu();
        a = areuVar;
        aopi.registerDefaultInstance(areu.class, areuVar);
    }

    private areu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0016\u0011\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bည\n\fᐉ\u000b\r\u001a\u000eᐉ\f\u0011ᐉ\u0011\u0012ᐉ\u0012\u0014ဉ\r\u0015ᐉ\u0010\u0016ဈ\u0013", new Object[]{"b", "c", "d", "s", "e", "f", "g", "h", "i", "j", "t", "k", "m", "u", "p", "n", "o", "q"});
            case 3:
                return new areu();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (areu.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
