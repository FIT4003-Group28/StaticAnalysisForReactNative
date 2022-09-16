package defpackage;
/* compiled from: PG */
/* renamed from: avag  reason: default package */
/* loaded from: classes2.dex */
public final class avag extends aopi implements aoqv {
    public static final avag a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public boolean f;

    static {
        avag avagVar = new avag();
        a = avagVar;
        aopi.registerDefaultInstance(avag.class, avagVar);
    }

    private avag() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", asux.a(), "e", "f"});
            case 3:
                return new avag();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avag.class) {
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
