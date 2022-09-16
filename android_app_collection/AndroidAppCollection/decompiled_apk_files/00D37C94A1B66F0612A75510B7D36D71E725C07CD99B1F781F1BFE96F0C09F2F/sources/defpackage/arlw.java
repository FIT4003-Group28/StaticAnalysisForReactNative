package defpackage;
/* compiled from: PG */
/* renamed from: arlw  reason: default package */
/* loaded from: classes2.dex */
public final class arlw extends aopi implements aoqv {
    public static final arlw a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arlw arlwVar = new arlw();
        a = arlwVar;
        aopi.registerDefaultInstance(arlw.class, arlwVar);
    }

    private arlw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uea3aᮽ\uf091ẙ\u0003\u0000\u0000\u0003\uea3aᮽᐼ\u0000ﻠᶘᐼ\u0000\uf091ẙᐼ\u0000", new Object[]{"c", "b", avfo.class, avfi.class, avfj.class});
            case 3:
                return new arlw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arlw.class) {
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
