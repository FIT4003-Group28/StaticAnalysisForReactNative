package defpackage;
/* compiled from: PG */
/* renamed from: tpo  reason: default package */
/* loaded from: classes4.dex */
public final class tpo extends aopi implements aoqv {
    public static final tpo a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public aono g;

    static {
        tpo tpoVar = new tpo();
        a = tpoVar;
        aopi.registerDefaultInstance(tpo.class, tpoVar);
    }

    private tpo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new tpo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (tpo.class) {
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
