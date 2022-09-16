package defpackage;
/* compiled from: PG */
/* renamed from: asia  reason: default package */
/* loaded from: classes2.dex */
public final class asia extends aopi implements aoqv {
    public static final asia a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public aovs f;
    public int g;
    private byte i = 2;

    static {
        asia asiaVar = new asia();
        a = asiaVar;
        aopi.registerDefaultInstance(asia.class, asiaVar);
    }

    private asia() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ဉ\u0004\u0005ᐉ\u0002\u0006င\u0005", new Object[]{"b", "c", "e", "f", "d", "g"});
            case 3:
                return new asia();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asia.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
