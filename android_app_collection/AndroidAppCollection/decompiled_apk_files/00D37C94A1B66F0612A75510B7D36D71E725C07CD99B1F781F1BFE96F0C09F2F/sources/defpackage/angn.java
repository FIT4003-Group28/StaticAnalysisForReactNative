package defpackage;
/* compiled from: PG */
/* renamed from: angn  reason: default package */
/* loaded from: classes.dex */
public final class angn extends aopi implements aoqv {
    public static final angn a;
    private static volatile aorb j;
    public int b;
    public int d;
    public int f;
    public boolean g;
    public long h;
    public String c = "";
    public String e = "";
    public String i = "";

    static {
        angn angnVar = new angn();
        a = angnVar;
        aopi.registerDefaultInstance(angn.class, angnVar);
    }

    private angn() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new angn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (angn.class) {
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
