package defpackage;
/* compiled from: PG */
/* renamed from: aqtp  reason: default package */
/* loaded from: classes2.dex */
public final class aqtp extends aopi implements aoqv {
    public static final aqtp a;
    private static volatile aorb n;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        aqtp aqtpVar = new aqtp();
        a = aqtpVar;
        aopi.registerDefaultInstance(aqtp.class, aqtpVar);
    }

    private aqtp() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\b\u001d\u000b\u0000\u0000\u0000\bဇ\u0003\u000bဇ\u0005\u0014ဇ\r\u0015ဇ\u000e\u0016ဇ\u000f\u0017ဂ\u0010\u0018ဇ\u0011\u0019ဇ\u0012\u001bဇ\u0014\u001cဇ\u0015\u001dဇ\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new aqtp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aqtp.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
