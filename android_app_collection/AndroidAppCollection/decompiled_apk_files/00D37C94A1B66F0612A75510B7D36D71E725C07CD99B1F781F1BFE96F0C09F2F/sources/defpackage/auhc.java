package defpackage;
/* compiled from: PG */
/* renamed from: auhc  reason: default package */
/* loaded from: classes2.dex */
public final class auhc extends aopi implements aoqv {
    public static final auhc a;
    private static volatile aorb g;
    public int b;
    public boolean c;
    public apzg e;
    public apzg f;
    private byte h = 2;
    public aopu d = emptyProtobufList();

    static {
        auhc auhcVar = new auhc();
        a = auhcVar;
        aopi.registerDefaultInstance(auhc.class, auhcVar);
    }

    private auhc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0003\u0002ဇ\u0001\u0003Л\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", apzg.class, "e", "f"});
            case 3:
                return new auhc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (auhc.class) {
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
