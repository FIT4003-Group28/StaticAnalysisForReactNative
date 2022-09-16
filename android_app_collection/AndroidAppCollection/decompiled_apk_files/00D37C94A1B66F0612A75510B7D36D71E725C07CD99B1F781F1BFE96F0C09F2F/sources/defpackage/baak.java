package defpackage;
/* compiled from: PG */
/* renamed from: baak  reason: default package */
/* loaded from: classes2.dex */
public final class baak extends aopi implements aoqv {
    public static final baak a;
    private static volatile aorb m;
    public int b;
    public boolean c;
    public baag d;
    public int g;
    public long h;
    public long i;
    public angl k;
    public aoug l;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public String j = "";

    static {
        baak baakVar = new baak();
        a = baakVar;
        aopi.registerDefaultInstance(baak.class, baakVar);
    }

    private baak() {
    }

    public static /* synthetic */ void a(baak baakVar) {
        baakVar.b |= 1;
        baakVar.c = true;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006စ\u0005\u0007ဈ\u0007\bစ\u0006\tᐉ\b\nဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", baat.b, "h", "j", "i", "k", "l"});
            case 3:
                return new baak();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (baak.class) {
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
