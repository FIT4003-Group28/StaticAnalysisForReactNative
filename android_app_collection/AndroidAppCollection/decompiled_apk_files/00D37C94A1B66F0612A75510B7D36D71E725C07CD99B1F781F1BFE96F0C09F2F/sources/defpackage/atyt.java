package defpackage;
/* compiled from: PG */
/* renamed from: atyt  reason: default package */
/* loaded from: classes2.dex */
public final class atyt extends aopi implements aoqv {
    public static final atyt a;
    private static volatile aorb k;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public atys f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    static {
        atyt atytVar = new atyt();
        a = atytVar;
        aopi.registerDefaultInstance(atyt.class, atytVar);
    }

    private atyt() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", atti.o, "h", atti.p, "i", "j"});
            case 3:
                return new atyt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (atyt.class) {
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
