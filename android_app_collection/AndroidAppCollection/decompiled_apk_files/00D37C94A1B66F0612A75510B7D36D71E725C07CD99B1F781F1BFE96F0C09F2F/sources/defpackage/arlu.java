package defpackage;
/* compiled from: PG */
/* renamed from: arlu  reason: default package */
/* loaded from: classes2.dex */
public final class arlu extends aopi implements aoqv {
    public static final arlu a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arlu arluVar = new arlu();
        a = arluVar;
        aopi.registerDefaultInstance(arlu.class, arluVar);
    }

    private arlu() {
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
                return newMessageInfo(a, "\u0001\u0013\u0001\u0000\ue7f5ណ\ue559\ua63e\u0013\u0000\u0000\u0013\ue7f5ណᐼ\u0000\uf597ᣚᐼ\u0000\ue9fdᮽᐼ\u0000\ue592᯦ᐼ\u0000\uece4Ỽᐼ\u0000\uf11e⠗ᐼ\u0000\uebb5ⴛᐼ\u0000\uf3f6㑄ᐼ\u0000\ue422㢒ᐼ\u0000\uf5a4㧕ᐼ\u0000ﲿ䘟ᐼ\u0000\uf59d䫛ᐼ\u0000\ue214佨ᐼ\u0000\uef90勀ᐼ\u0000\uf812憡ᐼ\u0000\uf175援ᐼ\u0000\ue12e睴ᐼ\u0000ﱿ銹ᐼ\u0000\ue559\ua63eᐼ\u0000", new Object[]{"c", "b", auqh.class, armd.class, armc.class, atfa.class, arlz.class, aqwh.class, aqxt.class, avjk.class, avjp.class, avfz.class, avlb.class, atmq.class, asmu.class, atmp.class, aqjr.class, atlb.class, avqz.class, atdt.class, asvg.class});
            case 3:
                return new arlu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arlu.class) {
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
