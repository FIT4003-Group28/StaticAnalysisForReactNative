package defpackage;
/* compiled from: PG */
/* renamed from: apmi  reason: default package */
/* loaded from: classes.dex */
public final class apmi extends aopi implements aoqv {
    public static final apmi a;
    private static volatile aorb h;
    public int b;
    public arhs d;
    public arag f;
    public apmj g;
    private aoux i;
    private byte j = 2;
    public String c = "";
    public String e = "";

    static {
        apmi apmiVar = new apmi();
        a = apmiVar;
        aopi.registerDefaultInstance(apmi.class, apmiVar);
    }

    private apmi() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0003\u0003ဉ\u0004\u0004ᐉ\u0005\u0006ဈ\u0002\u0007ᐉ\u0001", new Object[]{"b", "c", "f", "g", "i", "e", "d"});
            case 3:
                return new apmi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apmi.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
