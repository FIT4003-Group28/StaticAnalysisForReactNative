package defpackage;
/* compiled from: PG */
/* renamed from: askd */
/* loaded from: classes2.dex */
public final class askd extends aopi implements aoqv {
    public static final askd a;
    private static volatile aorb m;
    public int b;
    public long c;
    public long d;
    public float f;
    public long g;
    public boolean i;
    public boolean j;
    public boolean k;
    private boolean n;
    private boolean o;
    public String e = "";
    public String h = "";
    public String l = "";

    static {
        askd askdVar = new askd();
        a = askdVar;
        aopi.registerDefaultInstance(askd.class, askdVar);
    }

    private askd() {
    }

    public static /* synthetic */ void a(askd askdVar) {
        askdVar.b |= 1;
        askdVar.n = true;
    }

    public static /* synthetic */ void b(askd askdVar) {
        askdVar.b |= 2;
        askdVar.o = true;
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bဈ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဈ\r", new Object[]{"b", "n", "o", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new askd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (askd.class) {
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
