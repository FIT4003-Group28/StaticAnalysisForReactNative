package defpackage;
/* compiled from: PG */
/* renamed from: aqak  reason: default package */
/* loaded from: classes2.dex */
public final class aqak extends aopi implements aoqv {
    public static final aqak a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public apok f;
    public apok g;
    public aunb h;
    public aunb j;
    public boolean k;
    private apok m;
    private arag n;
    private byte o = 2;
    public String i = "";

    static {
        aqak aqakVar = new aqak();
        a = aqakVar;
        aopi.registerDefaultInstance(aqak.class, aqakVar);
    }

    private aqak() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0001\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\u0007\u000bဈ\b\fᐉ\t\rဇ\n", new Object[]{"b", "c", "e", "f", "m", "d", "n", "g", "h", "i", "j", "k"});
            case 3:
                return new aqak();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aqak.class) {
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
