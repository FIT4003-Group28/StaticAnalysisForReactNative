package defpackage;
/* compiled from: PG */
/* renamed from: asau  reason: default package */
/* loaded from: classes2.dex */
public final class asau extends aopi implements aoqv {
    public static final asau a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asau asauVar = new asau();
        a = asauVar;
        aopi.registerDefaultInstance(asau.class, asauVar);
    }

    private asau() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue059ᥧ\uee40勒\u0003\u0000\u0000\u0003\ue059ᥧᐼ\u0000ﾸ⸜ᐼ\u0000\uee40勒ᐼ\u0000", new Object[]{"c", "b", aucu.class, aucg.class, atkf.class});
            case 3:
                return new asau();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asau.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
