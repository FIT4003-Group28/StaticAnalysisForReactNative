package defpackage;
/* compiled from: PG */
/* renamed from: asgu  reason: default package */
/* loaded from: classes2.dex */
public final class asgu extends aopi implements aoqv {
    public static final asgu a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asgu asguVar = new asgu();
        a = asguVar;
        aopi.registerDefaultInstance(asgu.class, asguVar);
    }

    private asgu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf897ᢰ\ue1ab㯆\u0004\u0000\u0000\u0004\uf897ᢰᐼ\u0000\uf8afᢰᐼ\u0000\uedf1㣊ᐼ\u0000\ue1ab㯆ᐼ\u0000", new Object[]{"c", "b", asgl.class, asgm.class, arcf.class, asgg.class});
            case 3:
                return new asgu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgu.class) {
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
