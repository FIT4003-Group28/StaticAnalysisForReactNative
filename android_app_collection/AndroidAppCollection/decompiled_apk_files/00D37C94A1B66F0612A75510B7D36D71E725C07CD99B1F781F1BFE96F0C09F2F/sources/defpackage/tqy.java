package defpackage;
/* compiled from: PG */
/* renamed from: tqy  reason: default package */
/* loaded from: classes4.dex */
public final class tqy extends aopi implements aoqv {
    public static final tqy a;
    private static volatile aorb h;
    public int b;
    public int d;
    public int f;
    public awxs g;
    public String c = "";
    public String e = "";

    static {
        tqy tqyVar = new tqy();
        a = tqyVar;
        aopi.registerDefaultInstance(tqy.class, tqyVar);
    }

    private tqy() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", sml.n, "g"});
            case 3:
                return new tqy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (tqy.class) {
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
