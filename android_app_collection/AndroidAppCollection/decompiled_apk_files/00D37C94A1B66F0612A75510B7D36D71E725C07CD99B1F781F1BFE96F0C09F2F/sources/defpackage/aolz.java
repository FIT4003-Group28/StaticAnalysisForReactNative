package defpackage;
/* compiled from: PG */
/* renamed from: aolz  reason: default package */
/* loaded from: classes.dex */
public final class aolz extends aopi implements aoqv {
    public static final aolz a;
    private static volatile aorb w;
    public int b;
    public aome f;
    public long g;
    public aolw i;
    public aolx k;
    public int l;
    public aoly m;
    public aolv o;
    public int q;
    public int s;
    public boolean t;
    public aomj v;
    public String c = "";
    public String d = "";
    public aopu e = emptyProtobufList();
    public String h = "";
    public String j = "";
    public String n = "";
    public String p = "";
    public String r = "";
    public String u = "";

    static {
        aolz aolzVar = new aolz();
        a = aolzVar;
        aopi.registerDefaultInstance(aolz.class, aolzVar);
    }

    private aolz() {
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
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\bဈ\u0006\tဉ\u0007\nဌ\b\u000bဉ\t\fဈ\n\rဉ\u000b\u000eဈ\f\u000fင\r\u0010ဈ\u000e\u0011ဌ\u000f\u0012ဇ\u0010\u0013ဈ\u0011\u0014ဉ\u0012", new Object[]{"b", "c", "d", "e", aome.class, "f", "g", "h", "i", "j", "k", "l", aoli.g, "m", "n", "o", "p", "q", "r", "s", aoli.i, "t", "u", "v"});
            case 3:
                return new aolz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (aolz.class) {
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
