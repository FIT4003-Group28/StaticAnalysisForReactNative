package defpackage;
/* compiled from: PG */
/* renamed from: arzw  reason: default package */
/* loaded from: classes2.dex */
public final class arzw extends aopi implements aoqv {
    public static final arzw a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arzw arzwVar = new arzw();
        a = arzwVar;
        aopi.registerDefaultInstance(arzw.class, arzwVar);
    }

    private arzw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf608㹗\uf608㹗\u0001\u0000\u0000\u0001\uf608㹗ᐼ\u0000", new Object[]{"c", "b", atuq.class});
            case 3:
                return new arzw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arzw.class) {
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
