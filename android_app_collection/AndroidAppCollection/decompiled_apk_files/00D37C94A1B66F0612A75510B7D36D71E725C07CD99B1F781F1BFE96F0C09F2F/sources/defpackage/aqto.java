package defpackage;
/* compiled from: PG */
/* renamed from: aqto  reason: default package */
/* loaded from: classes2.dex */
public final class aqto extends aopi implements aoqv {
    public static final aqto a;
    private static volatile aorb e;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        aqto aqtoVar = new aqto();
        a = aqtoVar;
        aopi.registerDefaultInstance(aqto.class, aqtoVar);
    }

    private aqto() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0018\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0006ဇ\u0003\u0018ဇ\u0006", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new aqto();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqto.class) {
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
