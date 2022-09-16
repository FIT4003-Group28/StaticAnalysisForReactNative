package defpackage;
/* compiled from: PG */
/* renamed from: arfx  reason: default package */
/* loaded from: classes2.dex */
public final class arfx extends aopi implements aoqv {
    public static final arfx a;
    private static volatile aorb f;
    public int b;
    public int c;
    public int d;
    public aoob e = aoob.b;

    static {
        arfx arfxVar = new arfx();
        a = arfxVar;
        aopi.registerDefaultInstance(arfx.class, arfxVar);
    }

    private arfx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ည\u0002", new Object[]{"b", "c", arfp.e, "d", arfp.f, "e"});
            case 3:
                return new arfx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arfx.class) {
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
