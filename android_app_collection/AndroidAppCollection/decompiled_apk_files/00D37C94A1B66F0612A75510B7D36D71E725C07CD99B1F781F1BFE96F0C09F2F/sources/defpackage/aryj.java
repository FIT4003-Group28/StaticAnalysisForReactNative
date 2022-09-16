package defpackage;
/* compiled from: PG */
/* renamed from: aryj  reason: default package */
/* loaded from: classes2.dex */
public final class aryj extends aopi implements aoqv {
    public static final aryj a;
    private static volatile aorb e;
    public arpa b;
    public boolean c;
    private int f;
    private byte g = 2;
    public aopu d = emptyProtobufList();

    static {
        aryj aryjVar = new aryj();
        a = aryjVar;
        aopi.registerDefaultInstance(aryj.class, aryjVar);
    }

    private aryj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0004Л", new Object[]{"f", "b", "c", "d", apzg.class});
            case 3:
                return new aryj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aryj.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
