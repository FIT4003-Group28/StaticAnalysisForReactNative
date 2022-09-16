package defpackage;
/* compiled from: PG */
/* renamed from: arke  reason: default package */
/* loaded from: classes2.dex */
public final class arke extends aopi implements aoqv {
    public static final arke a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arke arkeVar = new arke();
        a = arkeVar;
        aopi.registerDefaultInstance(arke.class, arkeVar);
    }

    private arke() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf143ᠤ\uf0bd㮜\u0005\u0000\u0000\u0005\uf143ᠤᐼ\u0000啕\u1cc9ᐼ\u0000\uec81⟕ᐼ\u0000\uf127⩲ᐼ\u0000\uf0bd㮜ᐼ\u0000", new Object[]{"c", "b", aqfa.class, arfe.class, arjw.class, awbh.class, arkd.class});
            case 3:
                return new arke();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arke.class) {
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
