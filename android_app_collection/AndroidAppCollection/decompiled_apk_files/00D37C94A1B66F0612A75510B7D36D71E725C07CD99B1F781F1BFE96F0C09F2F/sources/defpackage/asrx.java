package defpackage;
/* compiled from: PG */
/* renamed from: asrx  reason: default package */
/* loaded from: classes2.dex */
public final class asrx extends aopi implements aoqv {
    public static final asrx a;
    private static volatile aorb r;
    public int b;
    public apzg d;
    public long e;
    public avhn f;
    public arag g;
    public int h;
    public int i;
    public int j;
    public arag k;
    public String l;
    public arag m;
    public arag n;
    public avhn o;
    public int p;
    public int q;
    private arag s;
    private arag t;
    private aoux u;
    private aunb v;
    private byte w = 2;
    public String c = "";

    static {
        asrx asrxVar = new asrx();
        a = asrxVar;
        aopi.registerDefaultInstance(asrx.class, asrxVar);
    }

    private asrx() {
        emptyProtobufList();
        emptyProtobufList();
        this.l = "";
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u001a\u0013\u0000\u0000\u000b\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ဃ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bဈ\u000b\tᐉ\f\u000bᐉ\u000f\rᐉ\r\u000eᐉ\u0012\u000fᐉ\u0013\u0011ဋ\t\u0012ᐉ\n\u0013င\u0010\u0014င\u0011\u0016ဋ\u0007\u0017ဋ\u0006\u0018ᐉ\u0014\u001aᐉ\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "l", "m", "o", "n", "s", "t", "j", "k", "p", "q", "i", "h", "u", "v"});
            case 3:
                return new asrx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (asrx.class) {
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
