package defpackage;
/* compiled from: PG */
/* renamed from: aujm  reason: default package */
/* loaded from: classes2.dex */
public final class aujm extends aopi implements aoqv {
    public static final aujm a;
    private static volatile aorb s;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public avhn g;
    public arag h;
    public apzg i;
    public aujk j;
    public apzg k;
    public ates n;
    public aoob o;
    public aozy p;
    public int q;
    public String r;
    private arag t;
    private arag u;
    private aujl v;
    private aoux w;
    private aplw x;
    private byte y = 2;
    public aopu l = aopi.emptyProtobufList();
    public aopu m = aopi.emptyProtobufList();

    static {
        aujm aujmVar = new aujm();
        a = aujmVar;
        aopi.registerDefaultInstance(aujm.class, aujmVar);
    }

    private aujm() {
        emptyProtobufList();
        this.o = aoob.b;
        emptyProtobufList();
        this.r = "";
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0002\u001f\u0015\u0000\u0002\u0010\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\t\nᐉ\n\u000b\u001a\f\u001a\rᐉ\r\u000fᐉ\u0010\u0010ည\u0011\u0012ᐉ\u000b\u0013ᐉ\f\u0014ᐉ\b\u0019ᐉ\u0013\u001bဌ\u0015\u001dဈ\u0017\u001fᐉ\u0019", new Object[]{"b", "c", "d", "e", "f", "t", "g", "h", "i", "j", "l", "m", "v", "w", "o", "k", "n", "u", "p", "q", aoxm.c, "r", "x"});
            case 3:
                return new aujm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (aujm.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
