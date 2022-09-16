package defpackage;
/* compiled from: PG */
/* renamed from: asrl  reason: default package */
/* loaded from: classes2.dex */
public final class asrl extends aopi implements aoqv {
    public static final asrl a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asrl asrlVar = new asrl();
        a = asrlVar;
        aopi.registerDefaultInstance(asrl.class, asrlVar);
    }

    private asrl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000ﱃ\u196fＶ䊽\u0002\u0000\u0000\u0002ﱃ\u196fᐼ\u0000Ｖ䊽ᐼ\u0000", new Object[]{"c", "b", aqmu.class, asqn.class});
            case 3:
                return new asrl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asrl.class) {
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
