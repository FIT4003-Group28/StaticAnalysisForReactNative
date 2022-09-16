package defpackage;
/* compiled from: PG */
/* renamed from: avtb  reason: default package */
/* loaded from: classes2.dex */
public final class avtb extends aopi implements aoqv {
    public static final avtb a;
    private static volatile aorb g;
    public int b;
    public apzg f;
    private byte h = 2;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        avtb avtbVar = new avtb();
        a = avtbVar;
        aopi.registerDefaultInstance(avtb.class, avtbVar);
    }

    private avtb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0005ᐉ\u0002", new Object[]{"b", "c", "d", auta.class, "e", auta.class, "f"});
            case 3:
                return new avtb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avtb.class) {
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
