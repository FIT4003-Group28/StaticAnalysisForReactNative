package defpackage;
/* compiled from: PG */
/* renamed from: ashh  reason: default package */
/* loaded from: classes2.dex */
public final class ashh extends aopi implements aoqv {
    public static final ashh a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public awja e;
    public int c = 0;
    private byte g = 2;

    static {
        ashh ashhVar = new ashh();
        a = ashhVar;
        aopi.registerDefaultInstance(ashh.class, ashhVar);
    }

    private ashh() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\uf875ᯧ\ue893끟\b\u0000\u0000\b\uf875ᯧᐼ\u0000\uf437Ἳᐉ\u0007\ue642ⵆᐼ\u0000\ue35f䴂ᐼ\u0000\ued59嶲ᐼ\u0000\uec17巛ᐼ\u0000\uf475慨ᐼ\u0000\ue893끟ᐼ\u0000", new Object[]{"d", "c", "b", awid.class, "e", atec.class, avlq.class, auyp.class, avlr.class, auyo.class, auyg.class});
            case 3:
                return new ashh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ashh.class) {
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
