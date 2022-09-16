package defpackage;
/* compiled from: PG */
/* renamed from: atfr  reason: default package */
/* loaded from: classes2.dex */
public final class atfr extends aopi implements aoqv {
    public static final atfr a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atfr atfrVar = new atfr();
        a = atfrVar;
        aopi.registerDefaultInstance(atfr.class, atfrVar);
    }

    private atfr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf716⇿\uf3ee鋽\u0005\u0000\u0000\u0005\uf716⇿ᐼ\u0000\uec16㈰ᐼ\u0000\ueb3c刈ᐼ\u0000ﱡ扃ᐼ\u0000\uf3ee鋽ᐼ\u0000", new Object[]{"c", "b", atfq.class, atfs.class, atfp.class, atfu.class, atfn.class});
            case 3:
                return new atfr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atfr.class) {
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
