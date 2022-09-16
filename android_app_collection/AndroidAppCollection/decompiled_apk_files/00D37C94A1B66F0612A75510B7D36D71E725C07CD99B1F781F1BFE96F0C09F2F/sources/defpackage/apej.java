package defpackage;
/* compiled from: PG */
/* renamed from: apej  reason: default package */
/* loaded from: classes.dex */
public final class apej extends aopi implements aoqv {
    public static final apej a;
    private static volatile aorb m;
    public int b;
    public apei c;
    public long d;
    public boolean e;
    public boolean f;
    public String g = "";
    public String h = "";
    public boolean i;
    public apek j;
    public boolean k;
    public long l;

    static {
        apej apejVar = new apej();
        a = apejVar;
        aopi.registerDefaultInstance(apej.class, apejVar);
    }

    private apej() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0012\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0005ဇ\u0004\u0006ဇ\u0005\bဈ\u0007\tဈ\b\u000eဇ\f\u000fဉ\r\u0011ဇ\u000e\u0012ဂ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new apej();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (apej.class) {
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
