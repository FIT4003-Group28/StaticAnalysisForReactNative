package defpackage;
/* compiled from: PG */
/* renamed from: tqm  reason: default package */
/* loaded from: classes4.dex */
public final class tqm extends aopi implements aoqv {
    public static final tqm a;
    private static volatile aorb u;
    public int b;
    public tql c;
    public int f;
    public aono g;
    public aono h;
    public int i;
    public long j;
    public long k;
    public tqp l;
    public boolean m;
    public int o;
    public int q;
    public long r;
    public String d = "";
    public String e = "";
    public aopu n = emptyProtobufList();
    public aopu p = emptyProtobufList();
    public String s = "";
    public aopu t = aopi.emptyProtobufList();

    static {
        tqm tqmVar = new tqm();
        a = tqmVar;
        aopi.registerDefaultInstance(tqm.class, tqmVar);
    }

    private tqm() {
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001年皤\u0012\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\b\u0006ဈ\u0002\nင\u0003\u000bဂ\t\fဌ\u0007\rဉ\n\u000eဇ\u000b\u0010င\f\u0011\u001b\u0013ဌ\r\u0014ဉ\u0004\u0017ဂ\u000e\u0019\u001a\u001aဈ\u000f\u001bဉ\u0005年皤ဉ\u0000", new Object[]{"b", "d", "n", tqk.class, "j", "e", "f", "k", "i", sml.n, "l", "m", "o", "p", tqq.class, "q", sml.t, "g", "r", "t", "s", "h", "c"});
            case 3:
                return new tqm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (tqm.class) {
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
