package defpackage;
/* compiled from: PG */
/* renamed from: baav  reason: default package */
/* loaded from: classes2.dex */
public final class baav extends aopi implements aoqv {
    public static final baav a;
    private static volatile aorb e;
    public int b;
    public int c;
    private baas f;
    private byte g = 2;
    public int d = 1;

    static {
        baav baavVar = new baav();
        a = baavVar;
        aopi.registerDefaultInstance(baav.class, baavVar);
    }

    private baav() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", baau.a(), "d", "f"});
            case 3:
                return new baav();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (baav.class) {
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
