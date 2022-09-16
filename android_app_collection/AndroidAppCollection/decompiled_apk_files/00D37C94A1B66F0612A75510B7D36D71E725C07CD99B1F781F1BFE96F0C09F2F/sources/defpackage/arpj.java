package defpackage;
/* compiled from: PG */
/* renamed from: arpj  reason: default package */
/* loaded from: classes2.dex */
public final class arpj extends aopi implements aoqv {
    public static final arpj a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arpj arpjVar = new arpj();
        a = arpjVar;
        aopi.registerDefaultInstance(arpj.class, arpjVar);
    }

    private arpj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf5a1㮗\ue470䘟\u0002\u0000\u0000\u0002\uf5a1㮗ᐼ\u0000\ue470䘟ᐼ\u0000", new Object[]{"c", "b", athc.class, aqis.class});
            case 3:
                return new arpj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arpj.class) {
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
