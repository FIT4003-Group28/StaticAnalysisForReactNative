package defpackage;
/* compiled from: PG */
/* renamed from: ario  reason: default package */
/* loaded from: classes2.dex */
public final class ario extends aopi implements aoqv {
    public static final ario a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ario arioVar = new ario();
        a = arioVar;
        aopi.registerDefaultInstance(ario.class, arioVar);
    }

    private ario() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000頻㿈\uf0da擶\u0003\u0000\u0000\u0003頻㿈ᐼ\u0000\ueb76䪮ᐼ\u0000\uf0da擶ᐼ\u0000", new Object[]{"c", "b", aphn.class, apza.class, aqtf.class});
            case 3:
                return new ario();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ario.class) {
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
