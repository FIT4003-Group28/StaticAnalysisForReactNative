package defpackage;
/* compiled from: PG */
/* renamed from: athz  reason: default package */
/* loaded from: classes2.dex */
public final class athz extends aopi implements aoqv {
    public static final athz a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        athz athzVar = new athz();
        a = athzVar;
        aopi.registerDefaultInstance(athz.class, athzVar);
    }

    private athz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\ueb11ἑﱖ\uab1f\u0005\u0000\u0000\u0004\ueb11ἑᐼ\u0000ﴌ㦜ᐼ\u0000\uebde馑ᐼ\u0000\ue123鶿ြ\u0000ﱖ\uab1fᐼ\u0000", new Object[]{"c", "b", apoj.class, atjf.class, avjg.class, avjh.class, arhm.class});
            case 3:
                return new athz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (athz.class) {
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
