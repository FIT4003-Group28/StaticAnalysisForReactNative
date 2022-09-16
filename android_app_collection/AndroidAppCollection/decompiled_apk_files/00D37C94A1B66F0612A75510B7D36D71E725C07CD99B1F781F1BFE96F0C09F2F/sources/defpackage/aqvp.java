package defpackage;
/* compiled from: PG */
/* renamed from: aqvp  reason: default package */
/* loaded from: classes2.dex */
public final class aqvp extends aopi implements aoqv {
    public static final aqvp a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqvp aqvpVar = new aqvp();
        a = aqvpVar;
        aopi.registerDefaultInstance(aqvp.class, aqvpVar);
    }

    private aqvp() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\uf158ᠤ\uf0a1遆\u0006\u0000\u0000\u0006\uf158ᠤᐼ\u0000ﳌ䈠ᐼ\u0000\ueb1b堗ᐼ\u0000\uf346峋ᐼ\u0000\ue9af峽ᐼ\u0000\uf0a1遆ᐼ\u0000", new Object[]{"c", "b", audg.class, aqvs.class, apdp.class, apdo.class, apdm.class, aviz.class});
            case 3:
                return new aqvp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqvp.class) {
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
