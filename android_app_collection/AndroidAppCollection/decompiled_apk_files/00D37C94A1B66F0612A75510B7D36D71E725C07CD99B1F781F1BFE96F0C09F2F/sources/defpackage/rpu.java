package defpackage;
/* compiled from: PG */
/* renamed from: rpu  reason: default package */
/* loaded from: classes4.dex */
public final class rpu extends aopi implements aoqv {
    public static final rpu a;
    private static volatile aorb j;
    public int b;
    public int c;
    public String d = "";
    public aopu e = emptyProtobufList();
    public rpw f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        rpu rpuVar = new rpu();
        a = rpuVar;
        aopi.registerDefaultInstance(rpu.class, rpuVar);
    }

    private rpu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"b", "c", "d", "e", rpv.class, "f", "g", "h", "i"});
            case 3:
                return new rpu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (rpu.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
