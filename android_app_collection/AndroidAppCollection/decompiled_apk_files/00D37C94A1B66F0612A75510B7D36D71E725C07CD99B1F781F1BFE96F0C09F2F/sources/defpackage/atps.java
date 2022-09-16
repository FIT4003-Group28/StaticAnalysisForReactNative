package defpackage;
/* compiled from: PG */
/* renamed from: atps  reason: default package */
/* loaded from: classes2.dex */
public final class atps extends aopi implements aoqv {
    public static final atps a;
    private static volatile aorb p;
    public int b;
    public atpr c;
    public boolean d;
    public boolean e;
    public atpo f;
    public apev g;
    public atpn h;
    public atpp i;
    public boolean j;
    public int k;
    public boolean l;
    public atpq m;
    public boolean n;
    public boolean o;

    static {
        atps atpsVar = new atps();
        a = atpsVar;
        aopi.registerDefaultInstance(atps.class, atpsVar);
    }

    private atps() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0004\u001a\r\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဇ\u0004\u0007ဉ\u0006\bဉ\t\tဇ\u0005\nဇ\n\fင\u000b\rဇ\f\u0010ဉ\u0007\u0013ဉ\u000e\u0015ဉ\b\u0019ဇ\u0012\u001aဇ\u0013", new Object[]{"b", "c", "d", "f", "i", "e", "j", "k", "l", "g", "m", "h", "n", "o"});
            case 3:
                return new atps();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (atps.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
