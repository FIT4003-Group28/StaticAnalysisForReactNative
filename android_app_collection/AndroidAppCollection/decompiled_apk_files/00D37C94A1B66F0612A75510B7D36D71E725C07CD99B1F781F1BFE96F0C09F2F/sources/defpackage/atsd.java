package defpackage;
/* compiled from: PG */
/* renamed from: atsd  reason: default package */
/* loaded from: classes2.dex */
public final class atsd extends aopi implements aoqv {
    public static final atsd a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atsd atsdVar = new atsd();
        a = atsdVar;
        aopi.registerDefaultInstance(atsd.class, atsdVar);
    }

    private atsd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000ﱃ\u196f\ue607⨅\u0003\u0000\u0000\u0003ﱃ\u196fᐼ\u0000\uf321Ẑᐼ\u0000\ue607⨅ᐼ\u0000", new Object[]{"c", "b", aqmu.class, aqft.class, avvh.class});
            case 3:
                return new atsd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atsd.class) {
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
