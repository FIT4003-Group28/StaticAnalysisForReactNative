package defpackage;
/* compiled from: PG */
/* renamed from: asnr  reason: default package */
/* loaded from: classes2.dex */
public final class asnr extends aopi implements aoqv {
    public static final asnr a;
    private static volatile aorb m;
    public int b;
    public String c = "";
    public String d = "";
    public long e;
    public long f;
    public asnx g;
    public int h;
    public int i;
    public long j;
    public long k;
    public int l;

    static {
        asnr asnrVar = new asnr();
        a = asnrVar;
        aopi.registerDefaultInstance(asnr.class, asnrVar);
    }

    private asnr() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006င\u0005\u0007င\u0006\bဂ\u0007\tဂ\b\nဌ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", asev.r});
            case 3:
                return new asnr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (asnr.class) {
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
