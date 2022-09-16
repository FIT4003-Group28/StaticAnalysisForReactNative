package defpackage;
/* compiled from: PG */
/* renamed from: asta  reason: default package */
/* loaded from: classes2.dex */
public final class asta extends aopi implements aoqv {
    public static final asta a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asta astaVar = new asta();
        a = astaVar;
        aopi.registerDefaultInstance(asta.class, astaVar);
    }

    private asta() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf45c㼺\ue932怱\u0003\u0000\u0000\u0003\uf45c㼺ᐼ\u0000\uf478㼺ᐼ\u0000\ue932怱ᐼ\u0000", new Object[]{"c", "b", astc.class, astb.class, assz.class});
            case 3:
                return new asta();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asta.class) {
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
