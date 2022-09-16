package defpackage;
/* compiled from: PG */
/* renamed from: appk  reason: default package */
/* loaded from: classes2.dex */
public final class appk extends aopi implements aoqv {
    private static final appk a;
    private static volatile aorb b;
    private int c = 0;
    private Object d;

    static {
        appk appkVar = new appk();
        a = appkVar;
        aopi.registerDefaultInstance(appk.class, appkVar);
    }

    private appk() {
    }

    public static appk c() {
        return a;
    }

    public appj a() {
        return appj.a(this.c);
    }

    public appl d() {
        if (this.c == 1) {
            return (appl) this.d;
        }
        return appl.b();
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"d", "c", appl.class});
            case 3:
                return new appk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (appk.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
