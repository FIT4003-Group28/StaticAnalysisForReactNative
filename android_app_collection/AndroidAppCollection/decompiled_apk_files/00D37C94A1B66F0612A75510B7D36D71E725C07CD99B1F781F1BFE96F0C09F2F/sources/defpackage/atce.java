package defpackage;
/* compiled from: PG */
/* renamed from: atce  reason: default package */
/* loaded from: classes2.dex */
public final class atce extends aopi implements aoqv {
    public static final atce a;
    private static volatile aorb m;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public atbf f;
    public boolean g;
    public int h;
    public atbs i;
    public String j = "";
    public long k;
    public atbs l;

    static {
        atce atceVar = new atce();
        a = atceVar;
        aopi.registerDefaultInstance(atce.class, atceVar);
    }

    private atce() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0007ဌ\u0006\bဉ\u0007\tဈ\b\nဂ\t\u000bဉ\n", new Object[]{"b", "c", atck.n, "d", atck.e, "e", "f", "g", "h", atcw.a(), "i", "j", "k", "l"});
            case 3:
                return new atce();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atce.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
