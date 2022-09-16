package defpackage;
/* compiled from: PG */
/* renamed from: aven  reason: default package */
/* loaded from: classes2.dex */
public final class aven extends aopi implements aoqv {
    public static final aven a;
    private static volatile aorb k;
    public int b;
    public int c;
    public avel d;
    public avek e;
    public avej g;
    public apeq i;
    public avei j;
    public aoob f = aoob.b;
    public aopu h = emptyProtobufList();

    static {
        aven avenVar = new aven();
        a = avenVar;
        aopi.registerDefaultInstance(aven.class, avenVar);
    }

    private aven() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\tဉ\u0006\n\u001b\fဉ\b\u000eဉ\n", new Object[]{"b", "c", aveo.a(), "d", "e", "f", "g", "h", aqlk.class, "i", "j"});
            case 3:
                return new aven();
            case 4:
                return new aopa((byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aven.class) {
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
