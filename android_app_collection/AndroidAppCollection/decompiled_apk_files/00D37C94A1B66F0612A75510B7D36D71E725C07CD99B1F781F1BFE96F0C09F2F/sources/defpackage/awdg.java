package defpackage;
/* compiled from: PG */
/* renamed from: awdg  reason: default package */
/* loaded from: classes2.dex */
public final class awdg extends aopi implements aoqv {
    public static final awdg a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awdg awdgVar = new awdg();
        a = awdgVar;
        aopi.registerDefaultInstance(awdg.class, awdgVar);
    }

    private awdg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf3bf៓\ue0ef㽪\u0004\u0000\u0000\u0004\uf3bf៓ᐼ\u0000ﱬ៓ᐼ\u0000\uea0c㪃ᐼ\u0000\ue0ef㽪ᐼ\u0000", new Object[]{"c", "b", awdh.class, awdz.class, awdk.class, auyx.class});
            case 3:
                return new awdg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awdg.class) {
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
