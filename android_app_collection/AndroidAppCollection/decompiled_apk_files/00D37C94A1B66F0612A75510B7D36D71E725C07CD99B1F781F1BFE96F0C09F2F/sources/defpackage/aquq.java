package defpackage;
/* compiled from: PG */
/* renamed from: aquq  reason: default package */
/* loaded from: classes2.dex */
public final class aquq extends aopi implements aoqv {
    public static final aquq a;
    private static volatile aorb h;
    public int b;
    public arag d;
    public aoux f;
    private byte i = 2;
    public String c = "";
    public aopu e = aopi.emptyProtobufList();
    public aoob g = aoob.b;

    static {
        aquq aquqVar = new aquq();
        a = aquqVar;
        aopi.registerDefaultInstance(aquq.class, aquqVar);
    }

    private aquq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003\u001a\u0004ᐉ\u0002\u0005ည\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aquq();
            case 4:
                return new aopa((char[][][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aquq.class) {
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
