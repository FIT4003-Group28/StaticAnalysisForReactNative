package defpackage;
/* compiled from: PG */
/* renamed from: arzz  reason: default package */
/* loaded from: classes2.dex */
public final class arzz extends aopi implements aoqv {
    public static final arzz a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arzz arzzVar = new arzz();
        a = arzzVar;
        aopi.registerDefaultInstance(arzz.class, arzzVar);
    }

    private arzz() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\uf364ᯓ\ue2df\ua7cb\t\u0000\u0000\b\uf364ᯓᐼ\u0000\uf321Ẑᐼ\u0000\ue80fỌᐼ\u0000\uf767≎ᐼ\u0000\ue94e⋬ᐼ\u0000\ue22b⤖ᐼ\u0000\uf811\u2b8eᐼ\u0000\uf2ec槅ြ\u0000\ue2df\ua7cbᐼ\u0000", new Object[]{"c", "b", auad.class, aqft.class, auaj.class, auak.class, auag.class, awiz.class, aubw.class, apqn.class, auac.class});
            case 3:
                return new arzz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arzz.class) {
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
