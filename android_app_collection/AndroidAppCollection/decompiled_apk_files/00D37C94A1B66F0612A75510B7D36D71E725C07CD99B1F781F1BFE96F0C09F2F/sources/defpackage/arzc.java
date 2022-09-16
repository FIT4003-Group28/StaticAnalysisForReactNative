package defpackage;
/* compiled from: PG */
/* renamed from: arzc  reason: default package */
/* loaded from: classes2.dex */
public final class arzc extends aopi implements aoqv {
    public static final arzc a;
    private static volatile aorb f;
    public int b;
    public int c;
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;
    private int g;

    static {
        arzc arzcVar = new arzc();
        a = arzcVar;
        aopi.registerDefaultInstance(arzc.class, arzcVar);
    }

    private arzc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u001b\u0004ည\u0002", new Object[]{"g", "b", arpt.j, "c", "d", arza.class, "e"});
            case 3:
                return new arzc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arzc.class) {
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
