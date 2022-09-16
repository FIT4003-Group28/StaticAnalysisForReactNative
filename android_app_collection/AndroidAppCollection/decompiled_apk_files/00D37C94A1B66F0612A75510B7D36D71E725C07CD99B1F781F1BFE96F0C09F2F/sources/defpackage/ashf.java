package defpackage;
/* compiled from: PG */
/* renamed from: ashf  reason: default package */
/* loaded from: classes2.dex */
public final class ashf extends aopi implements aoqv {
    public static final ashf a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ashf ashfVar = new ashf();
        a = ashfVar;
        aopi.registerDefaultInstance(ashf.class, ashfVar);
    }

    private ashf() {
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
                return newMessageInfo(a, "\u0001\u000f\u0001\u0000\ue32bᯋﻗ恡\u000f\u0000\u0000\u000f\ue32bᯋᐼ\u0000\ue9fd᷆ᐼ\u0000\uf321Ẑᐼ\u0000\uf092Ἂᐼ\u0000\uf437Ἳᐼ\u0000\uf26a⤒ᐼ\u0000\uf88a\u2cf8ᐼ\u0000\uec26ⷙᐼ\u0000\uefcf⸵ᐼ\u0000\uf28f㲟ᐼ\u0000\ue91b㲾ᐼ\u0000\ue923䶡ᐼ\u0000\ue611媯ᐼ\u0000\ueb32彣ᐼ\u0000ﻗ恡ᐼ\u0000", new Object[]{"c", "b", awil.class, awim.class, aqft.class, awin.class, awja.class, asku.class, atkl.class, atee.class, atds.class, awjc.class, avns.class, arbg.class, asuz.class, aqna.class, auye.class});
            case 3:
                return new ashf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ashf.class) {
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
