package defpackage;
/* compiled from: PG */
/* renamed from: arkr  reason: default package */
/* loaded from: classes2.dex */
public final class arkr extends aopi implements aoqv {
    public static final arkr a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arkr arkrVar = new arkr();
        a = arkrVar;
        aopi.registerDefaultInstance(arkr.class, arkrVar);
    }

    private arkr() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\uf61f༩\uec93怉\t\u0000\u0000\u0007\uf61f༩ြ\u0000\ue18fᝊᐼ\u0000ﵡᵙᐼ\u0000\ue67dḘᐼ\u0000\ue5be⡱ᐼ\u0000諾⡱ြ\u0000\uf09c⢠ᐼ\u0000\ueb1d䃦ᐼ\u0000\uec93怉ᐼ\u0000", new Object[]{"c", "b", avwd.class, awbt.class, avwu.class, asae.class, aoyb.class, aqzm.class, avcu.class, aozi.class, aozd.class});
            case 3:
                return new arkr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arkr.class) {
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
