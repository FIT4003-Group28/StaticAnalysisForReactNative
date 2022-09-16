package defpackage;
/* compiled from: PG */
/* renamed from: apkx  reason: default package */
/* loaded from: classes.dex */
public final class apkx extends aopi implements aoqv {
    public static final apkx a;
    private static volatile aorb h;
    public int b;
    public apkw c;
    public boolean d;
    public apla e;
    public apkv f;
    public String g = "";

    static {
        apkx apkxVar = new apkx();
        a = apkxVar;
        aopi.registerDefaultInstance(apkx.class, apkxVar);
    }

    private apkx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new apkx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apkx.class) {
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
