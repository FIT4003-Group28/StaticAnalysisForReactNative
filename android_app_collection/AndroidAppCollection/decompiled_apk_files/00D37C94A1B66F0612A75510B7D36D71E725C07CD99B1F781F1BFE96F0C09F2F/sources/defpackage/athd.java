package defpackage;
/* compiled from: PG */
/* renamed from: athd  reason: default package */
/* loaded from: classes2.dex */
public final class athd extends aopi implements aoqv {
    public static final athd a;
    private static volatile aorb t;
    public int b;
    public long c;
    public boolean d;
    public aqwf e;
    public boolean f;
    public aujq g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    private int u;
    private int v;

    static {
        athd athdVar = new athd();
        a = athdVar;
        aopi.registerDefaultInstance(athd.class, athdVar);
    }

    private athd() {
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0003\u0011J\u0011\u0000\u0000\u0000\u0011ဂ\u000f\u0012ဇ\u0010&ဉ *ဇ#1ဉ*3ဇ+4ဇ,7ဇ/:ဇ4;င5<င6Bဇ9Dဇ;Eင<Hဇ:Iဇ?Jဇ@", new Object[]{"u", "b", "v", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "q", "o", "r", "s"});
            case 3:
                return new athd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (athd.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
