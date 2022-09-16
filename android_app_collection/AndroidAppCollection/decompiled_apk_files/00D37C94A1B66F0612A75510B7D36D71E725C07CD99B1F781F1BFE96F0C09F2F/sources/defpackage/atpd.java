package defpackage;
/* compiled from: PG */
/* renamed from: atpd  reason: default package */
/* loaded from: classes2.dex */
public final class atpd extends aopi implements aoqv {
    public static final atpd a;
    private static volatile aorb j;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;

    static {
        atpd atpdVar = new atpd();
        a = atpdVar;
        aopi.registerDefaultInstance(atpd.class, atpdVar);
    }

    private atpd() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new atpd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (atpd.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
