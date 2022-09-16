package defpackage;
/* compiled from: PG */
/* renamed from: auys  reason: default package */
/* loaded from: classes2.dex */
public final class auys extends aopi implements aoqv {
    public static final auys a;
    private static volatile aorb e;
    public int b;
    public arag c;
    private byte f = 2;
    public aopu d = emptyProtobufList();

    static {
        auys auysVar = new auys();
        a = auysVar;
        aopi.registerDefaultInstance(auys.class, auysVar);
    }

    private auys() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"b", "d", aunb.class, "c"});
            case 3:
                return new auys();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auys.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
