package defpackage;
/* compiled from: PG */
/* renamed from: asxc  reason: default package */
/* loaded from: classes2.dex */
public final class asxc extends aopi implements aoqv {
    public static final asxc a;
    private static volatile aorb f;
    public int b;
    public String d;
    public aswy e;
    private byte g = 2;
    public String c = "";

    static {
        asxc asxcVar = new asxc();
        a = asxcVar;
        aopi.registerDefaultInstance(asxc.class, asxcVar);
    }

    private asxc() {
        aoob aoobVar = aoob.b;
        this.d = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asxc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asxc.class) {
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
