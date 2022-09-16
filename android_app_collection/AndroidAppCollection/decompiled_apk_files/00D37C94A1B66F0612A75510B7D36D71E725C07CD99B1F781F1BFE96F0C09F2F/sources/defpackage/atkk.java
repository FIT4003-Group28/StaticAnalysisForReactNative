package defpackage;
/* compiled from: PG */
/* renamed from: atkk  reason: default package */
/* loaded from: classes2.dex */
public final class atkk extends aopi implements aoqv {
    public static final atkk a;
    private static volatile aorb b;
    private int c;
    private aqmt d;
    private byte e = 2;

    static {
        atkk atkkVar = new atkk();
        a = atkkVar;
        aopi.registerDefaultInstance(atkk.class, atkkVar);
    }

    private atkk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001突ハ突ハ\u0001\u0000\u0000\u0001突ハᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new atkk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atkk.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
