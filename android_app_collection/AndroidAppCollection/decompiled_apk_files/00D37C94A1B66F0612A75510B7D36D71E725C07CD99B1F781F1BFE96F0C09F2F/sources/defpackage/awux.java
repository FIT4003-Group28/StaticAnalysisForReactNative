package defpackage;
/* compiled from: PG */
/* renamed from: awux  reason: default package */
/* loaded from: classes2.dex */
public final class awux extends aopi implements aoqv {
    public static final awux a;
    private static volatile aorb p;
    public int b;
    public aqmf c;
    public long d;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public boolean k;
    public int o;
    public aoqp l = aoqp.a;
    public aoqp m = aoqp.a;
    public aoqp n = aoqp.a;
    public String e = "";

    static {
        awux awuxVar = new awux();
        a = awuxVar;
        aopi.registerDefaultInstance(awux.class, awuxVar);
    }

    private awux() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0003\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဇ\u0006\bဂ\u0007\tဇ\b\n2\u000b2\f2\rင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", awuu.a, "m", awuv.a, "n", awuw.a, "o"});
            case 3:
                return new awux();
            case 4:
                return new aopa((int[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (awux.class) {
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
