package defpackage;
/* compiled from: PG */
/* renamed from: ory  reason: default package */
/* loaded from: classes4.dex */
public final class ory extends aopi implements aoqv {
    private static volatile aorb C;
    public static final ory a;
    public aweh A;
    public int b;
    public int f;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public atty r;
    public attz s;
    public boolean u;
    public boolean v;
    public int w;
    public int y;
    public boolean z;
    public aoqp x = aoqp.a;
    public String c = "";
    public aopu d = aopi.emptyProtobufList();
    public String e = "";
    public String g = "";
    public aoob h = aoob.b;
    public String m = "";
    public aoob t = aoob.b;
    public aoob B = aoob.b;

    static {
        ory oryVar = new ory();
        a = oryVar;
        aopi.registerDefaultInstance(ory.class, oryVar);
    }

    private ory() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0001$\u001a\u0001\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004င\u0002\u0005ဈ\u0003\u0006ည\u0004\u0007ဇ\u0005\bဇ\u0006\u000bဂ\b\fဈ\t\rဇ\n\u000eဇ\u000b\u000fဇ\f\u0012ဇ\u000f\u0013ဉ\u0010\u0015ဉ\u0012\u0016ည\u0013\u001aဇ\u0015\u001bဇ\u0016\u001eဌ\u0019\u001f2 ဌ\u001a!ဇ\u001b\"ဇ\u0007#ဉ\u001c$ည\u001d", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", orw.b(), "x", orx.a, "y", atqy.k, "z", "k", "A", "B"});
            case 3:
                return new ory();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = C;
                if (aorbVar == null) {
                    synchronized (ory.class) {
                        aorbVar = C;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            C = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
