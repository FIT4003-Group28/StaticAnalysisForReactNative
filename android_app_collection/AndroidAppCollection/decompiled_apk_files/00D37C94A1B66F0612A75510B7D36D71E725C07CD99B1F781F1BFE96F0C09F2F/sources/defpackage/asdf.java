package defpackage;
/* compiled from: PG */
/* renamed from: asdf  reason: default package */
/* loaded from: classes2.dex */
public final class asdf extends aopi implements aoqv {
    public static final asdf a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public ator g;
    private byte i = 2;
    public aopu d = aopi.emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        asdf asdfVar = new asdf();
        a = asdfVar;
        aopi.registerDefaultInstance(asdf.class, asdfVar);
    }

    private asdf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new asdf();
            case 4:
                return new aopa((char[][][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asdf.class) {
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
