package defpackage;
/* compiled from: PG */
/* renamed from: aurk  reason: default package */
/* loaded from: classes2.dex */
public final class aurk extends aopi implements aoqv {
    public static final aurk a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public int e;
    private arag h;
    private apzg i;
    private aoux j;
    private byte k = 2;
    private String g = "";
    public aopu d = emptyProtobufList();

    static {
        aurk aurkVar = new aurk();
        a = aurkVar;
        aopi.registerDefaultInstance(aurk.class, aurkVar);
    }

    private aurk() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0005\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004Л\u0006ဌ\u0005\u0007ဈ\u0000\bᐉ\u0006", new Object[]{"b", "c", "h", "i", "d", auri.class, "e", aupm.l, "g", "j"});
            case 3:
                return new aurk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aurk.class) {
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
