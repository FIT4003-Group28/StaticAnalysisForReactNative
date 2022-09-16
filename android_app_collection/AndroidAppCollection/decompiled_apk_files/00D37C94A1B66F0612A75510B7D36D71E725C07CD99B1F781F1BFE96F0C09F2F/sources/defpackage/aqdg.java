package defpackage;
/* compiled from: PG */
/* renamed from: aqdg  reason: default package */
/* loaded from: classes2.dex */
public final class aqdg extends aopi implements aoqv {
    public static final aqdg a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public arag d;
    public aqdh e;
    public avhn f;
    public avhn g;
    public apzg h;
    public aqdf i;
    public asos j;
    public aunb l;
    private arag n;
    private aoux o;
    private arag p;
    private byte q = 2;
    public aoob k = aoob.b;

    static {
        aqdg aqdgVar = new aqdg();
        a = aqdgVar;
        aopi.registerDefaultInstance(aqdg.class, aqdgVar);
    }

    private aqdg() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဉ\u0007\nဉ\b\u000bᐉ\t\fည\n\rᐉ\u000b\u000eᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "n", "i", "j", "o", "k", "l", "p"});
            case 3:
                return new aqdg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqdg.class) {
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
