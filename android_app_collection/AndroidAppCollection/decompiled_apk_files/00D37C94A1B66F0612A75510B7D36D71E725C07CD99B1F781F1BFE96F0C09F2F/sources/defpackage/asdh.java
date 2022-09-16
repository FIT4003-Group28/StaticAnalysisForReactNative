package defpackage;
/* compiled from: PG */
/* renamed from: asdh  reason: default package */
/* loaded from: classes2.dex */
public final class asdh extends aopi implements aoqv {
    public static final asdh a;
    private static volatile aorb g;
    public int b;
    public aroy c;
    private byte h = 2;
    public aopu d = aopi.emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        asdh asdhVar = new asdh();
        a = asdhVar;
        aopi.registerDefaultInstance(asdh.class, asdhVar);
    }

    private asdh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asdh();
            case 4:
                return new aopa((char[][][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asdh.class) {
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
