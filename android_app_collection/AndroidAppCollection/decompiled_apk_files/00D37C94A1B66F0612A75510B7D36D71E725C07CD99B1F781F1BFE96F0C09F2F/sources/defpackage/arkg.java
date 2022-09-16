package defpackage;
/* compiled from: PG */
/* renamed from: arkg  reason: default package */
/* loaded from: classes2.dex */
public final class arkg extends aopi implements aoqv {
    public static final arkg a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arkg arkgVar = new arkg();
        a = arkgVar;
        aopi.registerDefaultInstance(arkg.class, arkgVar);
    }

    private arkg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf345㝑\ue98b嵥\u0003\u0000\u0000\u0003\uf345㝑ᐼ\u0000宅凞ᐼ\u0000\ue98b嵥ᐼ\u0000", new Object[]{"c", "b", arkc.class, arkb.class, aqwz.class});
            case 3:
                return new arkg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arkg.class) {
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
