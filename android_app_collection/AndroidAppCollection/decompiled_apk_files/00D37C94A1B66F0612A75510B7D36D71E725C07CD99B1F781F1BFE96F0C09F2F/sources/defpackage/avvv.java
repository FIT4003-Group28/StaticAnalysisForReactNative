package defpackage;
/* compiled from: PG */
/* renamed from: avvv  reason: default package */
/* loaded from: classes2.dex */
public final class avvv extends aopi implements aoqv {
    public static final avvv a;
    private static volatile aorb e;
    public avhn d;
    private int f;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        avvv avvvVar = new avvv();
        a = avvvVar;
        aopi.registerDefaultInstance(avvv.class, avvvVar);
    }

    private avvv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new avvv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avvv.class) {
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
