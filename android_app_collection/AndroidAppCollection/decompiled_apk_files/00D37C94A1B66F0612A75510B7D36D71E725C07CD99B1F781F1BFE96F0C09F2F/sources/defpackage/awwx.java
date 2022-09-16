package defpackage;
/* compiled from: PG */
/* renamed from: awwx  reason: default package */
/* loaded from: classes2.dex */
public final class awwx extends aopi implements aoqv {
    public static final awwx a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public int c = 0;
    private byte g = 2;
    public String e = "";

    static {
        awwx awwxVar = new awwx();
        a = awwxVar;
        aopi.registerDefaultInstance(awwx.class, awwxVar);
    }

    private awwx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000\bြ\u0000", new Object[]{"d", "c", "b", "e", awwt.class, awwr.class, awwq.class, awww.class, awwu.class, awwv.class, awws.class});
            case 3:
                return new awwx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awwx.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
