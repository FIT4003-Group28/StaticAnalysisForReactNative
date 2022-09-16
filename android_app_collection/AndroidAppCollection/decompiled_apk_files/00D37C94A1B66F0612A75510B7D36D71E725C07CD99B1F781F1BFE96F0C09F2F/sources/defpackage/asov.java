package defpackage;
/* compiled from: PG */
/* renamed from: asov  reason: default package */
/* loaded from: classes2.dex */
public final class asov extends aopd implements aope {
    public static final asov a;
    private static volatile aorb q;
    public int b;
    public aspc c;
    public int d;
    public int e;
    public arag f;
    public arag g;
    public arag h;
    public int i;
    public arag j;
    public arag k;
    public arag m;
    public boolean o;
    private arag r;
    private arag s;
    private aoux t;
    private apzg u;
    private apzg v;
    private byte w = 2;
    public aoob n = aoob.b;
    public aopu p = emptyProtobufList();

    static {
        asov asovVar = new asov();
        a = asovVar;
        aopi.registerDefaultInstance(asov.class, asovVar);
    }

    private asov() {
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\f\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007င\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bည\f\rဇ\r\u000eᐉ\u000e\u000fЛ\u0010ᐉ\u000f\u0011ᐉ\u0010\u0013ᐉ\u0006\u0014ᐉ\u000b", new Object[]{"b", "c", "d", aspb.a(), "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "t", "p", apzg.class, "u", "v", "r", "s"});
            case 3:
                return new asov();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (asov.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
