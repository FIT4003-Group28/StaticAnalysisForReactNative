package defpackage;
/* compiled from: PG */
/* renamed from: ljp  reason: default package */
/* loaded from: classes3.dex */
public final class ljp extends aopi implements aoqv {
    public static final ljp a;
    private static volatile aorb r;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        ljp ljpVar = new ljp();
        a = ljpVar;
        aopi.registerDefaultInstance(ljp.class, ljpVar);
    }

    private ljp() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\n\u000bဇ\u000b\fဇ\f\rဇ\r\u000eဇ\u000e\u000fဇ\t", new Object[]{"b", "c", awan.a(), "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "l"});
            case 3:
                return new ljp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (ljp.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
