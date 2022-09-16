package defpackage;
/* compiled from: PG */
/* renamed from: aucd  reason: default package */
/* loaded from: classes2.dex */
public final class aucd extends aopd implements aope {
    public static final aucd a;
    private static volatile aorb i;
    public int b;
    public arag d;
    public int e;
    public arhs f;
    public apzg g;
    public apzg h;
    private arag j;
    private aueo k;
    private aoux m;
    private byte n = 2;
    public String c = "";

    static {
        aucd aucdVar = new aucd();
        a = aucdVar;
        aopi.registerDefaultInstance(aucd.class, aucdVar);
    }

    private aucd() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\u0006\nᐉ\t", new Object[]{"b", "c", "d", "j", "e", auca.c, "f", "g", "h", "k", "m"});
            case 3:
                return new aucd();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aucd.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
