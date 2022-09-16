package defpackage;
/* compiled from: PG */
/* renamed from: arnv  reason: default package */
/* loaded from: classes2.dex */
public final class arnv extends aopi implements aoqv {
    public static final arnv a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public aroy e;
    private arob j;
    public int c = 0;
    private byte k = 2;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        arnv arnvVar = new arnv();
        a = arnvVar;
        aopi.registerDefaultInstance(arnv.class, arnvVar);
    }

    private arnv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ြ\u0000\u0007ြ\u0000\bᐉ\u0007", new Object[]{"d", "c", "b", "e", "f", "g", "h", arnk.class, arnl.class, "j"});
            case 3:
                return new arnv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arnv.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
