package defpackage;
/* compiled from: PG */
/* renamed from: arzl  reason: default package */
/* loaded from: classes2.dex */
public final class arzl extends aopi implements aoqv {
    public static final arzl a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        arzl arzlVar = new arzl();
        a = arzlVar;
        aopi.registerDefaultInstance(arzl.class, arzlVar);
    }

    private arzl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", arzk.class});
            case 3:
                return new arzl();
            case 4:
                return new aopa((boolean[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (arzl.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
