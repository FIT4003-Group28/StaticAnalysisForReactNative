package defpackage;
/* compiled from: PG */
/* renamed from: asqy  reason: default package */
/* loaded from: classes2.dex */
public final class asqy extends aopi implements aoqv {
    public static final asqy a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asqy asqyVar = new asqy();
        a = asqyVar;
        aopi.registerDefaultInstance(asqy.class, asqyVar);
    }

    private asqy() {
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
                return newMessageInfo(a, "\u0001\u000e\u0001\u0000ﴸ㟮\ueba6딋\u000e\u0000\u0000\rﴸ㟮ᐼ\u0000\ue67e㶿ᐼ\u0000ﲊ㹍ᐼ\u0000ﮓ㼭ᐼ\u0000\uee50㾍ᐼ\u0000\ue359䘒ြ\u0000\ue9ba䘔ᐼ\u0000\uf492䤳ᐼ\u0000\uee51仌ᐼ\u0000\uf616巷ᐼ\u0000\uf602滐ᐼ\u0000\uf863砀ᐼ\u0000簾豣ᐼ\u0000\ueba6딋ᐼ\u0000", new Object[]{"c", "b", asrf.class, asrb.class, asqz.class, asrw.class, asrc.class, asre.class, asqw.class, aqtb.class, asrg.class, asrx.class, asra.class, asqx.class, assj.class, auyb.class});
            case 3:
                return new asqy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asqy.class) {
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
