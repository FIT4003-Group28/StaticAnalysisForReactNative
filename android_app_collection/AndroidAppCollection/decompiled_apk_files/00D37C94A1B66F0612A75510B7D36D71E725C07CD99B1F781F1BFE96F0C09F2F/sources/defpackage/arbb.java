package defpackage;
/* compiled from: PG */
/* renamed from: arbb  reason: default package */
/* loaded from: classes2.dex */
public final class arbb extends aopi implements aoqv {
    public static final arbb a;
    private static volatile aorb u;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public arag g;
    public boolean h;
    public apzg i;
    public arag j;
    public arag l;
    public aunb m;
    public aunb n;
    public apzg p;
    public aunb r;
    public aunb s;
    public int t;
    private aoux v;
    private byte w = 2;
    public aopu k = emptyProtobufList();
    public aoob o = aoob.b;
    public String q = "";

    static {
        arbb arbbVar = new arbb();
        a = arbbVar;
        aopi.registerDefaultInstance(arbb.class, arbbVar);
    }

    private arbb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ᐉ\b\u0005ᐉ\n\u0006ᐉ\u000b\u0007ည\f\bᐉ\u0002\tᐉ\u0003\nᐉ\u0007\u000bᐉ\t\fᐉ\r\rᐉ\u0004\u000eဇ\u0005\u000fဈ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ဌ\u0011\u0013ᐉ\u0006", new Object[]{"b", "c", "d", "k", aunb.class, "l", "n", "v", "o", "e", "f", "j", "m", "p", "g", "h", "q", "r", "s", "t", aqyp.o, "i"});
            case 3:
                return new arbb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (arbb.class) {
                        aorbVar = u;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            u = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
