package defpackage;
/* compiled from: PG */
/* renamed from: awxf  reason: default package */
/* loaded from: classes2.dex */
public final class awxf extends aopi implements aoqv {
    public static final awxf a;
    private static volatile aorb f;
    public String b = "";
    public String c = "";
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        awxf awxfVar = new awxf();
        a = awxfVar;
        aopi.registerDefaultInstance(awxf.class, awxfVar);
    }

    private awxf() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n", new Object[]{"b", "c", "d", awxe.class, "e"});
            case 3:
                return new awxf();
            case 4:
                return new aopa((byte[]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awxf.class) {
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
