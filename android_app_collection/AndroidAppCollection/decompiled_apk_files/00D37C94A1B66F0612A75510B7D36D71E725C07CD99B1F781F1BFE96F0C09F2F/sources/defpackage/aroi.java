package defpackage;
/* compiled from: PG */
/* renamed from: aroi  reason: default package */
/* loaded from: classes2.dex */
public final class aroi extends aopi implements aoqv {
    public static final aroi a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public aopu f = emptyProtobufList();

    static {
        aroi aroiVar = new aroi();
        a = aroiVar;
        aopi.registerDefaultInstance(aroi.class, aroiVar);
    }

    private aroi() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0004ဈ\u0001\u0005\u001c", new Object[]{"b", "c", "e", "d", "f"});
            case 3:
                return new aroi();
            case 4:
                return new aopa((int[][][]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aroi.class) {
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
