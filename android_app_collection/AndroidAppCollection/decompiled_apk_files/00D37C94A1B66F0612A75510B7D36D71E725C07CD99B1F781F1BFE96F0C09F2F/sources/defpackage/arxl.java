package defpackage;
/* compiled from: PG */
/* renamed from: arxl  reason: default package */
/* loaded from: classes2.dex */
public final class arxl extends aopi implements aoqv {
    public static final arxl a;
    private static volatile aorb x;
    private apzg A;
    public int b;
    public int c;
    public aroy d;
    public arxg f;
    public arwt g;
    public arxb h;
    public arxa i;
    public arxe j;
    public arws k;
    public arwr l;
    public arwx m;
    public arwz n;
    public arwu o;
    public arxh p;
    public arxi q;
    public arxc r;
    public arwy s;
    public arwv t;
    public arww u;
    public arxd v;
    public arxf w;
    private int y;
    private apzg z;
    private byte B = 2;
    public String e = "";

    static {
        arxl arxlVar = new arxl();
        a = arxlVar;
        aopi.registerDefaultInstance(arxl.class, arxlVar);
    }

    private arxl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0016\u0000\u0003\u0001J\u0016\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\b\u0007ဉ\t\u000bဉ\r\rဉ\u000f\u000eဉ\u0010\u0011ဉ\u0013\u0012ဉ\u0014\u0014ဉ\u0016\u0015ဉ\u0018\u0016ဉ\u0019\u0017ဉ\u001a\u0019ဉ\u001b&ဉ\u00061ဉ12ဉ2IᐉFJᐉG", new Object[]{"b", "c", "y", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "i", "v", "w", "z", "A"});
            case 3:
                return new arxl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = x;
                if (aorbVar == null) {
                    synchronized (arxl.class) {
                        aorbVar = x;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            x = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
