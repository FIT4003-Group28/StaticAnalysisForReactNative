package defpackage;
/* compiled from: PG */
/* renamed from: ascq  reason: default package */
/* loaded from: classes2.dex */
public final class ascq extends aopi implements aoqv {
    public static final ascq a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ascq ascqVar = new ascq();
        a = ascqVar;
        aopi.registerDefaultInstance(ascq.class, ascqVar);
    }

    private ascq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue6c6Ὺ\uf587淲\u0004\u0000\u0000\u0004\ue6c6Ὺᐼ\u0000\uf006⢾ᐼ\u0000\uf1f8⨰ᐼ\u0000\uf587淲ᐼ\u0000", new Object[]{"c", "b", aurh.class, auqx.class, apwh.class, apwo.class});
            case 3:
                return new ascq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ascq.class) {
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
