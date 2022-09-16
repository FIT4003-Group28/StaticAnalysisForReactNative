package defpackage;
/* compiled from: PG */
/* renamed from: aqic  reason: default package */
/* loaded from: classes2.dex */
public final class aqic extends aopi implements aoqv {
    public static final aqic a;
    private static volatile aorb b;
    private int c;
    private auxr d;
    private byte e = 2;

    static {
        aqic aqicVar = new aqic();
        a = aqicVar;
        aopi.registerDefaultInstance(aqic.class, aqicVar);
    }

    private aqic() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue952⒡\ue952⒡\u0001\u0000\u0000\u0001\ue952⒡ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqic();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqic.class) {
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
