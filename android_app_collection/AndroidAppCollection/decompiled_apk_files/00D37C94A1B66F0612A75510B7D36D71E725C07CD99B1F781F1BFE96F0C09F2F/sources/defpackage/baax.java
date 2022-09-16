package defpackage;
/* compiled from: PG */
/* renamed from: baax  reason: default package */
/* loaded from: classes2.dex */
public final class baax extends aopi implements aoqv {
    public static final baax a;
    private static volatile aorb u;
    public int b;
    public azzq c;
    public long d;
    public baai f;
    public azzw g;
    public baak h;
    public baav i;
    public baaq j;
    public azzb k;
    public baao l;
    public azzk m;
    public baaa n;
    public baah p;
    public baam q;
    public baaw r;
    public baal s;
    public azyx t;
    private baaj v;
    private byte w = 2;
    public String e = "";
    public String o = "";

    static {
        baax baaxVar = new baax();
        a = baaxVar;
        aopi.registerDefaultInstance(baax.class, baaxVar);
    }

    private baax() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001 \u0013\u0000\u0000\b\u0001ᐉ\u0000\u0002စ\u0001\u0003ဈ\u0002\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဉ\b\nᐉ\t\fဉ\u000b\u000eᐉ\r\u0010ᐉ\u000e\u0011ဈ\u000f\u0015ဉ\u0013\u0017ဉ\u0015\u001dᐉ\u0018\u001eဉ\u0019\u001fဉ\u001a ဉ\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "v", "r", "s", "t"});
            case 3:
                return new baax();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (baax.class) {
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
