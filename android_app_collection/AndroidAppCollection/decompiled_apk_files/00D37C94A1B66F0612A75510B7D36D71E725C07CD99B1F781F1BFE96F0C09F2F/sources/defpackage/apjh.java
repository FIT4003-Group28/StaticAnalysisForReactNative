package defpackage;
/* compiled from: PG */
/* renamed from: apjh  reason: default package */
/* loaded from: classes.dex */
public final class apjh extends aopi implements aoqv {
    public static final apjh a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apjh apjhVar = new apjh();
        a = apjhVar;
        aopi.registerDefaultInstance(apjh.class, apjhVar);
    }

    private apjh() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\uf143ᠤ\uf687㙱\u0007\u0000\u0000\u0007\uf143ᠤᐼ\u0000啕\u1cc9ᐼ\u0000\uf0d1⢇ᐼ\u0000ﵫ⫪ᐼ\u0000\ue0aeヾᐼ\u0000\ufe1f㔺ᐼ\u0000\uf687㙱ᐼ\u0000", new Object[]{"c", "b", aqfa.class, arfe.class, apjf.class, atxr.class, atci.class, apje.class, apjk.class});
            case 3:
                return new apjh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apjh.class) {
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
