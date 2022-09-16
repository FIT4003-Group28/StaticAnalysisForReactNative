package defpackage;
/* compiled from: PG */
/* renamed from: arzt  reason: default package */
/* loaded from: classes2.dex */
public final class arzt extends aopi implements aoqv {
    public static final arzt a;
    private static volatile aorb k;
    public int b;
    public long d;
    public long e;
    public boolean g;
    public boolean h;
    public arzs j;
    public String c = "";
    public String f = "";
    public aoob i = aoob.b;

    static {
        arzt arztVar = new arzt();
        a = arztVar;
        aopi.registerDefaultInstance(arzt.class, arztVar);
    }

    private arzt() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bည\u0006\tဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new arzt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (arzt.class) {
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
