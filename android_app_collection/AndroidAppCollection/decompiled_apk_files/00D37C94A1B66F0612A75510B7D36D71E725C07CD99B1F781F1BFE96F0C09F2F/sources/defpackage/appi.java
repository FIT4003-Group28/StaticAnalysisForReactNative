package defpackage;
/* compiled from: PG */
/* renamed from: appi  reason: default package */
/* loaded from: classes2.dex */
public final class appi extends aopi implements aoqv {
    public static final appi a;
    private static volatile aorb e;
    public int b;
    public boolean c;
    public avxa d;
    private apeo f;
    private byte g = 2;

    static {
        appi appiVar = new appi();
        a = appiVar;
        aopi.registerDefaultInstance(appi.class, appiVar);
    }

    private appi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ဇ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "f"});
            case 3:
                return new appi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (appi.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
