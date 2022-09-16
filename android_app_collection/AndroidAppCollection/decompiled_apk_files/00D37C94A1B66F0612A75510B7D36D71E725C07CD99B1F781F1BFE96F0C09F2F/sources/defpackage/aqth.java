package defpackage;
/* compiled from: PG */
/* renamed from: aqth  reason: default package */
/* loaded from: classes2.dex */
public final class aqth extends aopi implements aoqv {
    public static final aqth a;
    private static volatile aorb g;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public int f;

    static {
        aqth aqthVar = new aqth();
        a = aqthVar;
        aopi.registerDefaultInstance(aqth.class, aqthVar);
    }

    private aqth() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"b", "c", awkk.h, "d", "e", "f"});
            case 3:
                return new aqth();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqth.class) {
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
