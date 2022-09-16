package defpackage;
/* compiled from: PG */
/* renamed from: aqza  reason: default package */
/* loaded from: classes2.dex */
public final class aqza extends aopi implements aoqv {
    public static final aqza a;
    private static volatile aorb h;
    public int b;
    public aunb d;
    public apzg g;
    private byte i = 2;
    public String c = "";
    public aopu e = emptyProtobufList();
    public String f = "";

    static {
        aqza aqzaVar = new aqza();
        a = aqzaVar;
        aopi.registerDefaultInstance(aqza.class, aqzaVar);
    }

    private aqza() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", aunb.class, "f", "g"});
            case 3:
                return new aqza();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqza.class) {
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
