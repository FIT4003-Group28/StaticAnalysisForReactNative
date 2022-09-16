package defpackage;
/* compiled from: PG */
/* renamed from: asac  reason: default package */
/* loaded from: classes2.dex */
public final class asac extends aopi implements aoqv {
    public static final asac a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asac asacVar = new asac();
        a = asacVar;
        aopi.registerDefaultInstance(asac.class, asacVar);
    }

    private asac() {
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
                return newMessageInfo(a, "\u0001\n\u0001\u0000\ue18fᝊ\ueffb냧\n\u0000\u0000\t\ue18fᝊᐼ\u0000ﮱ᪢ြ\u0000\ue67dḘᐼ\u0000\ue62eḠᐼ\u0000\ue5be⡱ᐼ\u0000\ue63d⨕ᐼ\u0000\ue162⪂ᐼ\u0000\uedf4⺙ᐼ\u0000\uec93怉ᐼ\u0000\ueffb냧ᐼ\u0000", new Object[]{"c", "b", awbt.class, auah.class, asae.class, avwc.class, aoyb.class, aoyw.class, apax.class, aozs.class, aozd.class, aoyd.class});
            case 3:
                return new asac();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asac.class) {
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
