package defpackage;
/* compiled from: PG */
/* renamed from: asrw  reason: default package */
/* loaded from: classes2.dex */
public final class asrw extends aopi implements aoqv {
    public static final asrw a;
    private static volatile aorb s;
    public int b;
    public Object d;
    public long f;
    public arag h;
    public avhn i;
    public aqjv j;
    public arag k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public apzg q;
    public aunb r;
    private arag t;
    private arag u;
    private arag v;
    private aunb w;
    private aunb x;
    private aoux y;
    private asrv z;
    public int c = 0;
    private byte A = 2;
    public String e = "";
    public String g = "";

    static {
        asrw asrwVar = new asrw();
        a = asrwVar;
        aopi.registerDefaultInstance(asrw.class, asrwVar);
    }

    private asrw() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0018\u0001\u0001\u0001\u001f\u0018\u0000\u0000\u000f\u0001ဈ\u0000\u0002ဃ\u0001\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0007\u0006်\u0000\u0007ᐼ\u0000\bᐼ\u0000\tဋ\t\nဋ\n\u000bဋ\u000b\fဋ\f\rဈ\u0003\u000eဋ\b\u000fᐉ\u0013\u0012ᐉ\u0011\u0013ᐉ\u0012\u0016ᐉ\u0002\u0017ᐉ\u0017\u0018ᐉ\u0018\u001cᐉ\u001a\u001dᐉ\u0015\u001eᐉ\u0016\u001fᐉ\u0006", new Object[]{"d", "c", "b", "e", "f", "h", "i", "k", arag.class, asru.class, "m", "n", "o", "p", "g", "l", "q", "u", "v", "t", "r", "y", "z", "w", "x", "j"});
            case 3:
                return new asrw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (asrw.class) {
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
