package defpackage;
/* compiled from: PG */
/* renamed from: atqi  reason: default package */
/* loaded from: classes2.dex */
public final class atqi extends aopi implements aoqv {
    public static final atqi a;
    private static volatile aorb r;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public auzn q;

    static {
        atqi atqiVar = new atqi();
        a = atqiVar;
        aopi.registerDefaultInstance(atqi.class, atqiVar);
    }

    private atqi() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဋ\u0002\u0004ဂ\u0004\u0005ဌ\u0005\u0006ဌ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\u000bဇ\u000b\u0010ဂ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014ဉ\u0012\u0015ဂ\u0003", new Object[]{"b", "c", "d", atov.h, "e", "g", "h", attl.a(), "i", atqy.d, "j", "k", "l", "m", "n", "o", "p", "q", "f"});
            case 3:
                return new atqi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (atqi.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
