package defpackage;
/* compiled from: PG */
/* renamed from: asnu  reason: default package */
/* loaded from: classes2.dex */
public final class asnu extends aopi implements aoqv {
    public static final asnu a;
    private static volatile aorb i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        asnu asnuVar = new asnu();
        a = asnuVar;
        aopi.registerDefaultInstance(asnu.class, asnuVar);
    }

    private asnu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"b", "c", asnz.c, "d", asnz.a, "e", asnz.b, "f", aulk.j, "g", auii.u, "h", auii.t});
            case 3:
                return new asnu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asnu.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
