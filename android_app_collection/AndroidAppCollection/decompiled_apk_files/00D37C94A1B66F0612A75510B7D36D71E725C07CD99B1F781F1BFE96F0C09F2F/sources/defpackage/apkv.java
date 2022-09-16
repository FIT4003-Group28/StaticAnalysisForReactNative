package defpackage;
/* compiled from: PG */
/* renamed from: apkv  reason: default package */
/* loaded from: classes.dex */
public final class apkv extends aopi implements aoqv {
    public static final apkv a;
    private static volatile aorb f;
    public int b;
    public apky c;
    public apkz d;
    public aplb e;

    static {
        apkv apkvVar = new apkv();
        a = apkvVar;
        aopi.registerDefaultInstance(apkv.class, apkvVar);
    }

    private apkv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apkv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apkv.class) {
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
