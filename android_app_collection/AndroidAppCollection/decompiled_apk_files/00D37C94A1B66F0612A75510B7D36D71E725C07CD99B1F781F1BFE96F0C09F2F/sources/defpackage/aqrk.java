package defpackage;
/* compiled from: PG */
/* renamed from: aqrk  reason: default package */
/* loaded from: classes2.dex */
public final class aqrk extends aopi implements aoqv {
    public static final aqrk a;
    private static volatile aorb f;
    public int b;
    public aopu c = emptyProtobufList();
    public int d;
    public aqeq e;

    static {
        aqrk aqrkVar = new aqrk();
        a = aqrkVar;
        aopi.registerDefaultInstance(aqrk.class, aqrkVar);
    }

    private aqrk() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဉ\u0001", new Object[]{"b", "c", aqrj.class, "d", "e"});
            case 3:
                return new aqrk();
            case 4:
                return new aopa((char[]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqrk.class) {
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
