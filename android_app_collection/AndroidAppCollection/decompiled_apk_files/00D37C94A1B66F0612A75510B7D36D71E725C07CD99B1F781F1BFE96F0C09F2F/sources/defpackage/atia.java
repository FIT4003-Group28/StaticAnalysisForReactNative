package defpackage;
/* compiled from: PG */
/* renamed from: atia  reason: default package */
/* loaded from: classes2.dex */
public final class atia extends aopi implements aoqv {
    public static final atia a;
    private static volatile aorb g;
    public int b;
    public boolean e;
    public aqls f;
    private arag h;
    private aoux i;
    private apzg j;
    private aunb k;
    private byte l = 2;
    public aoob c = aoob.b;
    public aopu d = emptyProtobufList();

    static {
        atia atiaVar = new atia();
        a = atiaVar;
        aopi.registerDefaultInstance(atia.class, atiaVar);
    }

    private atia() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004Л\u0006ဇ\u0005\u0007ᐉ\u0003\bᐉ\u0007\tᐉ\u0006", new Object[]{"b", "h", "i", "c", "d", athz.class, "e", "j", "k", "f"});
            case 3:
                return new atia();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (atia.class) {
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
