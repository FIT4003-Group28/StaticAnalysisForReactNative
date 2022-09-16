package defpackage;
/* compiled from: PG */
/* renamed from: arlq  reason: default package */
/* loaded from: classes2.dex */
public final class arlq extends aopi implements aoqv {
    public static final arlq a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arlq arlqVar = new arlq();
        a = arlqVar;
        aopi.registerDefaultInstance(arlq.class, arlqVar);
    }

    private arlq() {
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
                return newMessageInfo(a, "\u0001#\u0001\u0000\uf321Ẑ\ue1c0ꉹ#\u0000\u0000#\uf321Ẑᐼ\u0000\uf26a⤒ᐼ\u0000\ue607⨅ᐼ\u0000\uf88a\u2cf8ᐼ\u0000\uefcf⸵ᐼ\u0000￣⺒ᐼ\u0000\uec67むᐼ\u0000突ハᐼ\u0000\uf3fbヺᐼ\u0000\uf1ca㟄ᐼ\u0000\ue422㢒ᐼ\u0000\ufddd㢧ᐼ\u0000\uf5a4㧕ᐼ\u0000︍㧬ᐼ\u0000︊㾮ᐼ\u0000\ue9e9䅮ᐼ\u0000\ue621䊃ᐼ\u0000ﲸ䍖ᐼ\u0000\ue8cb䔆ᐼ\u0000\ue493䣤ᐼ\u0000\ueb41䣥ᐼ\u0000\uf492䤳ᐼ\u0000\ueb17䪝ᐼ\u0000\uf2cb䬘ᐼ\u0000\ue684䭌ᐼ\u0000\ue923䶡ᐼ\u0000\ue8a1勇ᐼ\u0000ￗ勋ᐼ\u0000\ue60b囤ᐼ\u0000\uf175援ᐼ\u0000\ueb32棪ᐼ\u0000\ue860瞦ᐼ\u0000\uf396薼ᐼ\u0000\uf153詬ᐼ\u0000\ue1c0ꉹᐼ\u0000", new Object[]{"c", "b", aqft.class, asku.class, avvh.class, atkl.class, atds.class, aqyz.class, avlm.class, aqmt.class, argj.class, aqwy.class, avjp.class, askm.class, avfz.class, avqn.class, avqp.class, aqyq.class, avsf.class, avsr.class, avrh.class, avsg.class, avjf.class, aqtb.class, avoi.class, avoj.class, avpw.class, arbg.class, avsm.class, avqh.class, apzj.class, atlb.class, avpk.class, avrf.class, avse.class, avrp.class, aqge.class});
            case 3:
                return new arlq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arlq.class) {
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
