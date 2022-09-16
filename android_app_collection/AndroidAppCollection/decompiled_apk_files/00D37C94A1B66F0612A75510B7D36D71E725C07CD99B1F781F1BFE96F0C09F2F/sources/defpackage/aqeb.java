package defpackage;
/* compiled from: PG */
/* renamed from: aqeb  reason: default package */
/* loaded from: classes2.dex */
public final class aqeb extends aopi implements aoqv {
    public static final aqeb a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public avhn f;
    public apzg g;
    public arag h;
    public arag i;
    public apok j;
    private apmg m;
    private arag n;
    private aoux o;
    private byte p = 2;
    public aoob k = aoob.b;

    static {
        aqeb aqebVar = new aqeb();
        a = aqebVar;
        aopi.registerDefaultInstance(aqeb.class, aqebVar);
    }

    private aqeb() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\t\u0007ᐉ\n\bည\u000b\tᐉ\u0003\nᐉ\u0007\u000bᐉ\b\fᐉ\u0001", new Object[]{"b", "c", "e", "g", "m", "h", "j", "o", "k", "f", "n", "i", "d"});
            case 3:
                return new aqeb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aqeb.class) {
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
