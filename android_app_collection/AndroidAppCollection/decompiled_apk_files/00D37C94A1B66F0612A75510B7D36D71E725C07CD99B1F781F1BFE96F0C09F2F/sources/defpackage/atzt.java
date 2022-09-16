package defpackage;
/* compiled from: PG */
/* renamed from: atzt  reason: default package */
/* loaded from: classes2.dex */
public final class atzt extends aopi implements aoqv {
    public static final atzt a;
    private static volatile aorb w;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public apgy p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    private int x;
    private int y;

    static {
        atzt atztVar = new atzt();
        a = atztVar;
        aopi.registerDefaultInstance(atzt.class, atztVar);
    }

    private atzt() {
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0002\u0002\uf119觉\u0015\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\tဇ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0012ဂ\u0011\u0019င\u0016\u001fဇ\u001c ဇ\u001d$ဇ )ဇ$.ဇ)/ဇ*1ဇ,7ဇ2?ဇ9@ဇ:\uf119觉ဉ&", new Object[]{"x", "y", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "q", "r", "s", "t", "u", "v", "p"});
            case 3:
                return new atzt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (atzt.class) {
                        aorbVar = w;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            w = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
