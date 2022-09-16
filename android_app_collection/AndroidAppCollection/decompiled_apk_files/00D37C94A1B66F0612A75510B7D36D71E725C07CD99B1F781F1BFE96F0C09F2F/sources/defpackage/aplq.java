package defpackage;
/* compiled from: PG */
/* renamed from: aplq  reason: default package */
/* loaded from: classes.dex */
public final class aplq extends aopi implements aoqv {
    public static final aplq a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aplq aplqVar = new aplq();
        a = aplqVar;
        aopi.registerDefaultInstance(aplq.class, aplqVar);
    }

    private aplq() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\ue1d6\u181e\uf52cꊔ\t\u0000\u0000\t\ue1d6\u181eᐼ\u0000\uf143ᠤᐼ\u0000ﳴᠰᐼ\u0000\ue567ᠲᐼ\u0000\uf696⽤ᐼ\u0000\uead9㦓ᐼ\u0000\uf492䤳ᐼ\u0000\ufb1a巰ᐼ\u0000\uf52cꊔᐼ\u0000", new Object[]{"c", "b", awar.class, aqfa.class, audn.class, aqei.class, aufe.class, apkt.class, aqtb.class, augb.class, aufz.class});
            case 3:
                return new aplq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aplq.class) {
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
