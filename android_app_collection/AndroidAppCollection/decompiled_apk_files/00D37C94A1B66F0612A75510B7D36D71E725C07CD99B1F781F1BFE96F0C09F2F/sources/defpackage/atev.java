package defpackage;
/* compiled from: PG */
/* renamed from: atev  reason: default package */
/* loaded from: classes2.dex */
public final class atev extends aopi implements aoqv {
    public static final atev a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atev atevVar = new atev();
        a = atevVar;
        aopi.registerDefaultInstance(atev.class, atevVar);
    }

    private atev() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000陋⊅\uef56\u2cf8\u0003\u0000\u0000\u0003陋⊅ᐼ\u0000\ue97d✹ᐼ\u0000\uef56\u2cf8ᐼ\u0000", new Object[]{"c", "b", atky.class, ateu.class, aqfv.class});
            case 3:
                return new atev();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atev.class) {
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
