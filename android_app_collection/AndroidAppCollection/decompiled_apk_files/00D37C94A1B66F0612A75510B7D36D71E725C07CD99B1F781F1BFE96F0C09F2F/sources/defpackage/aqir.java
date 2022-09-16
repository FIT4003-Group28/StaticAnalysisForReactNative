package defpackage;
/* compiled from: PG */
/* renamed from: aqir  reason: default package */
/* loaded from: classes2.dex */
public final class aqir extends aopi implements aoqv {
    public static final aqir a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqir aqirVar = new aqir();
        a = aqirVar;
        aopi.registerDefaultInstance(aqir.class, aqirVar);
    }

    private aqir() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue818㢄ﶭ愤\u0003\u0000\u0000\u0003\ue818㢄ᐼ\u0000ﰏ娘ᐼ\u0000ﶭ愤ᐼ\u0000", new Object[]{"c", "b", apli.class, aplh.class, aufq.class});
            case 3:
                return new aqir();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqir.class) {
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
