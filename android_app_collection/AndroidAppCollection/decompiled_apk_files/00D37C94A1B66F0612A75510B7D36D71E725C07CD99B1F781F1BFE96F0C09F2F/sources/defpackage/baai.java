package defpackage;
/* compiled from: PG */
/* renamed from: baai  reason: default package */
/* loaded from: classes2.dex */
public final class baai extends aopi implements aoqv {
    public static final baai a;
    private static volatile aorb h;
    public int b;
    public int e;
    public long f;
    public String c = "";
    public String d = "";
    public String g = "";

    static {
        baai baaiVar = new baai();
        a = baaiVar;
        aopi.registerDefaultInstance(baai.class, baaiVar);
    }

    private baai() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", axce.u, "f", "g"});
            case 3:
                return new baai();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (baai.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
