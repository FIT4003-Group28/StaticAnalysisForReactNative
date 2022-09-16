package defpackage;
/* compiled from: PG */
/* renamed from: orc  reason: default package */
/* loaded from: classes4.dex */
public final class orc extends aopi implements aoqv {
    public static final orc a;
    private static volatile aorb m;
    public int b;
    public int c;
    public int e;
    public long f;
    public long h;
    public int i;
    public boolean j;
    public long k;
    public long l;
    public String d = "";
    public String g = "";

    static {
        orc orcVar = new orc();
        a = orcVar;
        aopi.registerDefaultInstance(orc.class, orcVar);
    }

    private orc() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဃ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဌ\u0007\bဇ\b\tဂ\t\nဂ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", dnn.j, "j", "k", "l"});
            case 3:
                return new orc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (orc.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
