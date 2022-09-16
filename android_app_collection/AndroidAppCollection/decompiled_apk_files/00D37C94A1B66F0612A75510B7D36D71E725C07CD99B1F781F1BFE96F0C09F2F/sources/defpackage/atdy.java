package defpackage;
/* compiled from: PG */
/* renamed from: atdy  reason: default package */
/* loaded from: classes2.dex */
public final class atdy extends aopi implements aoqv {
    public static final atdy a;
    private static volatile aorb o;
    public int b;
    public aqwr c;
    public attv d;
    public apmv e;
    public aujv f;
    public atvq g;
    public aqww h;
    public apfk i;
    public apmu j;
    public atdz k;
    public atxv l;
    public aujo m;
    public aunw n;
    private byte p = 2;

    static {
        atdy atdyVar = new atdy();
        a = atdyVar;
        aopi.registerDefaultInstance(atdy.class, atdyVar);
    }

    private atdy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\uee52喠\f\u0000\u0000\u0001\u0002ဉ\u000b\u0003ဉ\f\u0004ဉ\r\u0005ဉ\u000e\u0006ဉ\u000f麗䉳ဉ\u0001\ue99c䗄ᐉ\u0002ﺕ䠈ဉ\u0005\uee53䬕ဉ\u0007\ue0b1䭝ဉ\u0006\ue536冡ဉ\b\uee52喠ဉ\n", new Object[]{"b", "j", "k", "l", "m", "n", "c", "d", "e", "g", "f", "h", "i"});
            case 3:
                return new atdy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (atdy.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
