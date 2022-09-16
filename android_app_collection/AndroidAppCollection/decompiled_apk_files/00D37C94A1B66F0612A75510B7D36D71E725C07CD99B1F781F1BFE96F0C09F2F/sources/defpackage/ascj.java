package defpackage;
/* compiled from: PG */
/* renamed from: ascj  reason: default package */
/* loaded from: classes2.dex */
public final class ascj extends aopi implements aoqv {
    public static final ascj a;
    private static volatile aorb u;
    public int b;
    public int c;
    public int d;
    public int f;
    public ascg h;
    public asci j;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public String t;
    public String e = "";
    public aopq g = emptyIntList();
    public String i = "";
    public aopu k = emptyProtobufList();

    static {
        ascj ascjVar = new ascj();
        a = ascjVar;
        aopi.registerDefaultInstance(ascj.class, ascjVar);
    }

    private ascj() {
        emptyProtobufList();
        this.s = "";
        this.t = "";
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001*\u0012\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0003ဉ\u0005\u0004ဈ\u0006\u0005ဉ\b\u0006\u001b\tဋ\r\nဋ\u000e\u000bဋ\u000f\u0013ဋ\u0012\u0014ဋ\u0013\u0015ဈ\u0014\u0017ဌ\u0004\u001dဌ\u0001\u001f\u001e%ဋ\n&ဇ\t*ဈ\u0016", new Object[]{"b", "c", arpt.r, "e", "h", "i", "j", "k", asci.class, "n", "o", "p", "q", "r", "s", "f", arpt.p, "d", arpt.o, "g", asch.a(), "m", "l", "t"});
            case 3:
                return new ascj();
            case 4:
                return new aopa((char[]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (ascj.class) {
                        aorbVar = u;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            u = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
