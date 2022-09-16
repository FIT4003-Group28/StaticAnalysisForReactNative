package defpackage;
/* compiled from: PG */
/* renamed from: arzp  reason: default package */
/* loaded from: classes2.dex */
public final class arzp extends aopi implements aoqv {
    public static final arzp a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        arzp arzpVar = new arzp();
        a = arzpVar;
        aopi.registerDefaultInstance(arzp.class, arzpVar);
    }

    private arzp() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf096\u1c97嗢㷌\u0005\u0000\u0000\u0000\uf096\u1c97ြ\u0000︙ḭြ\u0000\uf24eḳြ\u0000\uf1b4⥶ြ\u0000嗢㷌ြ\u0000", new Object[]{"c", "b", atzm.class, atzj.class, atzk.class, atzi.class, atzl.class});
            case 3:
                return new arzp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arzp.class) {
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
