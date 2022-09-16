package defpackage;
/* compiled from: PG */
/* renamed from: apab  reason: default package */
/* loaded from: classes.dex */
public final class apab extends aopi implements aoqv {
    public static final apab a;
    private static volatile aorb f;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    private int g;

    static {
        apab apabVar = new apab();
        a = apabVar;
        aopi.registerDefaultInstance(apab.class, apabVar);
    }

    private apab() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new apab();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apab.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
