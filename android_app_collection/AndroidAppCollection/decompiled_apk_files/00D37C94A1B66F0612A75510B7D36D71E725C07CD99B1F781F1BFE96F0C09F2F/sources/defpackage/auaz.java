package defpackage;
/* compiled from: PG */
/* renamed from: auaz  reason: default package */
/* loaded from: classes2.dex */
public final class auaz extends aopi implements aoqv {
    public static final auaz a;
    private static volatile aorb r;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public arag f;
    public auaw g;
    public auax h;
    public aubc i;
    public avhn j;
    public int l;
    public boolean m;
    public boolean o;
    private arag s;
    private arag t;
    private apzg u;
    private auaw v;
    private aplw w;
    private arag x;
    private arag y;
    private aoux z;
    private byte A = 2;
    public aopu k = emptyProtobufList();
    public aopu n = emptyProtobufList();
    public String p = "";
    public aoob q = aoob.b;

    static {
        auaz auazVar = new auaz();
        a = auazVar;
        aopi.registerDefaultInstance(auaz.class, auazVar);
    }

    private auaz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.A = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0002\u0012\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\n\bင\f\tᐉ\u0005\nᐉ\t\u000bᐉ\u0016\fည\u0017\rᐉ\u000b\u000fᐉ\u0007\u0010Л\u0011ᐉ\u000e\u0012ဇ\u000f\u0013Л\u0014ဇ\u0010\u0015ဈ\u0013\u0016ᐉ\u0003\u0017ᐉ\u0014\u001aᐉ\u0015", new Object[]{"b", "c", "d", "e", "s", "t", "u", "j", "l", "g", "i", "z", "q", "v", "h", "k", avhc.class, "w", "m", "n", aunb.class, "o", "p", "f", "x", "y"});
            case 3:
                return new auaz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (auaz.class) {
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
