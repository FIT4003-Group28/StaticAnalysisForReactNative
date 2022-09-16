package defpackage;
/* compiled from: PG */
/* renamed from: asem  reason: default package */
/* loaded from: classes2.dex */
public final class asem extends aopi implements aoqv {
    public static final asem a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public asei e;
    public asek f;
    public asel g;
    private byte i = 2;
    public String d = "";

    static {
        asem asemVar = new asem();
        a = asemVar;
        aopi.registerDefaultInstance(asem.class, asemVar);
    }

    private asem() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\tဉ\u0007\fဉ\n\u0010ဉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new asem();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asem.class) {
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
