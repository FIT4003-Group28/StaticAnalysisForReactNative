package defpackage;
/* compiled from: PG */
/* renamed from: arjw  reason: default package */
/* loaded from: classes2.dex */
public final class arjw extends aopi implements aoqv {
    public static final arjw a;
    private static volatile aorb t;
    public int b;
    public avhn c;
    public aunb e;
    public arag f;
    public arju g;
    public apzg i;
    public apzg j;
    public asxq l;
    public avxe m;
    public aunb n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    private aoxw u;
    private arjv v;
    private aoux w;
    private apzg x;
    private byte y = 2;
    public aopu d = emptyProtobufList();
    public aoob h = aoob.b;
    public String k = "";

    static {
        arjw arjwVar = new arjw();
        a = arjwVar;
        aopi.registerDefaultInstance(arjw.class, arjwVar);
    }

    private arjw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0001\f\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ည\u0007\u0006ᐉ\b\u0007ဈ\n\bᐉ\t\tᐉ\u000b\fЛ\rဉ\u000e\u000fᐉ\u0003\u0010ဉ\u0010\u0011ᐉ\u0011\u0012ဌ\u0012\u0013ဌ\u0013\u0014ဌ\u0014\u0015ᐉ\u0002\u0016ᐉ\u0000\u0017ဌ\u0015\u0018ဌ\u0016", new Object[]{"b", "c", "f", "g", "w", "h", "i", "k", "j", "x", "d", avhc.class, "l", "e", "m", "n", "o", arjz.a(), "p", arjm.a(), "q", arjo.a(), "v", "u", "r", arjy.a(), "s", arfp.s});
            case 3:
                return new arjw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (arjw.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
