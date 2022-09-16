package defpackage;
/* compiled from: PG */
/* renamed from: autf  reason: default package */
/* loaded from: classes2.dex */
public final class autf extends aopi implements aoqv {
    public static final autf a;
    private static volatile aorb h;
    public int b;
    public int c;
    public arag d;
    public avhn e;
    public apzg f;
    private apzg i;
    private aoux j;
    private byte k = 2;
    public aoob g = aoob.b;

    static {
        autf autfVar = new autf();
        a = autfVar;
        aopi.registerDefaultInstance(autf.class, autfVar);
    }

    private autf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0005\u0001င\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0003\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "f", "i", "e", "j", "g"});
            case 3:
                return new autf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (autf.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
