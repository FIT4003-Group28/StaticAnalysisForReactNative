package defpackage;
/* compiled from: PG */
/* renamed from: apos  reason: default package */
/* loaded from: classes2.dex */
public final class apos extends aopi implements aoqv {
    public static final apos a;
    private static volatile aorb w;
    public int b;
    public Object d;
    public boolean e;
    public boolean f;
    public arhs g;
    public arag h;
    public apor j;
    public apzg k;
    public apzg l;
    public arhs m;
    public arag n;
    public apzg p;
    public apot q;
    public aovs r;
    public aovs s;
    public boolean u;
    private aoux x;
    public int c = 0;
    private byte y = 2;
    public String i = "";
    public String o = "";
    public String t = "";
    public aoob v = aoob.b;

    static {
        apos aposVar = new apos();
        a = aposVar;
        aopi.registerDefaultInstance(apos.class, aposVar);
    }

    private apos() {
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
                return newMessageInfo(a, "\u0001\u0015\u0001\u0001\u0001\u001a\u0015\u0000\u0000\t\u0001ြ\u0000\u0003ဇ\u0003\u0004ဇ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\t\bᐉ\u000b\tᐉ\f\nᐉ\u000e\fᐉ\u0017\rည\u0018\u000eဈ\u0007\u000fဈ\r\u0010ဉ\u000f\u0011ᐉ\n\u0012ᐉ\b\u0013ဉ\u0012\u0014ဉ\u0013\u0017ြ\u0000\u0018ဈ\u0015\u001aဇ\u0016", new Object[]{"d", "c", "b", apot.class, "e", "f", "g", "h", "k", "m", "n", "p", "x", "v", "i", "o", "q", "l", "j", "r", "s", apoi.class, "t", "u"});
            case 3:
                return new apos();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (apos.class) {
                        aorbVar = w;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            w = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
