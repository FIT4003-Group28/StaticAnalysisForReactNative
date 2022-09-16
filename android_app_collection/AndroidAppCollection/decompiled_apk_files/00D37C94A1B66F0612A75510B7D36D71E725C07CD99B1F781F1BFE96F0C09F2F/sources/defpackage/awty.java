package defpackage;
/* compiled from: PG */
/* renamed from: awty  reason: default package */
/* loaded from: classes2.dex */
public final class awty extends aopi implements aoqv {
    public static final awty a;
    private static volatile aorb n;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int j;
    public long k;
    public long l;
    public String g = "";
    public String h = "";
    public String i = "";
    public String m = "";

    static {
        awty awtyVar = new awty();
        a = awtyVar;
        aopi.registerDefaultInstance(awty.class, awtyVar);
    }

    private awty() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဈ\u0005\bဈ\u0007\tဈ\b\nင\t\u000bဂ\n\fဂ\u000b\rဈ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new awty();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (awty.class) {
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
