package defpackage;
/* compiled from: PG */
/* renamed from: aurh  reason: default package */
/* loaded from: classes2.dex */
public final class aurh extends aopi implements aoqv {
    public static final aurh a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public int e;
    private arag h;
    private aoux i;
    private byte j = 2;
    public aopu d = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        aurh aurhVar = new aurh();
        a = aurhVar;
        aopi.registerDefaultInstance(aurh.class, aurhVar);
    }

    private aurh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0001\u0004\u0002ᐉ\u0000\u0003Л\u0004ဌ\u0003\u0006ᐉ\u0001\bᐉ\u0005\tည\u0006", new Object[]{"b", "c", "d", auri.class, "e", aupm.k, "h", "i", "f"});
            case 3:
                return new aurh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aurh.class) {
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
