package defpackage;
/* compiled from: PG */
/* renamed from: aswi  reason: default package */
/* loaded from: classes2.dex */
public final class aswi extends aopi implements aoqv {
    public static final aswi a;
    private static volatile aorb f;
    public int b;
    public int d;
    public String c = "";
    public aopu e = emptyProtobufList();

    static {
        aswi aswiVar = new aswi();
        a = aswiVar;
        aopi.registerDefaultInstance(aswi.class, aswiVar);
    }

    private aswi() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", aswf.class});
            case 3:
                return new aswi();
            case 4:
                return new aopa((byte[][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aswi.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
