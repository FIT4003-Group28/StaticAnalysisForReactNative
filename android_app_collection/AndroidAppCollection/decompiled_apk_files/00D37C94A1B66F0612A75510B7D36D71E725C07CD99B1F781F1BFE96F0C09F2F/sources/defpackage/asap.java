package defpackage;
/* compiled from: PG */
/* renamed from: asap  reason: default package */
/* loaded from: classes2.dex */
public final class asap extends aopi implements aoqv {
    public static final asap a;
    private static volatile aorb o;
    public int b;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String l;
    public avhn m;
    public String n;
    private byte p = 2;
    public String c = "";
    public String d = "";

    static {
        asap asapVar = new asap();
        a = asapVar;
        aopi.registerDefaultInstance(asap.class, asapVar);
    }

    private asap() {
        aopi.emptyProtobufList();
        this.l = "";
        this.n = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001*\f\u0000\u0000\u0001\u0001ဈ\u0000\u000fဈ\u0001\u0010ဃ\u0002\u0011ဇ\u0003\u0013ဈ\r\u0018ဇ\t\u0019ᐉ\u0012\u001bဇ\u0007\u001dင\f!ဈ\u0016'ဌ\u000b*ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "l", "i", "m", "h", "k", "n", "j", ataz.a(), "g"});
            case 3:
                return new asap();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (asap.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
