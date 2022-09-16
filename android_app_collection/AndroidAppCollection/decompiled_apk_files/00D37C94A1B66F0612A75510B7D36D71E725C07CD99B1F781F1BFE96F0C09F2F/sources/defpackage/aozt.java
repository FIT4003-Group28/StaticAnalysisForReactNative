package defpackage;
/* compiled from: PG */
/* renamed from: aozt  reason: default package */
/* loaded from: classes.dex */
public final class aozt extends aopi implements aoqv {
    public static final aozt a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public apzg f;
    public avhn g;
    public aozu h;
    public apzg i;
    private arag k;
    private apzg l;
    private apzg m;
    private byte n = 2;

    static {
        aozt aoztVar = new aozt();
        a = aoztVar;
        aopi.registerDefaultInstance(aozt.class, aoztVar);
    }

    private aozt() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0006\u0005ᐉ\u000b\tᐉ\r\nᐉ\u000e\u000bᐉ\u000f\fᐉ\u0002\u0010ᐉ\t", new Object[]{"b", "c", "e", "f", "g", "l", "h", "i", "m", "d", "k"});
            case 3:
                return new aozt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aozt.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
