package defpackage;
/* compiled from: PG */
/* renamed from: ashp  reason: default package */
/* loaded from: classes2.dex */
public final class ashp extends aopi implements aoqv {
    public static final ashp a;
    private static volatile aorb t;
    public int b;
    public Object d;
    public Object f;
    public arpa g;
    public ashu k;
    public boolean o;
    public apzg p;
    public apzg r;
    public int s;
    private apzg u;
    private apzg v;
    private arbf w;
    public int c = 0;
    public int e = 0;
    private byte x = 2;
    public String h = "";
    public String i = "";
    public aoob j = aoob.b;
    public aoob l = aoob.b;
    public aoob m = aoob.b;
    public aoob n = aoob.b;
    public aoob q = aoob.b;

    static {
        ashp ashpVar = new ashp();
        a = ashpVar;
        aopi.registerDefaultInstance(ashp.class, ashpVar);
    }

    private ashp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.x = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0002\u0001\u0001̉\u0014\u0000\u0000\n\u0001ᐉ\u0000\u0004ဈ\u0004\u0005ဈ\u0005\u0006ᐉ\u0007\u0007ွ\u0000\bည\b\tည\t\nည\u0006\u000bᐼ\u0001\fᐼ\u0001\rည\f\u000eᐉ\r\u000fᐼ\u0000\u0010ဇ\u000e\u0011ᐉ\u000f\u0012ည\u0010\u0013ᐉ\u0011\u0014ᐉ\u0012\u0015ဌ\u0013̉ᐉ\u0014", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "k", "l", "m", "j", apzg.class, apzg.class, "n", "u", aunb.class, "o", "p", "q", "v", "r", "s", apiv.q, "w"});
            case 3:
                return new ashp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (ashp.class) {
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
