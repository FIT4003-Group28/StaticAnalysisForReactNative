package defpackage;
/* compiled from: PG */
/* renamed from: angq  reason: default package */
/* loaded from: classes.dex */
public final class angq extends aopi implements aoqv {
    public static final angq a;
    private static volatile aorb k;
    public int b;
    public int c;
    public int e;
    public boolean g;
    public long h;
    public long i;
    public String d = "";
    public String f = "";
    public String j = "";

    static {
        angq angqVar = new angq();
        a = angqVar;
        aopi.registerDefaultInstance(angq.class, angqVar);
    }

    private angq() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\bဂ\u0007\tဈ\b", new Object[]{"b", "c", anfo.b, "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new angq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (angq.class) {
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
