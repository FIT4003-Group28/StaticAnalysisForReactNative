package defpackage;
/* compiled from: PG */
/* renamed from: atst  reason: default package */
/* loaded from: classes2.dex */
public final class atst extends aopi implements aoqv {
    public static final atst a;
    public static final aopg b;
    private static volatile aorb m;
    public int c;
    public int e;
    public long f;
    public atqu h;
    public long i;
    public atqt j;
    public String d = "";
    public aoob g = aoob.b;
    public String k = "";
    public String l = "";

    static {
        atst atstVar = new atst();
        a = atstVar;
        aopi.registerDefaultInstance(atst.class, atstVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, atstVar, atstVar, null, 130, aosj.MESSAGE, atst.class);
    }

    private atst() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ည\u0003\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b", new Object[]{"c", "d", "e", atsp.a(), "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new atst();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atst.class) {
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
