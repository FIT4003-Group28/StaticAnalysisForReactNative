package defpackage;
/* compiled from: PG */
/* renamed from: org  reason: default package */
/* loaded from: classes4.dex */
public final class org extends aopi implements aoqv {
    public static final org a;
    private static volatile aorb p;
    public int b;
    public long g;
    public long h;
    public ore i;
    public long j;
    public orf l;
    public long m;
    public ajfx n;
    public aooo o;
    private byte q = 2;
    public int c = 8;
    public String d = "";
    public String e = "";
    public String f = "";
    public aopu k = aopi.emptyProtobufList();

    static {
        org orgVar = new org();
        a = orgVar;
        aopi.registerDefaultInstance(org.class, orgVar);
    }

    private org() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0018\r\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0006\u0005ဃ\u0004\u0006ဂ\u0005\u0007ဂ\u0007\u000b\u001a\u000eဉ\f\u000fဈ\u0003\u0012ဂ\u000f\u0017ဉ\u0014\u0018ဉ\u0015", new Object[]{"b", "c", dnn.k, "d", "e", "i", "g", "h", "j", "k", "l", "f", "m", "n", "o"});
            case 3:
                return new org();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (org.class) {
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
