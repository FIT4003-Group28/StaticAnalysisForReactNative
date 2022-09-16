package defpackage;
/* compiled from: PG */
/* renamed from: aqvq  reason: default package */
/* loaded from: classes2.dex */
public final class aqvq extends aopi implements aoqv {
    public static final aopr a = new uil(17);
    public static final aqvq b;
    private static volatile aorb y;
    public int c;
    public Object e;
    public aqvp f;
    public aqvo g;
    public aunb h;
    public aqvn i;
    public boolean j;
    public int k;
    public int m;
    public int n;
    public apzg q;
    public apzg r;
    public apzg s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public asvv x;
    public int d = 0;
    private byte z = 2;
    public aopq l = emptyIntList();
    public aopu o = emptyProtobufList();
    public aopu p = emptyProtobufList();

    static {
        aqvq aqvqVar = new aqvq();
        b = aqvqVar;
        aopi.registerDefaultInstance(aqvq.class, aqvqVar);
    }

    private aqvq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.z = b2;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0015\u0001\u0001\u0001ϧ\u0015\u0000\u0003\t\u0001ျ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ဉ\u0006\u0005င\u0014\u0006ဇ\u0007\nᐉ\u0005\u000bЛ\fЛ\rဌ\n\u000eဌ\u000b\u000fဇ\u0011\u0010ᐉ\u000e\u0011ဌ\f\u0012ြ\u0000\u0014ဇ\u0012\u0015,\u0016ဌ\u0013\u0017ᐉ\u0010\u0018ᐉ\u000fϧᐉ\u0015", new Object[]{"e", "d", "c", "f", "g", "i", "w", "j", "h", "o", apzg.class, "p", apzg.class, "k", aqov.r, "m", aqov.q, "t", "q", "n", aqov.p, aqvl.class, "u", "l", aqvi.a(), "v", aqov.t, "s", "r", "x"});
            case 3:
                return new aqvq();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = y;
                if (aorbVar == null) {
                    synchronized (aqvq.class) {
                        aorbVar = y;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            y = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
