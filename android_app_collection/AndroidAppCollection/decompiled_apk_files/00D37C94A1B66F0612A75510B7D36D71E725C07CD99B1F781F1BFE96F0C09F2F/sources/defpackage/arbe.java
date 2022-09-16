package defpackage;
/* compiled from: PG */
/* renamed from: arbe  reason: default package */
/* loaded from: classes2.dex */
public final class arbe extends aopi implements aoqv {
    public static final arbe a;
    private static volatile aorb l;
    public int b;
    public int c;
    public arag d;
    public arag f;
    public arag g;
    public apzg h;
    public avvz i;
    private aoux m;
    private byte n = 2;
    public String e = "";
    public String j = "";
    public aoob k = aoob.b;

    static {
        arbe arbeVar = new arbe();
        a = arbeVar;
        aopi.registerDefaultInstance(arbe.class, arbeVar);
    }

    private arbe() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0006\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဈ\u0007\tᐉ\b\nည\t", new Object[]{"b", "c", aqyp.q, "d", "e", "f", "g", "h", "i", "j", "m", "k"});
            case 3:
                return new arbe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arbe.class) {
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
