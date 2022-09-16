package defpackage;
/* compiled from: PG */
/* renamed from: apdm  reason: default package */
/* loaded from: classes.dex */
public final class apdm extends aopi implements aoqv {
    public static final apdm a;
    private static volatile aorb k;
    public int b;
    public int c;
    public avhn d;
    public boolean e;
    public arag f;
    public aunb g;
    public aunb h;
    public apzg i;
    private apzg l;
    private aoux m;
    private byte n = 2;
    public aoob j = aoob.b;

    static {
        apdm apdmVar = new apdm();
        a = apdmVar;
        aopi.registerDefaultInstance(apdm.class, apdmVar);
    }

    private apdm() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0007\u0001ဋ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tည\t\nᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "l", "m", "j", "i"});
            case 3:
                return new apdm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (apdm.class) {
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
