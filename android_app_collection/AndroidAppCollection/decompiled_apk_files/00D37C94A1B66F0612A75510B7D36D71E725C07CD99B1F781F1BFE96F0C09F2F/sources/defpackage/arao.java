package defpackage;
/* compiled from: PG */
/* renamed from: arao  reason: default package */
/* loaded from: classes2.dex */
public final class arao extends aopi implements aoqv {
    public static final arao a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public arag e;
    public arag f;
    public apzg g;
    public asir h;
    private aoux m;
    private byte n = 2;
    public aopu d = emptyProtobufList();
    public String i = "";
    public String j = "";
    public aoob k = aoob.b;

    static {
        arao araoVar = new arao();
        a = araoVar;
        aopi.registerDefaultInstance(arao.class, araoVar);
    }

    private arao() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ဉ\u0004\u0007ဈ\u0005\bဈ\u0006\tᐉ\u0007\nည\b", new Object[]{"b", "c", "d", aran.class, "e", "f", "g", "h", "i", "j", "m", "k"});
            case 3:
                return new arao();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arao.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
