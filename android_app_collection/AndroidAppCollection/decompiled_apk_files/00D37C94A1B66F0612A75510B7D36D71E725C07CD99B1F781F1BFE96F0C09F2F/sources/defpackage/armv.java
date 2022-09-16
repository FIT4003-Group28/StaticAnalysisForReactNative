package defpackage;
/* compiled from: PG */
/* renamed from: armv  reason: default package */
/* loaded from: classes2.dex */
public final class armv extends aopi implements aoqv {
    public static final armv a;
    private static volatile aorb e;
    public int b;
    public aroy c;
    public String d;
    private byte f = 2;

    static {
        armv armvVar = new armv();
        a = armvVar;
        aopi.registerDefaultInstance(armv.class, armvVar);
    }

    private armv() {
        aoob aoobVar = aoob.b;
        this.d = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new armv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (armv.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
