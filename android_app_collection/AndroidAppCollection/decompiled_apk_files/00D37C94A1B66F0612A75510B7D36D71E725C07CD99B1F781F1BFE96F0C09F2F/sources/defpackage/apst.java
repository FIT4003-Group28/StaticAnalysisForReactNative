package defpackage;
/* compiled from: PG */
/* renamed from: apst  reason: default package */
/* loaded from: classes2.dex */
public final class apst extends aopd implements aope {
    public static final apst a;
    private static volatile aorb m;
    public int b;
    public Object d;
    public avhn e;
    public apzg f;
    public aovs h;
    public apss i;
    public arag j;
    private aoux n;
    public int c = 0;
    private byte o = 2;
    public aoob g = aoob.b;
    public String k = "";

    static {
        apst apstVar = new apst();
        a = apstVar;
        aopi.registerDefaultInstance(apst.class, apstVar);
    }

    private apst() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ဿ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ည\u0005\u0006ဉ\u0006\u0007ᐉ\u0007\bᐉ\b\nျ\u0000\u000bဈ\n", new Object[]{"d", "c", "b", "e", apsx.a(), "f", "n", "g", "h", "i", "j", "k"});
            case 3:
                return new apst();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (apst.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
