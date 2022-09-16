package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awdp  reason: default package */
/* loaded from: classes2.dex */
public final class awdp extends aopi implements aoqv {
    public static final awdp a;
    private static volatile aorb h;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public apzg g;
    private aoux i;
    private byte j = 2;

    static {
        awdp awdpVar = new awdp();
        a = awdpVar;
        aopi.registerDefaultInstance(awdp.class, awdpVar);
    }

    private awdp() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", "i", "f"});
            case 3:
                return new awdp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awdp.class) {
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
