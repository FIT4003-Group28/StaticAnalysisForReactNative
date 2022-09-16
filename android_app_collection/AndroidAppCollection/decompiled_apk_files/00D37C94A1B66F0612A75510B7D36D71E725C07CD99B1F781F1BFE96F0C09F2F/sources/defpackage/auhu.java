package defpackage;
/* compiled from: PG */
/* renamed from: auhu  reason: default package */
/* loaded from: classes2.dex */
public final class auhu extends aopi implements aoqv {
    public static final auhu a;
    private static volatile aorb k;
    public int b;
    public auhs c;
    public auht d;
    public aozy f;
    public boolean i;
    public boolean j;
    private aoux l;
    private byte m = 2;
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;
    public String h = "";

    static {
        auhu auhuVar = new auhu();
        a = auhuVar;
        aopi.registerDefaultInstance(auhu.class, auhuVar);
    }

    private auhu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ဈ\u0005\bဇ\u0006\tဇ\u0007", new Object[]{"b", "c", "d", "e", auih.class, "f", "l", "g", "h", "i", "j"});
            case 3:
                return new auhu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (auhu.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
