package defpackage;
/* compiled from: PG */
/* renamed from: zqz  reason: default package */
/* loaded from: classes4.dex */
public final class zqz extends aopi implements aoqv {
    public static final zqz a;
    private static volatile aorb f;
    public int b;
    public int d;
    public int e;
    private byte g = 2;
    public String c = "";

    static {
        zqz zqzVar = new zqz();
        a = zqzVar;
        aopi.registerDefaultInstance(zqz.class, zqzVar);
    }

    private zqz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new zqz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (zqz.class) {
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
