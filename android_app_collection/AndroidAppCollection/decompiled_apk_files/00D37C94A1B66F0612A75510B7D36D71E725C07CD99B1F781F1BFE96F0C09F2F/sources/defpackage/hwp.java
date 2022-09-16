package defpackage;
/* compiled from: PG */
/* renamed from: hwp  reason: default package */
/* loaded from: classes3.dex */
public final class hwp extends aopi implements aoqv {
    public static final hwp a;
    private static volatile aorb s;
    public int b;
    public boolean c;
    public boolean d;
    public long e;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean n;
    public int o;
    public float q;
    public aoqp f = aoqp.a;
    public aoqp p = aoqp.a;
    public aoqp r = aoqp.a;
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        hwp hwpVar = new hwp();
        a = hwpVar;
        aopi.registerDefaultInstance(hwp.class, hwpVar);
    }

    private hwp() {
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
                return newMessageInfo(a, "\u0000\u0011\u0000\u0000\u0001\u0012\u0011\u0003\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\bȈ\tȈ\n\u0007\u000b2\f\u0004\rȈ\u000e\u0004\u000f2\u0010\u0001\u00122", new Object[]{"c", "d", "e", "g", "h", "i", "j", "k", "m", "n", "f", hwo.a, "b", "l", "o", "p", hwn.a, "q", "r", hwm.a});
            case 3:
                return new hwp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (hwp.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
