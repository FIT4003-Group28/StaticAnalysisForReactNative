package defpackage;
/* compiled from: PG */
/* renamed from: aqmb  reason: default package */
/* loaded from: classes2.dex */
public final class aqmb extends aopi implements aoqv {
    public static final aqmb a;
    private static volatile aorb e;
    public int b;
    public aopu c = emptyProtobufList();
    public int d;

    static {
        aqmb aqmbVar = new aqmb();
        a = aqmbVar;
        aopi.registerDefaultInstance(aqmb.class, aqmbVar);
    }

    private aqmb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"b", "c", atcq.class, "d", apog.j});
            case 3:
                return new aqmb();
            case 4:
                return new aopa((float[][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqmb.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
