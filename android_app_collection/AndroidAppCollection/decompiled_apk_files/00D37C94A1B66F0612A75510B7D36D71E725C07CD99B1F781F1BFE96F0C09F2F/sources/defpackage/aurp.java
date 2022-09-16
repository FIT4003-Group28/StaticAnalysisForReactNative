package defpackage;
/* compiled from: PG */
/* renamed from: aurp  reason: default package */
/* loaded from: classes2.dex */
public final class aurp extends aopi implements aoqv {
    public static final aurp a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aurp aurpVar = new aurp();
        a = aurpVar;
        aopi.registerDefaultInstance(aurp.class, aurpVar);
    }

    private aurp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000ﰕẘﵺ嫭\u0002\u0000\u0000\u0002ﰕẘᐼ\u0000ﵺ嫭ᐼ\u0000", new Object[]{"c", "b", auro.class, aurn.class});
            case 3:
                return new aurp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aurp.class) {
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
