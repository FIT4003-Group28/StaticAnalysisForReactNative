package defpackage;
/* compiled from: PG */
/* renamed from: atbz  reason: default package */
/* loaded from: classes2.dex */
public final class atbz extends aopi implements aoqv {
    public static final atbz a;
    private static volatile aorb o;
    public int b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public atbf g;
    public boolean h;
    public int i;
    public int j;
    public long k;
    public atbs l;
    public String m = "";
    public long n;

    static {
        atbz atbzVar = new atbz();
        a = atbzVar;
        aopi.registerDefaultInstance(atbz.class, atbzVar);
    }

    private atbz() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002\u0004ဂ\u0003\u0006ဇ\u0005\u0007ဉ\u0006\bဇ\u0007\tဌ\b\nင\t\fဂ\u000b\rဉ\f\u000eဈ\r\u000fဂ\u000e", new Object[]{"b", "c", atck.n, "d", atck.e, "e", "f", "g", "h", "i", atcv.a(), "j", "k", "l", "m", "n"});
            case 3:
                return new atbz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (atbz.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
