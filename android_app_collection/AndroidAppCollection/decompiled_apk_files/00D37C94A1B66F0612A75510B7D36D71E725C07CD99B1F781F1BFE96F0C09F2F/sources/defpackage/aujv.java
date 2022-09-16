package defpackage;
/* compiled from: PG */
/* renamed from: aujv  reason: default package */
/* loaded from: classes2.dex */
public final class aujv extends aopi implements aoqv {
    private static volatile aorb F;
    public static final aopr a = new asvu(8);
    public static final aujv b;
    public boolean A;
    public boolean B;
    public apgr C;
    public aopq D;
    public boolean E;
    private int G;
    public int c;
    public boolean d;
    public boolean e;
    public aswi f;
    public int g;
    public int h;
    public boolean i;
    public boolean k;
    public boolean m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public float t;
    public int u;
    public float v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;
    public String j = "";
    public String l = "";

    static {
        aujv aujvVar = new aujv();
        b = aujvVar;
        aopi.registerDefaultInstance(aujv.class, aujvVar);
    }

    private aujv() {
        emptyIntList();
        this.D = emptyIntList();
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
                return newMessageInfo(b, "\u0001\u001c\u0000\u0002\u0001(\u001c\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0005ဌ\u0004\u0007င\u0006\bဇ\u0007\tဈ\b\nဇ\t\u000bဈ\n\u000eဇ\r\u000fင\u000e\u0010င\u000f\u0011ဇ\u0010\u0014ဇ\u0013\u0015ဇ\u0014\u0016င\u0015\u0017ခ\u0016\u0018င\u0017\u0019ခ\u0018\u001aင\u0019\u001bဇ\u001a\u001cဇ\u001b\u001dဇ\u001c\u001fဇ\u001e ဇ\u001f%ဉ#'\u001e(ဇ%", new Object[]{"c", "G", "d", "e", "f", "g", apvq.i, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", auju.a(), "E"});
            case 3:
                return new aujv();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = F;
                if (aorbVar == null) {
                    synchronized (aujv.class) {
                        aorbVar = F;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
                            F = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
