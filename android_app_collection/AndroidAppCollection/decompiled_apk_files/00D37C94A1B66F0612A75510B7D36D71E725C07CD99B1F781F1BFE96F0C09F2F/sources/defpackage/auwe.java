package defpackage;
/* compiled from: PG */
/* renamed from: auwe  reason: default package */
/* loaded from: classes2.dex */
public final class auwe extends aopi implements aoqv {
    public static final auwe a;
    private static volatile aorb f;
    public int b;
    public boolean d;
    public arag e;
    private byte g = 2;
    public aopu c = emptyProtobufList();

    static {
        auwe auweVar = new auwe();
        a = auweVar;
        aopi.registerDefaultInstance(auwe.class, auweVar);
    }

    private auwe() {
    }

    public final void a() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ဇ\u0000\u0003ᐉ\u0001", new Object[]{"b", "c", auwf.class, "d", "e"});
            case 3:
                return new auwe();
            case 4:
                return new aopa((float[][][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auwe.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
