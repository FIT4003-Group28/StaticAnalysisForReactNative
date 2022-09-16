package defpackage;
/* compiled from: PG */
/* renamed from: ascu  reason: default package */
/* loaded from: classes2.dex */
public final class ascu extends aopi implements aoqv {
    public static final ascu a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ascu ascuVar = new ascu();
        a = ascuVar;
        aopi.registerDefaultInstance(ascu.class, ascuVar);
    }

    private ascu() {
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0000拓ᵕ\ue857끞\u0010\u0000\u0000\u0010拓ᵕᐼ\u0000\ue6c6Ὺᐼ\u0000\uf006⢾ᐼ\u0000\uf1f8⨰ᐼ\u0000\uf5d9ⲵᐼ\u0000\uf792ⳬᐼ\u0000ﱙ㬷ᐼ\u0000\ue6d4䓥ᐼ\u0000\uf492䤳ᐼ\u0000\uec67䩗ᐼ\u0000\ue3db勁ᐼ\u0000\uea8e愮ᐼ\u0000\uf587淲ᐼ\u0000\ufe53髪ᐼ\u0000\uf2fc\uab7dᐼ\u0000\ue857끞ᐼ\u0000", new Object[]{"c", "b", aurj.class, aurh.class, auqx.class, apwh.class, aurd.class, apwr.class, apwi.class, apws.class, aqtb.class, arct.class, apwq.class, apwm.class, apwo.class, apwj.class, apwk.class, apwp.class});
            case 3:
                return new ascu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ascu.class) {
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
