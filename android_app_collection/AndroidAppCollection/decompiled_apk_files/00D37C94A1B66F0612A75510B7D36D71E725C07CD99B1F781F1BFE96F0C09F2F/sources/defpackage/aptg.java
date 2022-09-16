package defpackage;
/* compiled from: PG */
/* renamed from: aptg  reason: default package */
/* loaded from: classes2.dex */
public final class aptg extends aopi implements aoqv {
    public static final aptg a;
    private static volatile aorb e;
    public int b;
    public atof c;
    public aumx d;
    private byte f = 2;

    static {
        aptg aptgVar = new aptg();
        a = aptgVar;
        aopi.registerDefaultInstance(aptg.class, aptgVar);
    }

    private aptg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ueee9ᣑ\uf697᳗\u0002\u0000\u0000\u0002\ueee9ᣑᐉ\u0000\uf697᳗ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aptg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aptg.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
