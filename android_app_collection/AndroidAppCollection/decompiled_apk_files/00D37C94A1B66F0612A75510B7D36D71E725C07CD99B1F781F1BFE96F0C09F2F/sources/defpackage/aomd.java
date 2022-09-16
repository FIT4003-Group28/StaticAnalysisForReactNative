package defpackage;
/* compiled from: PG */
/* renamed from: aomd  reason: default package */
/* loaded from: classes.dex */
public final class aomd extends aopi implements aoqv {
    public static final aomd a;
    private static volatile aorb p;
    public Object c;
    public long e;
    public aomq f;
    public long h;
    public long i;
    public aono k;
    public long m;
    public int n;
    public aomt o;
    private int q;
    public int b = 0;
    public String d = "";
    public aopu g = emptyProtobufList();
    public String j = "";
    public String l = "";

    static {
        aomd aomdVar = new aomd();
        a = aomdVar;
        aopi.registerDefaultInstance(aomd.class, aomdVar);
    }

    private aomd() {
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0005\u0018\u0010\u0000\u0001\u0000\u0005\u001b\bဂ\b\tဂ\t\nဈ\u0001\fြ\u0000\rြ\u0000\u000eဉ\u000f\u000fဉ\u0005\u0010ဈ\u0010\u0011ြ\u0000\u0012ြ\u0000\u0014ဂ\u0011\u0015ဌ\u0012\u0016ဈ\u000e\u0017ဂ\u0004\u0018ဉ\u0013", new Object[]{"c", "b", "q", "g", aomc.class, "h", "i", "d", aolz.class, aomh.class, "k", "f", "l", aoms.class, aomf.class, "m", "n", aoli.o, "j", "e", "o"});
            case 3:
                return new aomd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aomd.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
