package defpackage;
/* compiled from: PG */
/* renamed from: atby  reason: default package */
/* loaded from: classes2.dex */
public final class atby extends aopi implements aoqv {
    public static final atby a;
    private static volatile aorb n;
    public int b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public atbf g;
    public boolean h;
    public int i;
    public atbs j;
    public String k = "";
    public long l;
    public atbs m;

    static {
        atby atbyVar = new atby();
        a = atbyVar;
        aopi.registerDefaultInstance(atby.class, atbyVar);
    }

    private atby() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\bဌ\u0007\tဉ\b\nဈ\t\u000bဂ\n\fဉ\u000b", new Object[]{"b", "c", atck.n, "d", atck.e, "e", "f", "g", "h", "i", atcw.a(), "j", "k", "l", "m"});
            case 3:
                return new atby();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (atby.class) {
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
