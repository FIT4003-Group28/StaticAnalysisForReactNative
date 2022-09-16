package defpackage;
/* compiled from: PG */
/* renamed from: apjg  reason: default package */
/* loaded from: classes.dex */
public final class apjg extends aopi implements aoqv {
    public static final apjg a;
    private static volatile aorb b;
    private int c;
    private atxr d;
    private byte e = 2;

    static {
        apjg apjgVar = new apjg();
        a = apjgVar;
        aopi.registerDefaultInstance(apjg.class, apjgVar);
    }

    private apjg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001ﵫ⫪ﵫ⫪\u0001\u0000\u0000\u0001ﵫ⫪ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new apjg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apjg.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
