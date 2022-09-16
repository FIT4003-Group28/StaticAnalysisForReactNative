package defpackage;
/* compiled from: PG */
/* renamed from: apkd  reason: default package */
/* loaded from: classes.dex */
public final class apkd extends aopi implements aoqv {
    public static final apkd a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apkd apkdVar = new apkd();
        a = apkdVar;
        aopi.registerDefaultInstance(apkd.class, apkdVar);
    }

    private apkd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueb11ἑ\uf2c2꒨\u0002\u0000\u0000\u0002\ueb11ἑᐼ\u0000\uf2c2꒨ᐼ\u0000", new Object[]{"c", "b", apoj.class, apoo.class});
            case 3:
                return new apkd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apkd.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
