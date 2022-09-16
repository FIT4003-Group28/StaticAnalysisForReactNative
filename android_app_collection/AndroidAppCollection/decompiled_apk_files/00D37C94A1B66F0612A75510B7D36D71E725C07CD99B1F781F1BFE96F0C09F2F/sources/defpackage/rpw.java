package defpackage;
/* compiled from: PG */
/* renamed from: rpw  reason: default package */
/* loaded from: classes4.dex */
public final class rpw extends aopi implements aoqv {
    public static final rpw a;
    private static volatile aorb h;
    public int b;
    public int c;
    public boolean d;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        rpw rpwVar = new rpw();
        a = rpwVar;
        aopi.registerDefaultInstance(rpw.class, rpwVar);
    }

    private rpw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", dnn.r, "d", "e", "f", "g"});
            case 3:
                return new rpw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (rpw.class) {
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
