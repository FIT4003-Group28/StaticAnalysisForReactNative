package defpackage;
/* compiled from: PG */
/* renamed from: req  reason: default package */
/* loaded from: classes4.dex */
public final class req extends aopi implements aoqv {
    public static final req a;
    private static volatile aorb o;
    public int b;
    public int c;
    public int h;
    public int j;
    public int l;
    public int m;
    public boolean n;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long i = -1;
    public String k = "";

    static {
        req reqVar = new req();
        a = reqVar;
        aopi.registerDefaultInstance(req.class, reqVar);
    }

    private req() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019ဌ\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"b", "c", "d", "e", "g", "i", "j", "h", awsi.j, "k", "f", "l", "m", "n"});
            case 3:
                return new req();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (req.class) {
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
