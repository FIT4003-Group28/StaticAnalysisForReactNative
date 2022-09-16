package defpackage;
/* compiled from: PG */
/* renamed from: apkn  reason: default package */
/* loaded from: classes.dex */
public final class apkn extends aopi implements aoqv {
    public static final apkn a;
    private static volatile aorb c;
    private Object d;
    public int b = 0;
    private byte e = 2;

    static {
        apkn apknVar = new apkn();
        a = apknVar;
        aopi.registerDefaultInstance(apkn.class, apknVar);
    }

    private apkn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ued3b䂎\uf7f0남\u0003\u0000\u0000\u0002\ued3b䂎ြ\u0000\ue469䑺ᐼ\u0000\uf7f0남ᐼ\u0000", new Object[]{"d", "b", apkm.class, apko.class, apkp.class});
            case 3:
                return new apkn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apkn.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
