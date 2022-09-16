package defpackage;
/* compiled from: PG */
/* renamed from: egw  reason: default package */
/* loaded from: classes3.dex */
public final class egw extends aopi implements aoqv {
    public static final egw a;
    private static volatile aorb n;
    public int b;
    public boolean c;
    public int d = 1380;
    public int e = 300;
    public boolean f = true;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;

    static {
        egw egwVar = new egw();
        a = egwVar;
        aopi.registerDefaultInstance(egw.class, egwVar);
    }

    private egw() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b\nဇ\t\u000bင\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new egw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (egw.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
