package defpackage;
/* compiled from: PG */
/* renamed from: avyu  reason: default package */
/* loaded from: classes2.dex */
public final class avyu extends aopi implements aoqv {
    public static final avyu a;
    private static volatile aorb l;
    public int b;
    public long g;
    public long h;
    public int i;
    public avhn j;
    public int k;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        avyu avyuVar = new avyu();
        a = avyuVar;
        aopi.registerDefaultInstance(avyu.class, avyuVar);
    }

    private avyu() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဃ\u0004\u0006ဃ\u0005\u0007င\u0006\bᐉ\u0007\tင\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new avyu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (avyu.class) {
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
