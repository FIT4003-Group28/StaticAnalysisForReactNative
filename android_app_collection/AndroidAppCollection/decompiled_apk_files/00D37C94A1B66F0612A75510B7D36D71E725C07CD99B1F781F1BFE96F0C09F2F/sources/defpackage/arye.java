package defpackage;
/* compiled from: PG */
/* renamed from: arye  reason: default package */
/* loaded from: classes2.dex */
public final class arye extends aopi implements aoqv {
    public static final arye a;
    private static volatile aorb h;
    public int b;
    public aroy c;
    public boolean f;
    public int g;
    private byte i = 2;
    public String d = "";
    public aopu e = aopi.emptyProtobufList();

    static {
        arye aryeVar = new arye();
        a = aryeVar;
        aopi.registerDefaultInstance(arye.class, aryeVar);
    }

    private arye() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a\u0006ဌ\u0003", new Object[]{"b", "c", "d", "f", "e", "g", atov.b});
            case 3:
                return new arye();
            case 4:
                return new aopa((boolean[][][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arye.class) {
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
