package defpackage;
/* compiled from: PG */
/* renamed from: arpf  reason: default package */
/* loaded from: classes2.dex */
public final class arpf extends aopi implements aoqv {
    public static final arpf a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public arpn f;

    static {
        arpf arpfVar = new arpf();
        a = arpfVar;
        aopi.registerDefaultInstance(arpf.class, arpfVar);
    }

    private arpf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new arpf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arpf.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
