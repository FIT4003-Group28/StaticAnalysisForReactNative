package defpackage;
/* compiled from: PG */
/* renamed from: azyx  reason: default package */
/* loaded from: classes2.dex */
public final class azyx extends aopi implements aoqv {
    public static final azyx a;
    private static volatile aorb f;
    public int b;
    public aopu c = emptyProtobufList();
    public azyy d;
    public int e;

    static {
        azyx azyxVar = new azyx();
        a = azyxVar;
        aopi.registerDefaultInstance(azyx.class, azyxVar);
    }

    private azyx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{"b", "c", azyw.class, "d", "e"});
            case 3:
                return new azyx();
            case 4:
                return new aopa((float[][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (azyx.class) {
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
