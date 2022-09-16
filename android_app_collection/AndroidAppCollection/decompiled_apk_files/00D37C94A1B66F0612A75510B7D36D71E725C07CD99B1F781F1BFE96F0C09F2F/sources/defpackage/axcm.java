package defpackage;
/* compiled from: PG */
/* renamed from: axcm  reason: default package */
/* loaded from: classes2.dex */
public final class axcm extends aopi implements aoqv {
    public static final axcm a;
    private static volatile aorb f;
    public int b;
    public axcn d;
    public aopu c = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        axcm axcmVar = new axcm();
        a = axcmVar;
        aopi.registerDefaultInstance(axcm.class, axcmVar);
    }

    private axcm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003\u001b", new Object[]{"b", "c", axcl.class, "d", "e", axat.class});
            case 3:
                return new axcm();
            case 4:
                return new aopa((short[][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (axcm.class) {
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
