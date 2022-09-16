package defpackage;
/* compiled from: PG */
/* renamed from: avct  reason: default package */
/* loaded from: classes2.dex */
public final class avct extends aopi implements aoqv {
    public static final avct a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public int e;
    public avcv f;
    private arag h;
    private byte i = 2;
    public aopu d = emptyProtobufList();

    static {
        avct avctVar = new avct();
        a = avctVar;
        aopi.registerDefaultInstance(avct.class, avctVar);
    }

    private avct() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဋ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "h", "d", arag.class, "e", "f"});
            case 3:
                return new avct();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avct.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
