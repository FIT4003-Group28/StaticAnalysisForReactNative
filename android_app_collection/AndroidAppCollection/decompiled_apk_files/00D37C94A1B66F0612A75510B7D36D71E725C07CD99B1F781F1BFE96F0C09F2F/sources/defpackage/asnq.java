package defpackage;
/* compiled from: PG */
/* renamed from: asnq  reason: default package */
/* loaded from: classes2.dex */
public final class asnq extends aopi implements aoqv {
    public static final asnq a;
    private static volatile aorb k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public long h;
    public boolean i;
    public String f = "";
    public aopu j = emptyProtobufList();

    static {
        asnq asnqVar = new asnq();
        a = asnqVar;
        aopi.registerDefaultInstance(asnq.class, asnqVar);
    }

    private asnq() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0000\u0001င\u0000\u0004ဌ\u0003\u0007င\u0006\nဈ\t\u000bဇ\n\fဂ\u000b\rဇ\f\u0010\u001b", new Object[]{"b", "c", "d", asev.u, "e", "f", "g", "h", "i", "j", asnp.class});
            case 3:
                return new asnq();
            case 4:
                return new aopa((byte[][][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (asnq.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
