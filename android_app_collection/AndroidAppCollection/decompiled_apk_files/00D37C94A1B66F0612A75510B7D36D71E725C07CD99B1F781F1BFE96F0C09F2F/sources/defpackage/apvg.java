package defpackage;
/* compiled from: PG */
/* renamed from: apvg  reason: default package */
/* loaded from: classes2.dex */
public final class apvg extends aopi implements aoqv {
    public static final apvg a;
    private static volatile aorb m;
    public int b;
    public Object d;
    public apvi e;
    public arag f;
    public apzg g;
    public aovs h;
    public boolean i;
    public argl j;
    private apzg n;
    private aoux o;
    private aunb p;
    public int c = 0;
    private byte q = 2;
    public String k = "";
    public aoob l = aoob.b;

    static {
        apvg apvgVar = new apvg();
        a = apvgVar;
        aopi.registerDefaultInstance(apvg.class, apvgVar);
    }

    private apvg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\b\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0004ᐉ\u000b\u0005ည\f\u0006ᐼ\u0000\u0007ᐼ\u0000\bဉ\u0007\tဇ\b\nᐉ\t\u000bဈ\n\fᐉ\r\rᐉ\u0005", new Object[]{"d", "c", "b", "e", "f", "g", "o", "l", avhn.class, arhs.class, "h", "i", "j", "k", "p", "n"});
            case 3:
                return new apvg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (apvg.class) {
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
