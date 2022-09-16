package defpackage;
/* compiled from: PG */
/* renamed from: asca  reason: default package */
/* loaded from: classes2.dex */
public final class asca extends aopi implements aoqv {
    public static final asca a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asca ascaVar = new asca();
        a = ascaVar;
        aopi.registerDefaultInstance(asca.class, ascaVar);
    }

    private asca() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\ue7f5ណ\ueaaa䯴\u0006\u0000\u0000\u0006\ue7f5ណᐼ\u0000\ue1faᠿᐼ\u0000\ue592᯦ᐼ\u0000\ue3bf᳙ᐼ\u0000\uebfa╈ᐼ\u0000\ueaaa䯴ᐼ\u0000", new Object[]{"c", "b", auqh.class, ascf.class, atfa.class, asce.class, asbs.class, avsl.class});
            case 3:
                return new asca();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asca.class) {
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
