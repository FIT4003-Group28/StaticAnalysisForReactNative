package defpackage;
/* compiled from: PG */
/* renamed from: tqz  reason: default package */
/* loaded from: classes4.dex */
public final class tqz extends aopi implements aoqv {
    public static final tqz a;
    private static volatile aorb h;
    public int b;
    public int d;
    public boolean e;
    public long f;
    public String c = "";
    public String g = "";

    static {
        tqz tqzVar = new tqz();
        a = tqzVar;
        aopi.registerDefaultInstance(tqz.class, tqzVar);
    }

    private tqz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\n\u0005\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဌ\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004", new Object[]{"b", "c", "d", tqu.b(), "e", "f", "g"});
            case 3:
                return new tqz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (tqz.class) {
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
