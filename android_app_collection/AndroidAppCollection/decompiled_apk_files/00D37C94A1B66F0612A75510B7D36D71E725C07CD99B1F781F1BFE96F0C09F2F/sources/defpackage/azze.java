package defpackage;
/* compiled from: PG */
/* renamed from: azze  reason: default package */
/* loaded from: classes2.dex */
public final class azze extends aopi implements aoqv {
    public static final azze a;
    private static volatile aorb f;
    public int b;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public azzd e;

    static {
        azze azzeVar = new azze();
        a = azzeVar;
        aopi.registerDefaultInstance(azze.class, azzeVar);
    }

    private azze() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", azzh.class, "d", azzc.class, "e"});
            case 3:
                return new azze();
            case 4:
                return new aopa((float[]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (azze.class) {
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
