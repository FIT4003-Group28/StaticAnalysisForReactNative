package defpackage;
/* compiled from: PG */
/* renamed from: avsz  reason: default package */
/* loaded from: classes2.dex */
public final class avsz extends aopi implements aoqv {
    public static final avsz a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    private byte h = 2;
    public String d = "";
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();

    static {
        avsz avszVar = new avsz();
        a = avszVar;
        aopi.registerDefaultInstance(avsz.class, avszVar);
    }

    private avsz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", "e", auta.class, "f", auta.class});
            case 3:
                return new avsz();
            case 4:
                return new aopa((byte[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avsz.class) {
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
