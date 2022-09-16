package defpackage;
/* compiled from: PG */
/* renamed from: awuj  reason: default package */
/* loaded from: classes2.dex */
public final class awuj extends aopi implements aoqv {
    public static final awuj a;
    private static volatile aorb v;
    public int b;
    public afkr e;
    public int f;
    public int m;
    public int n;
    public long o;
    public boolean q;
    public afks r;
    public boolean s;
    public awuc t;
    public awuc u;
    public aoqp d = aoqp.a;
    public aoqp h = aoqp.a;
    public aoqp i = aoqp.a;
    public aoqp j = aoqp.a;
    public aoqp k = aoqp.a;
    public aoqp l = aoqp.a;
    public long c = -1;
    public String g = "";
    public String p = "";

    static {
        awuj awujVar = new awuj();
        a = awujVar;
        aopi.registerDefaultInstance(awuj.class, awujVar);
    }

    private awuj() {
    }

    public final aoqp a() {
        aoqp aoqpVar = this.l;
        if (!aoqpVar.b) {
            this.l = aoqpVar.a();
        }
        return this.l;
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0006\u0000\u0000\u0001ဂ\u0000\u00022\u0003ဉ\u0001\u0004င\u0002\u0005ဈ\u0003\u00062\u00072\b2\t2\n2\u000bဌ\u0004\fဌ\u0005\rဂ\u0006\u000eဈ\u0007\u000fဇ\b\u0010ဉ\t\u0011ဇ\n\u0012ဉ\u000b\u0013ဉ\f", new Object[]{"b", "c", "d", awud.a, "e", "f", "g", "h", awuf.a, "i", awug.a, "j", awue.a, "k", awuh.a, "l", awui.a, "m", awan.a(), "n", awan.a(), "o", "p", "q", "r", "s", "t", "u"});
            case 3:
                return new awuj();
            case 4:
                return new aopa((boolean[][][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (awuj.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
