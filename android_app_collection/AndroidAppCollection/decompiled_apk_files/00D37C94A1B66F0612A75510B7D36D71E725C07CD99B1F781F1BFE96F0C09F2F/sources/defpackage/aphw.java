package defpackage;
/* compiled from: PG */
/* renamed from: aphw  reason: default package */
/* loaded from: classes.dex */
public final class aphw extends aopi implements aoqv {
    public static final aphw a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public String d = "";
    public String e = "";
    public int f;

    static {
        aphw aphwVar = new aphw();
        a = aphwVar;
        aopi.registerDefaultInstance(aphw.class, aphwVar);
    }

    private aphw() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0007ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", aupm.k});
            case 3:
                return new aphw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aphw.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
