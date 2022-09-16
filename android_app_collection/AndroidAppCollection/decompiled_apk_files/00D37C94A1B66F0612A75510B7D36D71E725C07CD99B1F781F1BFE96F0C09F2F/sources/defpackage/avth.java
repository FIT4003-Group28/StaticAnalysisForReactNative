package defpackage;
/* compiled from: PG */
/* renamed from: avth  reason: default package */
/* loaded from: classes2.dex */
public final class avth extends aopi implements aoqv {
    public static final avth a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;

    static {
        avth avthVar = new avth();
        a = avthVar;
        aopi.registerDefaultInstance(avth.class, avthVar);
    }

    private avth() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new avth();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avth.class) {
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
