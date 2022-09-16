package defpackage;
/* compiled from: PG */
/* renamed from: arwx  reason: default package */
/* loaded from: classes2.dex */
public final class arwx extends aopi implements aoqv {
    public static final arwx a;
    private static volatile aorb h;
    public int b;
    public double c;
    public double d;
    public String e = "";
    public String f = "";
    public int g = 1;

    static {
        arwx arwxVar = new arwx();
        a = arwxVar;
        aopi.registerDefaultInstance(arwx.class, arwxVar);
    }

    private arwx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", asev.f});
            case 3:
                return new arwx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arwx.class) {
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
