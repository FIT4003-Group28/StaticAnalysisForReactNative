package defpackage;
/* compiled from: PG */
/* renamed from: arkp  reason: default package */
/* loaded from: classes2.dex */
public final class arkp extends aopi implements aoqv {
    public static final arkp a;
    private static volatile aorb l;
    public int b;
    public aroy c;
    public long e;
    public int f;
    public atyj g;
    public long j;
    public long k;
    private byte m = 2;
    public String d = "";
    public String h = "";
    public String i = "";

    static {
        arkp arkpVar = new arkp();
        a = arkpVar;
        aopi.registerDefaultInstance(arkp.class, arkpVar);
    }

    private arkp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0016\t\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ဈ\u0002\u0003ဂ\u0003\u0004င\u0004\u0005ᐉ\u0005\u0006ဈ\u0006\u000fဈ\u000f\u0010ဃ\u0010\u0016ဂ\u0015", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new arkp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arkp.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
