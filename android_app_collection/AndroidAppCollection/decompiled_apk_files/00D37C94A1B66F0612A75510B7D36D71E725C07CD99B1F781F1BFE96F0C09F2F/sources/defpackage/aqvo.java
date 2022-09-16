package defpackage;
/* compiled from: PG */
/* renamed from: aqvo  reason: default package */
/* loaded from: classes2.dex */
public final class aqvo extends aopi implements aoqv {
    public static final aqvo a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqvo aqvoVar = new aqvo();
        a = aqvoVar;
        aopi.registerDefaultInstance(aqvo.class, aqvoVar);
    }

    private aqvo() {
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0000\ue7f5ណ\ue94e딛\u0010\u0000\u0000\u0010\ue7f5ណᐼ\u0000ﯡ䥼ᐼ\u0000\uf72c䰍ᐼ\u0000禮猞ᐼ\u0000ﲵ猶ᐼ\u0000連砆ᐼ\u0000\ued5f竊ᐼ\u0000\ue48e繓ᐼ\u0000\ue0aa詙ᐼ\u0000\uf599鎒ᐼ\u0000\uf7f8頧ᐼ\u0000\uec75鬳ᐼ\u0000ﺪ鴡ᐼ\u0000\ue2cd\ua7caᐼ\u0000ﹹ녆ᐼ\u0000\ue94e딛ᐼ\u0000", new Object[]{"c", "b", auqh.class, avkd.class, aqgy.class, apyn.class, apyp.class, apys.class, aoxl.class, apdn.class, aqvr.class, asxf.class, auph.class, atea.class, augz.class, avaj.class, aqza.class, aqcf.class});
            case 3:
                return new aqvo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqvo.class) {
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
