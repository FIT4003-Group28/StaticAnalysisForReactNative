package defpackage;
/* compiled from: PG */
/* renamed from: aqvf  reason: default package */
/* loaded from: classes2.dex */
public final class aqvf extends aopi implements aoqv {
    public static final aqvf a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqvf aqvfVar = new aqvf();
        a = aqvfVar;
        aopi.registerDefaultInstance(aqvf.class, aqvfVar);
    }

    private aqvf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue856㊰搜䞻\u0003\u0000\u0000\u0001\ue856㊰ᐼ\u0000ﾼ㌡ြ\u0000搜䞻ြ\u0000", new Object[]{"c", "b", aqve.class, aqvg.class, aqvh.class});
            case 3:
                return new aqvf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqvf.class) {
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
