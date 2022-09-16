package defpackage;
/* compiled from: PG */
/* renamed from: auct  reason: default package */
/* loaded from: classes2.dex */
public final class auct extends aopi implements aoqv {
    public static final auct a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        auct auctVar = new auct();
        a = auctVar;
        aopi.registerDefaultInstance(auct.class, auctVar);
    }

    private auct() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue528᳢\ue18f㻥\u0003\u0000\u0000\u0003\ue528᳢ᐼ\u0000\ueb11ἑᐼ\u0000\ue18f㻥ᐼ\u0000", new Object[]{"c", "b", attp.class, apoj.class, atrt.class});
            case 3:
                return new auct();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auct.class) {
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
